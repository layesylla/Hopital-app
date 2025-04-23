package services

import javax.inject._
import models._
import scala.concurrent.{ExecutionContext, Future}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile.api._

@Singleton
class MedecinService @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val db = dbConfigProvider.get[JdbcProfile].db
  private val medecins = TableQuery[Medecins]

  def listAll: Future[Seq[Medecin]] = db.run(medecins.result)

  def create(m: Medecin): Future[Int] = db.run(medecins += m)

  def get(id: Long): Future[Option[Medecin]] =
    db.run(medecins.filter(_.id === id).result.headOption)

  def update(id: Long, medecin: Medecin): Future[Option[Medecin]] = {
    val updated = medecin.copy(id = id)
    db.run(medecins.filter(_.id === id).update(updated)).map {
      case 0 => None
      case _ => Some(updated)
    }
  }
  def getById(id: Long): Future[Option[Medecin]] = {
  db.run(medecins.filter(_.id === id).result.headOption)
}

  

  def delete(id: Long): Future[Int] = db.run(medecins.filter(_.id === id).delete)
}
