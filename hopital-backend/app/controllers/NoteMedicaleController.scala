package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import scala.concurrent.{ExecutionContext, Future}
import models._
import services.NoteMedicaleService

@Singleton
class NoteMedicaleController @Inject()(cc: ControllerComponents, service: NoteMedicaleService)(implicit ec: ExecutionContext) extends AbstractController(cc) {
  implicit val format: OFormat[NoteMedicale] = Json.format[NoteMedicale]

  def list = Action.async {
    service.list.map(r => Ok(Json.toJson(r)))
  }

  def create = Action(parse.json).async { request =>
    request.body.validate[NoteMedicale].fold(
      _ => Future.successful(BadRequest("Invalid JSON")),
      n => service.create(n).map(_ => Created(Json.toJson(n)))
    )
  }

  def get(id: Long) = Action.async {
    service.get(id).map {
      case Some(n) => Ok(Json.toJson(n))
      case None => NotFound
    }
  }

  def update(id: Long) = Action(parse.json).async { request =>
    request.body.validate[NoteMedicale].fold(
      _ => Future.successful(BadRequest("Invalid JSON")),
      n => service.update(id, n).map {
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
