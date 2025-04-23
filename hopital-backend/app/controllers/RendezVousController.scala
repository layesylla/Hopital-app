package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import scala.concurrent.{ExecutionContext, Future}
import models._
import services.RendezVousService

@Singleton
class RendezVousController @Inject()(cc: ControllerComponents, service: RendezVousService)(implicit ec: ExecutionContext) extends AbstractController(cc) {
  implicit val format: OFormat[RendezVous] = Json.format[RendezVous]

  def list = Action.async {
    service.list.map(r => Ok(Json.toJson(r)))
  }

  def create = Action(parse.json).async { request =>
    request.body.validate[RendezVous].fold(
      _ => Future.successful(BadRequest("Invalid JSON")),
      r => service.create(r).map(_ => Created(Json.toJson(r)))
    )
  }

  def get(id: Long) = Action.async {
    service.get(id).map {
      case Some(r) => Ok(Json.toJson(r))
      case None => NotFound
    }
  }

  def update(id: Long) = Action(parse.json).async { request =>
    request.body.validate[RendezVous].fold(
      _ => Future.successful(BadRequest("Invalid JSON")),
      r => service.update(id, r).map {
        case Some(updated) => Ok(Json.toJson(updated))
        case None => NotFound
      }
    )
  }

  def delete(id: Long) = Action.async {
    service.delete(id).map {
      case true => NoContent
      case false => NotFound
    }
  }
}
