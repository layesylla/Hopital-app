package services

import javax.inject._
import models._
import scala.concurrent.{ExecutionContext, Future}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile.api._

@Singleton
class ChambreService @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  private val db = dbConfigProvider.get[JdbcProfile].db
  private val chambres = TableQuery[Chambres]

  // Lister toutes les chambres
  def listAll: Future[Seq[Chambre]] = db.run(chambres.result)

  // Créer une nouvelle chambre
  def create(e: Chambre): Future[Int] = db.run(chambres += e)

  // Récupérer une chambre par ID
  def get(id: Long): Future[Option[Chambre]] =
    db.run(chambres.filter(_.id === id).result.headOption)

  // Mettre à jour une chambre
  def update(id: Long, chambre: Chambre): Future[Option[Chambre]] = {
    val updatedChambre = chambre.copy(id = id)
    db.run(chambres.filter(_.id === id).update(updatedChambre)).map {
      case 0 => None
      case _ => Some(updatedChambre)
    }
  }

  // Supprimer une chambre
  def delete(id: Long): Future[Boolean] = {
    db.run(chambres.filter(_.id === id).delete).map(_ > 0)
  }
}
