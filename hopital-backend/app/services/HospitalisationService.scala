package services

import javax.inject._
import models._
import scala.concurrent.{ExecutionContext, Future}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile.api._

@Singleton
class HospitalisationService @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val db = dbConfigProvider.get[JdbcProfile].db
  private val hospitalisations = TableQuery[Hospitalisations]

  def list: Future[Seq[Hospitalisation]] = db.run(hospitalisations.result)

  def create(h: Hospitalisation): Future[Int] = db.run(hospitalisations += h)

  def get(id: Long): Future[Option[Hospitalisation]] = db.run(hospitalisations.filter(_.id === id).result.headOption)

  def update(id: Long, updated: Hospitalisation): Future[Option[Hospitalisation]] = {
    val h = updated.copy(id = Some(id))
    db.run(hospitalisations.filter(_.id === id).update(h)).map {
      case 0 => None
      case _ => Some(h)
    }
  }

  def delete(id: Long): Future[Boolean] =
    db.run(hospitalisations.filter(_.id === id).delete).map(_ > 0)
}
