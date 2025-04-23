package models

import slick.jdbc.MySQLProfile.api._
import java.time.LocalDate

case class Patient(id: Long, nom: String, prenom: String, dateNaissance: LocalDate, numeroAssurance: Option[String], telephone: String)
case class Medecin(id: Long, nom: String, specialite: String)
case class Infirmier(id: Long, nom: String)
case class Chambre(id: Long, numero: String, litDisponible: Int)
case class Materiel(id: Long, nom: String, quantite: Int)
case class Paiement(id: Long, montant: Double, moyen: String, patientId: Long)
case class Hospitalisation(id: Option[Long], patientId: Long,medecinId: Long, chambreId: Long, dateEntree: String, dateSortie: Option[String])
case class NoteMedicale(id: Option[Long], patientId: Long,medecinId: Long, contenu: String, date: String)
case class RendezVous(id: Option[Long], patientId: Long, medecinId: Long, date: String, heure: String)



class Patients(tag: Tag) extends Table[Patient](tag, "patients") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def nom = column[String]("nom")
  def prenom = column[String]("prenom")
  def dateNaissance = column[LocalDate]("date_naissance")
  def numeroAssurance = column[Option[String]]("numero_assurance")
  def telephone = column[String]("telephone")
  def * = (id, nom, prenom, dateNaissance, numeroAssurance, telephone) <> (Patient.tupled, Patient.unapply)
}

class Medecins(tag: Tag) extends Table[Medecin](tag, "medecins") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def nom = column[String]("nom")
  def specialite = column[String]("specialite")
  def * = (id, nom, specialite) <> (Medecin.tupled, Medecin.unapply)
}

class Infirmiers(tag: Tag) extends Table[Infirmier](tag, "infirmiers") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def nom = column[String]("nom")
  def * = (id, nom) <> (Infirmier.tupled, Infirmier.unapply)
}

class Chambres(tag: Tag) extends Table[Chambre](tag, "chambres") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def numero = column[String]("numero")
  def litDisponible = column[Int]("lit_disponible")
  def * = (id, numero, litDisponible) <> (Chambre.tupled, Chambre.unapply)
}

class Materiels(tag: Tag) extends Table[Materiel](tag, "materiels") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def nom = column[String]("nom")
  def quantite = column[Int]("quantite")
  def * = (id, nom, quantite) <> (Materiel.tupled, Materiel.unapply)
}

class Paiements(tag: Tag) extends Table[Paiement](tag, "paiements") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def montant = column[Double]("montant")
  def moyen = column[String]("moyen")
  def patientId = column[Long]("patient_id")
  def * = (id, montant, moyen, patientId) <> (Paiement.tupled, Paiement.unapply)
  def fk_patient = foreignKey("fk_patient", patientId, TableQuery[Patients])(_.id)
}
class Hospitalisations(tag: Tag) extends Table[Hospitalisation](tag, "hospitalisations") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def patientId = column[Long]("patient_id")
  def chambreId = column[Long]("chambre_id")
  def dateEntree = column[String]("date_entree")
  def dateSortie = column[Option[String]]("date_sortie")
  def medecinId = column[Long]("medecin_id")

 def * = (id.?, patientId, medecinId, chambreId, dateEntree, dateSortie) <> (Hospitalisation.tupled, Hospitalisation.unapply _)

}
class NotesMedicales(tag: Tag) extends Table[NoteMedicale](tag, "notes_medicales") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def patientId = column[Long]("patient_id")
  def medecinId = column[Long]("medecin_id")
  def contenu = column[String]("contenu")
  def date = column[String]("date_note")

  def * = (id.?, patientId,medecinId, contenu, date) <> (NoteMedicale.tupled, NoteMedicale.unapply)
}
class RendezVousTable(tag: Tag) extends Table[RendezVous](tag, "rendezvous") {
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def patientId = column[Long]("patient_id")
  def medecinId = column[Long]("medecin_id")
  def date = column[String]("date_rdv")
  def heure = column[String]("heure_rdv")

  def * = (id.?, patientId, medecinId, date, heure) <> (RendezVous.tupled, RendezVous.unapply)
}
