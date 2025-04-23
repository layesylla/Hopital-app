package services

import javax.inject._
import models._
import scala.concurrent.{ExecutionContext, Future}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile.api._

@Singleton
class NoteMedicaleService @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val db = dbConfigProvider.get[JdbcProfile].db
  private val notes = TableQuery[NotesMedicales]

  def list: Future[Seq[NoteMedicale]] = db.run(notes.result)
  def create(n: NoteMedicale): Future[Int] = db.run(notes += n)
  def get(id: Long): Future[Option[NoteMedicale]] = db.run(notes.filter(_.id === id).result.headOption)
  def update(id: Long, note: NoteMedicale): Future[Option[NoteMedicale]] = {
    val n = note.copy(id = Some(id))
    db.run(notes.filter(_.id === id).update(n)).map {
      case 0 => None
      case _ => Some(n)
    }
  }
  def delete(id: Long): Future[Boolean] = db.run(notes.filter(_.id === id).delete).map(_ > 0)
}
