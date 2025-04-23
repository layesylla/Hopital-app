package controllers

import javax.inject._
import play.api.mvc._
import scala.concurrent.{ExecutionContext, Future}
import play.api.libs.json._
import models._
import services.MaterielService

@Singleton
class MaterielController @Inject()(cc: ControllerComponents, service: MaterielService)(implicit ec: ExecutionContext) extends AbstractController(cc) {
  implicit val format = Json.format[Materiel]

  def list = Action.async {
    service.listAll.map(r => Ok(Json.toJson(r)))
  }

  def create = Action(parse.json).async { request =>
    request.body.validate[Materiel].fold(
      _ => Future.successful(BadRequest("JSON invalide")),
      m => service.create(m).map(_ => Created(Json.toJson(m)))
    )
  }

  def get(id: Long) = Action.async {
    service.get(id).map {
      case Some(m) => Ok(Json.toJson(m))
      case None    => NotFound
    }
  }

  def update(id: Long) = Action(parse.json).async { request =>
    request.body.validate[Materiel].fold(
      _ => Future.successful(BadRequest("Format JSON invalide")),
      m => service.update(id, m).map {
        case Some(updated) => Ok(Json.toJson(updated))
        case None          => NotFound
      }
    )
  }

  def delete(id: Long) = Action.async {
    service.delete(id).map(_ => NoContent)
  }
}
