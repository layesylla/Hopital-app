package services

import javax.inject._
import scala.concurrent.{ExecutionContext, Future}
import models._
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile.api._

@Singleton
class MaterielService @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val db = dbConfigProvider.get[JdbcProfile].db
  private val materiels = TableQuery[Materiels]

  def listAll: Future[Seq[Materiel]] = db.run(materiels.result)

  def create(m: Materiel): Future[Int] = db.run(materiels += m)

  def get(id: Long): Future[Option[Materiel]] =
    db.run(materiels.filter(_.id === id).result.headOption)

  def update(id: Long, materiel: Materiel): Future[Option[Materiel]] = {
    val updated = materiel.copy(id = id)
    db.run(materiels.filter(_.id === id).update(updated)).map {
      case 0 => None
      case _ => Some(updated)
    }
  }

  def delete(id: Long): Future[Int] = db.run(materiels.filter(_.id === id).delete)
}
