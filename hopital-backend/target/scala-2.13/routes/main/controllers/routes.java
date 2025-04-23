// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReversePaiementController PaiementController = new controllers.ReversePaiementController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseInfirmierController InfirmierController = new controllers.ReverseInfirmierController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRendezVousController RendezVousController = new controllers.ReverseRendezVousController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMaterielController MaterielController = new controllers.ReverseMaterielController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseChambreController ChambreController = new controllers.ReverseChambreController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHospitalisationController HospitalisationController = new controllers.ReverseHospitalisationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMedecinController MedecinController = new controllers.ReverseMedecinController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePatientController PatientController = new controllers.ReversePatientController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseNoteMedicaleController NoteMedicaleController = new controllers.ReverseNoteMedicaleController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReversePaiementController PaiementController = new controllers.javascript.ReversePaiementController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseInfirmierController InfirmierController = new controllers.javascript.ReverseInfirmierController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRendezVousController RendezVousController = new controllers.javascript.ReverseRendezVousController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMaterielController MaterielController = new controllers.javascript.ReverseMaterielController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseChambreController ChambreController = new controllers.javascript.ReverseChambreController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHospitalisationController HospitalisationController = new controllers.javascript.ReverseHospitalisationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMedecinController MedecinController = new controllers.javascript.ReverseMedecinController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePatientController PatientController = new controllers.javascript.ReversePatientController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseNoteMedicaleController NoteMedicaleController = new controllers.javascript.ReverseNoteMedicaleController(RoutesPrefix.byNamePrefix());
  }

}
