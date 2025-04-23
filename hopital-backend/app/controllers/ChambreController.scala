package controllers

import play.api.mvc._
import javax.inject._
import scala.concurrent.{ExecutionContext, Future}
import models._
import services.ChambreService
import play.api.libs.json._

@Singleton
class ChambreController @Inject()(cc: ControllerComponents, service: ChambreService)(implicit ec: ExecutionContext) extends AbstractController(cc) {

  implicit val format = Json.format[Chambre]

  def list = Action.async {
    service.listAll.map(chambres => Ok(Json.toJson(chambres)))
  }

  def create = Action(parse.json).async { request =>
    request.body.validate[Chambre].fold(
      _ => Future.successful(BadRequest("Format JSON invalide")),
      chambre => service.create(chambre).map(_ => Created(Json.toJson(chambre)))
    )
  }

  def update(id: Long) = Action(parse.json).async { request =>
    request.body.validate[Chambre].fold(
      _ => Future.successful(BadRequest("Format JSON invalide")),
      chambreData => {
        service.update(id, chambreData).map {
          case Some(updated) => Ok(Json.toJson(updated))
          case None => NotFound(s"Aucune chambre avec l'id $id")
        }
      }
    )
  }

  def get(id: Long) = Action.async {
    service.get(id).map {
      case Some(chambre) => Ok(Json.toJson(chambre))
      case None => NotFound(s"Aucune chambre trouvée avec l'id $id")
    }
  }

  def delete(id: Long) = Action.async {
    service.delete(id).map {
      case true => NoContent
      case false => NotFound(s"Suppression échouée, chambre $id introuvable")
    }
  }
}
