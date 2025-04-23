package controllers

import javax.inject._
import play.api.mvc._
import scala.concurrent.{ExecutionContext, Future}
import play.api.libs.json._
import models._
import services.PaiementService

@Singleton
class PaiementController @Inject()(cc: ControllerComponents, service: PaiementService)(implicit ec: ExecutionContext) extends AbstractController(cc) {
  implicit val format: OFormat[Paiement] = Json.format[Paiement]


  def list = Action.async {
    service.listAll.map(p => Ok(Json.toJson(p)))
  }

  def create = Action(parse.json).async { request =>
    request.body.validate[Paiement].fold(
      _ => Future.successful(BadRequest("JSON Invalide")),
      p => service.create(p).map(_ => Created(Json.toJson(p)))
    )
  }

  def get(id: Long) = Action.async {
    service.get(id).map {
      case Some(p) => Ok(Json.toJson(p))
      case None    => NotFound
    }
  }

  def update(id: Long) = Action(parse.json).async { request =>
    request.body.validate[Paiement].fold(
      _ => Future.successful(BadRequest("Format JSON invalide")),
      p => service.update(id, p).map {
        case Some(updated) => Ok(Json.toJson(updated))
        case None          => NotFound
      }
    )
  }

  def delete(id: Long) = Action.async {
    service.delete(id).map(_ => NoContent)
  }
}
