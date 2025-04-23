package controllers

import play.api.mvc._
import javax.inject._
import scala.concurrent.{ExecutionContext, Future}
import models._
import services.MedecinService
import play.api.libs.json._

@Singleton
class MedecinController @Inject()(cc: ControllerComponents, service: MedecinService)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {

  implicit val format: OFormat[Medecin] = Json.format[Medecin]


  def listMedecins = Action.async {
    service.listAll.map(m => Ok(Json.toJson(m)))
  }

  def createMedecin = Action(parse.json).async { request =>
    request.body.validate[Medecin].fold(
      _ => Future.successful(BadRequest("Format JSON invalide")),
      medecin => service.create(medecin).map(_ => Created(Json.toJson(medecin)))
    )
  }

  def getMedecin(id: Long) = Action.async {
    service.getById(id).map {
      case Some(medecin) => Ok(Json.toJson(medecin))
      case None          => NotFound(s"Aucun médecin avec l'id $id")
    }
  }

  def updateMedecin(id: Long) = Action(parse.json).async { request =>
    request.body.validate[Medecin].fold(
      _ => Future.successful(BadRequest("Format JSON invalide")),
      medecin => service.update(id, medecin).map {
        case Some(updated) => Ok(Json.toJson(updated))
        case None          => NotFound(s"Aucun médecin avec l'id $id")
      }
    )
  }

  def deleteMedecin(id: Long) = Action.async {
  service.delete(id).map {
    case 0 => NotFound(s"Médecin $id non trouvé")
    case _ => Ok(s"Médecin $id supprimé")
  }
}

}
