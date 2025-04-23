package services

import javax.inject._
import models._
import scala.concurrent.{ExecutionContext, Future}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile.api._

@Singleton
class PaiementService @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val db = dbConfigProvider.get[JdbcProfile].db
  private val paiements = TableQuery[Paiements]

  def listAll: Future[Seq[Paiement]] = db.run(paiements.result)

  def create(p: Paiement): Future[Int] = db.run(paiements += p)

  def get(id: Long): Future[Option[Paiement]] =
    db.run(paiements.filter(_.id === id).result.headOption)

  def update(id: Long, paiement: Paiement): Future[Option[Paiement]] = {
    val updated = paiement.copy(id = id)
    db.run(paiements.filter(_.id === id).update(updated)).map {
      case 0 => None
      case _ => Some(updated)
    }
  }

  def delete(id: Long): Future[Int] = db.run(paiements.filter(_.id === id).delete)
}
