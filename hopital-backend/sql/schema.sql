CREATE DATABASE IF NOT EXISTS hopital;
USE hopital;

CREATE TABLE patients (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    date_naissance DATE,
    numero_assurance VARCHAR(100),
    telephone VARCHAR(50)
);

CREATE TABLE medecins (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    specialite VARCHAR(100)
);

CREATE TABLE infirmiers (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100)
);

CREATE TABLE chambres (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    numero VARCHAR(50),
    lit_disponible INT
);

CREATE TABLE materiels (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    quantite INT
);

CREATE TABLE paiements (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    montant DOUBLE,
    moyen VARCHAR(50),
    patient_id BIGINT,
    FOREIGN KEY (patient_id) REFERENCES patients(id)
);
CREATE TABLE rendezvous (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  patient_id BIGINT NOT NULL,
  medecin_id BIGINT NOT NULL,
  date_rdv DATE NOT NULL,
  heure_rdv TIME NOT NULL,
  motif VARCHAR(255),
  FOREIGN KEY (patient_id) REFERENCES patients(id),
  FOREIGN KEY (medecin_id) REFERENCES medecins(id)
);
CREATE TABLE hospitalisations (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  patient_id BIGINT NOT NULL,
  medecin_id BIGINT NOT NULL,
  chambre_id BIGINT NOT NULL,
  date_entree DATE NOT NULL,
  date_sortie DATE,
  FOREIGN KEY (patient_id) REFERENCES patients(id),
  FOREIGN KEY (medecin_id) REFERENCES medecins(id),
  FOREIGN KEY (chambre_id) REFERENCES chambres(id)
);
CREATE TABLE notes_medicales (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  patient_id BIGINT NOT NULL,
  medecin_id BIGINT NOT NULL,
  contenu TEXT NOT NULL,
  date_note DATE NOT NULL,
  FOREIGN KEY (patient_id) REFERENCES patients(id),
  FOREIGN KEY (medecin_id) REFERENCES medecins(id)
);