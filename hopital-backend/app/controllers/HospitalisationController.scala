package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import scala.concurrent.{ExecutionContext, Future}
import models._
import services.HospitalisationService

@Singleton
class HospitalisationController @Inject()(cc: ControllerComponents, service: HospitalisationService)(implicit ec: ExecutionContext) extends AbstractController(cc) {
  implicit val format: OFormat[Hospitalisation] = Json.format[Hospitalisation]

  def list = Action.async {
    service.list.map(h => Ok(Json.toJson(h)))
  }

  def create = Action(parse.json).async { request =>
    request.body.validate[Hospitalisation].fold(
      _ => Future.successful(BadRequest("Invalid JSON")),
      h => service.create(h).map(_ => Created(Json.toJson(h)))
    )
  }

  def get(id: Long) = Action.async {
    service.get(id).map {
      case Some(h) => Ok(Json.toJson(h))
      case None => NotFound
    }
  }

  def update(id: Long) = Action(parse.json).async { request =>
    request.body.validate[Hospitalisation].fold(
      _ => Future.successful(BadRequest("Invalid JSON")),
      h => service.update(id, h).map {
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
