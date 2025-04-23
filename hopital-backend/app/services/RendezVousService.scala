package services

import javax.inject._
import models._
import scala.concurrent.{ExecutionContext, Future}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile.api._

@Singleton
class RendezVousService @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val db = dbConfigProvider.get[JdbcProfile].db
  private val rdvs = TableQuery[RendezVousTable]

  def list: Future[Seq[RendezVous]] = db.run(rdvs.result)
  def create(r: RendezVous): Future[Int] = db.run(rdvs += r)
  def get(id: Long): Future[Option[RendezVous]] = db.run(rdvs.filter(_.id === id).result.headOption)
  def update(id: Long, r: RendezVous): Future[Option[RendezVous]] = {
    val rdv = r.copy(id = Some(id))
    db.run(rdvs.filter(_.id === id).update(rdv)).map {
      case 0 => None
      case _ => Some(rdv)
    }
  }
  def delete(id: Long): Future[Boolean] = db.run(rdvs.filter(_.id === id).delete).map(_ > 0)
}
