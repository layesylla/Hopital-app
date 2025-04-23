package services

import javax.inject._
import models._
import scala.concurrent.{ExecutionContext, Future}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile.api._

@Singleton
class PatientService @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val db = dbConfigProvider.get[JdbcProfile].db
  private val patients = TableQuery[Patients]

  def listAll: Future[Seq[Patient]] = db.run(patients.result)

  def create(p: Patient): Future[Int] = db.run(patients += p)

  def get(id: Long): Future[Option[Patient]] =
    db.run(patients.filter(_.id === id).result.headOption)

  def update(id: Long, patient: Patient): Future[Option[Patient]] = {
    val updated = patient.copy(id = id)
    db.run(patients.filter(_.id === id).update(updated)).map {
      case 0 => None
      case _ => Some(updated)
    }
  }
  def searchByName(nom: String): Future[Seq[Patient]] = {
  db.run(patients.filter(_.nom like s"%$nom%").result)
}


  def delete(id: Long): Future[Int] = db.run(patients.filter(_.id === id).delete)
}
