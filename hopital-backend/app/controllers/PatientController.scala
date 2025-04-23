package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json._
import scala.concurrent.{ExecutionContext, Future}
import models._
import services.PatientService

@Singleton
class PatientController @Inject()(cc: ControllerComponents, service: PatientService)(implicit ec: ExecutionContext)
  extends AbstractController(cc) {

  implicit val patientFormat: OFormat[Patient] = Json.format[Patient]


  def listPatients = Action.async {
    service.listAll.map(p => Ok(Json.toJson(p)))

  }

  def createPatient = Action(parse.json).async { request =>
    request.body.validate[Patient].fold(
      _ => Future.successful(BadRequest),
      patient => service.create(patient).map(_ => Created(Json.toJson(patient)))
    )
  }

  def getPatient(id: Long) = Action.async {
    service.get(id).map {
      case Some(patient) => Ok(Json.toJson(patient))
      case None => NotFound
    }
  }

  def updatePatient(id: Long) = Action(parse.json).async { request =>
    request.body.validate[Patient].fold(
      _ => Future.successful(BadRequest),
      data => service.update(id, data).map {
        case Some(updated) => Ok(Json.toJson(updated))
        case None => NotFound
      }
    )
  }

 def deletePatient(id: Long) = Action.async {
  service.delete(id).map {
    case 0 => NotFound
    case _ => NoContent
  }
}


  def searchPatient(nom: String) = Action.async {
  service.searchByName(nom).map(result => Ok(Json.toJson(result)))
}

}