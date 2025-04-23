package controllers

import javax.inject._
import play.api.mvc._
import scala.concurrent.{ExecutionContext, Future}
import play.api.libs.json._
import models._
import services.InfirmierService

@Singleton
class InfirmierController @Inject()(cc: ControllerComponents, service: InfirmierService)(implicit ec: ExecutionContext) extends AbstractController(cc) {
  implicit val format:OFormat[Infirmier] = Json.format[Infirmier]

  def list = Action.async {
    service.listAll.map(r => Ok(Json.toJson(r)))
  }

  def create = Action(parse.json).async { request =>
    request.body.validate[Infirmier].fold(
      _ => Future.successful(BadRequest("JSON invalide")),
      i => service.create(i).map(_ => Created(Json.toJson(i)))
    )
  }

  def get(id: Long) = Action.async {
    service.get(id).map {
      case Some(i) => Ok(Json.toJson(i))
      case None    => NotFound
    }
  }

  def update(id: Long) = Action(parse.json).async { request =>
    request.body.validate[Infirmier].fold(
      _ => Future.successful(BadRequest("Format JSON invalide")),
      i => service.update(id, i).map {
        case Some(updated) => Ok(Json.toJson(updated))
        case None          => NotFound
      }
    )
  }

  def delete(id: Long) = Action.async {
    service.delete(id).map(_ => NoContent)
  }
}
