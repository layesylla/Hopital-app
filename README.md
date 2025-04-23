Ce projet est une application complète de gestion hospitalière, construite en Angular (frontend) et Play Framework avec Scala (backend). Il permet la gestion des patients, médecins, infirmiers, chambres, paiements, hospitalisations, matériels, notes médicales et rendez-vous.
🧰 Technologies utilisées
- Frontend: Angular, TypeScript, Bootstrap
- Backend: Play Framework, Scala, Slick
- Base de données: MySQL
📁 Arborescence
hopital-app/
├── frontend/   → Angular
├── backend/    → Scala Play
└── README.md
⚙️ Prérequis
Backend:
- Java JDK 8+
- SBT
- MySQL
Frontend:
- Node.js + npm
- Angular CLI
🚀 Installation
1. Cloner le projet :
   git clone git remote add origin https://github.com/layesylla/Hopital-app.git
   cd hopital-app
2. Créer une base de données MySQL nommée 'hopital'.
3. Configurer le fichier `backend/conf/application.conf`.
▶️ Lancement
Backend :
    cd backend
    sbt run
Frontend :
    cd frontend
    npm install
    ng serve
✅ Fonctionnalités
•	• Patients : CRUD + recherche
•	• Médecins : CRUD
•	• Infirmiers : CRUD
•	• Chambres : CRUD
•	• Hospitalisations : liaison patients/chambres/médecins
•	• Paiements : gestion de paiements
•	• Rendez-vous : avec patient et médecin
•	• Matériels : stock matériel
•	• Notes médicales : enregistrées localement (front uniquement)
📬 Exemples API
POST /patients :
{
  "nom": "Sow",
  "prenom": "Alioune",
  "email": "test@mail.com"
}
POST /paiements :
{
  "montant": 3000,
  "moyen": "espece",
  "patientId": 2
}
