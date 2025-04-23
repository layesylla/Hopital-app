package services

import javax.inject._
import models._
import scala.concurrent.{ExecutionContext, Future}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile.api._

@Singleton
class InfirmierService @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val db = dbConfigProvider.get[JdbcProfile].db
  private val infirmiers = TableQuery[Infirmiers]

  def listAll: Future[Seq[Infirmier]] = db.run(infirmiers.result)

  def create(i: Infirmier): Future[Int] = db.run(infirmiers += i)

  def get(id: Long): Future[Option[Infirmier]] =
    db.run(infirmiers.filter(_.id === id).result.headOption)

  def update(id: Long, infirmier: Infirmier): Future[Option[Infirmier]] = {
    val updated = infirmier.copy(id = id)
    db.run(infirmiers.filter(_.id === id).update(updated)).map {
      case 0 => None
      case _ => Some(updated)
    }
  }

  def delete(id: Long): Future[Int] = db.run(infirmiers.filter(_.id === id).delete)
}
