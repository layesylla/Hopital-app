// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  PatientController_2: controllers.PatientController,
  // @LINE:10
  MedecinController_0: controllers.MedecinController,
  // @LINE:17
  InfirmierController_1: controllers.InfirmierController,
  // @LINE:24
  ChambreController_5: controllers.ChambreController,
  // @LINE:31
  MaterielController_4: controllers.MaterielController,
  // @LINE:38
  PaiementController_6: controllers.PaiementController,
  // @LINE:45
  HospitalisationController_8: controllers.HospitalisationController,
  // @LINE:52
  NoteMedicaleController_3: controllers.NoteMedicaleController,
  // @LINE:59
  RendezVousController_7: controllers.RendezVousController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:2
    PatientController_2: controllers.PatientController,
    // @LINE:10
    MedecinController_0: controllers.MedecinController,
    // @LINE:17
    InfirmierController_1: controllers.InfirmierController,
    // @LINE:24
    ChambreController_5: controllers.ChambreController,
    // @LINE:31
    MaterielController_4: controllers.MaterielController,
    // @LINE:38
    PaiementController_6: controllers.PaiementController,
    // @LINE:45
    HospitalisationController_8: controllers.HospitalisationController,
    // @LINE:52
    NoteMedicaleController_3: controllers.NoteMedicaleController,
    // @LINE:59
    RendezVousController_7: controllers.RendezVousController
  ) = this(errorHandler, PatientController_2, MedecinController_0, InfirmierController_1, ChambreController_5, MaterielController_4, PaiementController_6, HospitalisationController_8, NoteMedicaleController_3, RendezVousController_7, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PatientController_2, MedecinController_0, InfirmierController_1, ChambreController_5, MaterielController_4, PaiementController_6, HospitalisationController_8, NoteMedicaleController_3, RendezVousController_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patients""", """controllers.PatientController.listPatients"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patients""", """controllers.PatientController.createPatient"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patients/search""", """controllers.PatientController.searchPatient(nom:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patients/""" + "$" + """id<[^/]+>""", """controllers.PatientController.getPatient(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patients/""" + "$" + """id<[^/]+>""", """controllers.PatientController.updatePatient(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """patients/""" + "$" + """id<[^/]+>""", """controllers.PatientController.deletePatient(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medecins""", """controllers.MedecinController.listMedecins"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medecins""", """controllers.MedecinController.createMedecin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medecins/""" + "$" + """id<[^/]+>""", """controllers.MedecinController.getMedecin(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medecins/""" + "$" + """id<[^/]+>""", """controllers.MedecinController.updateMedecin(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medecins/""" + "$" + """id<[^/]+>""", """controllers.MedecinController.deleteMedecin(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """infirmiers""", """controllers.InfirmierController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """infirmiers""", """controllers.InfirmierController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """infirmiers/""" + "$" + """id<[^/]+>""", """controllers.InfirmierController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """infirmiers/""" + "$" + """id<[^/]+>""", """controllers.InfirmierController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """infirmiers/""" + "$" + """id<[^/]+>""", """controllers.InfirmierController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chambres""", """controllers.ChambreController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chambres""", """controllers.ChambreController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chambres/""" + "$" + """id<[^/]+>""", """controllers.ChambreController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chambres/""" + "$" + """id<[^/]+>""", """controllers.ChambreController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chambres/""" + "$" + """id<[^/]+>""", """controllers.ChambreController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """materiels""", """controllers.MaterielController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """materiels""", """controllers.MaterielController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """materiels/""" + "$" + """id<[^/]+>""", """controllers.MaterielController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """materiels/""" + "$" + """id<[^/]+>""", """controllers.MaterielController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """materiels/""" + "$" + """id<[^/]+>""", """controllers.MaterielController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paiements""", """controllers.PaiementController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paiements""", """controllers.PaiementController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paiements/""" + "$" + """id<[^/]+>""", """controllers.PaiementController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paiements/""" + "$" + """id<[^/]+>""", """controllers.PaiementController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paiements/""" + "$" + """id<[^/]+>""", """controllers.PaiementController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hospitalisations""", """controllers.HospitalisationController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hospitalisations""", """controllers.HospitalisationController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hospitalisations/""" + "$" + """id<[^/]+>""", """controllers.HospitalisationController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hospitalisations/""" + "$" + """id<[^/]+>""", """controllers.HospitalisationController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hospitalisations/""" + "$" + """id<[^/]+>""", """controllers.HospitalisationController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notes""", """controllers.NoteMedicaleController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notes""", """controllers.NoteMedicaleController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notes/""" + "$" + """id<[^/]+>""", """controllers.NoteMedicaleController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notes/""" + "$" + """id<[^/]+>""", """controllers.NoteMedicaleController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notes/""" + "$" + """id<[^/]+>""", """controllers.NoteMedicaleController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rendezvous""", """controllers.RendezVousController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rendezvous""", """controllers.RendezVousController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rendezvous/""" + "$" + """id<[^/]+>""", """controllers.RendezVousController.get(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rendezvous/""" + "$" + """id<[^/]+>""", """controllers.RendezVousController.update(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rendezvous/""" + "$" + """id<[^/]+>""", """controllers.RendezVousController.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:2
  private[this] lazy val controllers_PatientController_listPatients0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients")))
  )
  private[this] lazy val controllers_PatientController_listPatients0_invoker = createInvoker(
    PatientController_2.listPatients,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "listPatients",
      Nil,
      "GET",
      this.prefix + """patients""",
      """ --- PATIENTS ---""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_PatientController_createPatient1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients")))
  )
  private[this] lazy val controllers_PatientController_createPatient1_invoker = createInvoker(
    PatientController_2.createPatient,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "createPatient",
      Nil,
      "POST",
      this.prefix + """patients""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_PatientController_searchPatient2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients/search")))
  )
  private[this] lazy val controllers_PatientController_searchPatient2_invoker = createInvoker(
    PatientController_2.searchPatient(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "searchPatient",
      Seq(classOf[String]),
      "GET",
      this.prefix + """patients/search""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_PatientController_getPatient3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PatientController_getPatient3_invoker = createInvoker(
    PatientController_2.getPatient(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "getPatient",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """patients/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_PatientController_updatePatient4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PatientController_updatePatient4_invoker = createInvoker(
    PatientController_2.updatePatient(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "updatePatient",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """patients/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_PatientController_deletePatient5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("patients/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PatientController_deletePatient5_invoker = createInvoker(
    PatientController_2.deletePatient(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PatientController",
      "deletePatient",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """patients/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_MedecinController_listMedecins6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medecins")))
  )
  private[this] lazy val controllers_MedecinController_listMedecins6_invoker = createInvoker(
    MedecinController_0.listMedecins,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedecinController",
      "listMedecins",
      Nil,
      "GET",
      this.prefix + """medecins""",
      """ --- MEDECINS ---""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_MedecinController_createMedecin7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medecins")))
  )
  private[this] lazy val controllers_MedecinController_createMedecin7_invoker = createInvoker(
    MedecinController_0.createMedecin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedecinController",
      "createMedecin",
      Nil,
      "POST",
      this.prefix + """medecins""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_MedecinController_getMedecin8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medecins/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedecinController_getMedecin8_invoker = createInvoker(
    MedecinController_0.getMedecin(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedecinController",
      "getMedecin",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """medecins/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_MedecinController_updateMedecin9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medecins/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedecinController_updateMedecin9_invoker = createInvoker(
    MedecinController_0.updateMedecin(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedecinController",
      "updateMedecin",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """medecins/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_MedecinController_deleteMedecin10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medecins/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedecinController_deleteMedecin10_invoker = createInvoker(
    MedecinController_0.deleteMedecin(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedecinController",
      "deleteMedecin",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """medecins/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_InfirmierController_list11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("infirmiers")))
  )
  private[this] lazy val controllers_InfirmierController_list11_invoker = createInvoker(
    InfirmierController_1.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.InfirmierController",
      "list",
      Nil,
      "GET",
      this.prefix + """infirmiers""",
      """ --- INFIRMIERS ---""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_InfirmierController_create12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("infirmiers")))
  )
  private[this] lazy val controllers_InfirmierController_create12_invoker = createInvoker(
    InfirmierController_1.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.InfirmierController",
      "create",
      Nil,
      "POST",
      this.prefix + """infirmiers""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_InfirmierController_get13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("infirmiers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_InfirmierController_get13_invoker = createInvoker(
    InfirmierController_1.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.InfirmierController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """infirmiers/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_InfirmierController_update14_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("infirmiers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_InfirmierController_update14_invoker = createInvoker(
    InfirmierController_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.InfirmierController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """infirmiers/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_InfirmierController_delete15_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("infirmiers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_InfirmierController_delete15_invoker = createInvoker(
    InfirmierController_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.InfirmierController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """infirmiers/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ChambreController_list16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chambres")))
  )
  private[this] lazy val controllers_ChambreController_list16_invoker = createInvoker(
    ChambreController_5.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChambreController",
      "list",
      Nil,
      "GET",
      this.prefix + """chambres""",
      """ --- CHAMBRES ---""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ChambreController_create17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chambres")))
  )
  private[this] lazy val controllers_ChambreController_create17_invoker = createInvoker(
    ChambreController_5.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChambreController",
      "create",
      Nil,
      "POST",
      this.prefix + """chambres""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ChambreController_get18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chambres/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChambreController_get18_invoker = createInvoker(
    ChambreController_5.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChambreController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """chambres/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ChambreController_update19_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chambres/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChambreController_update19_invoker = createInvoker(
    ChambreController_5.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChambreController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """chambres/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ChambreController_delete20_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chambres/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChambreController_delete20_invoker = createInvoker(
    ChambreController_5.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChambreController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """chambres/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_MaterielController_list21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("materiels")))
  )
  private[this] lazy val controllers_MaterielController_list21_invoker = createInvoker(
    MaterielController_4.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MaterielController",
      "list",
      Nil,
      "GET",
      this.prefix + """materiels""",
      """ --- MATERIELS ---""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_MaterielController_create22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("materiels")))
  )
  private[this] lazy val controllers_MaterielController_create22_invoker = createInvoker(
    MaterielController_4.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MaterielController",
      "create",
      Nil,
      "POST",
      this.prefix + """materiels""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_MaterielController_get23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("materiels/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MaterielController_get23_invoker = createInvoker(
    MaterielController_4.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MaterielController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """materiels/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_MaterielController_update24_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("materiels/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MaterielController_update24_invoker = createInvoker(
    MaterielController_4.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MaterielController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """materiels/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_MaterielController_delete25_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("materiels/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MaterielController_delete25_invoker = createInvoker(
    MaterielController_4.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MaterielController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """materiels/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_PaiementController_list26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paiements")))
  )
  private[this] lazy val controllers_PaiementController_list26_invoker = createInvoker(
    PaiementController_6.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementController",
      "list",
      Nil,
      "GET",
      this.prefix + """paiements""",
      """ --- PAIEMENTS ---""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_PaiementController_create27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paiements")))
  )
  private[this] lazy val controllers_PaiementController_create27_invoker = createInvoker(
    PaiementController_6.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementController",
      "create",
      Nil,
      "POST",
      this.prefix + """paiements""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_PaiementController_get28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paiements/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaiementController_get28_invoker = createInvoker(
    PaiementController_6.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """paiements/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_PaiementController_update29_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paiements/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaiementController_update29_invoker = createInvoker(
    PaiementController_6.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """paiements/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_PaiementController_delete30_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paiements/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaiementController_delete30_invoker = createInvoker(
    PaiementController_6.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaiementController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """paiements/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_HospitalisationController_list31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hospitalisations")))
  )
  private[this] lazy val controllers_HospitalisationController_list31_invoker = createInvoker(
    HospitalisationController_8.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HospitalisationController",
      "list",
      Nil,
      "GET",
      this.prefix + """hospitalisations""",
      """ Hospitalisations""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_HospitalisationController_create32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hospitalisations")))
  )
  private[this] lazy val controllers_HospitalisationController_create32_invoker = createInvoker(
    HospitalisationController_8.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HospitalisationController",
      "create",
      Nil,
      "POST",
      this.prefix + """hospitalisations""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_HospitalisationController_get33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hospitalisations/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HospitalisationController_get33_invoker = createInvoker(
    HospitalisationController_8.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HospitalisationController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """hospitalisations/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_HospitalisationController_update34_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hospitalisations/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HospitalisationController_update34_invoker = createInvoker(
    HospitalisationController_8.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HospitalisationController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """hospitalisations/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_HospitalisationController_delete35_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hospitalisations/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HospitalisationController_delete35_invoker = createInvoker(
    HospitalisationController_8.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HospitalisationController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """hospitalisations/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_NoteMedicaleController_list36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notes")))
  )
  private[this] lazy val controllers_NoteMedicaleController_list36_invoker = createInvoker(
    NoteMedicaleController_3.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoteMedicaleController",
      "list",
      Nil,
      "GET",
      this.prefix + """notes""",
      """ Notes Médicales""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_NoteMedicaleController_create37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notes")))
  )
  private[this] lazy val controllers_NoteMedicaleController_create37_invoker = createInvoker(
    NoteMedicaleController_3.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoteMedicaleController",
      "create",
      Nil,
      "POST",
      this.prefix + """notes""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_NoteMedicaleController_get38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NoteMedicaleController_get38_invoker = createInvoker(
    NoteMedicaleController_3.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoteMedicaleController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """notes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_NoteMedicaleController_update39_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NoteMedicaleController_update39_invoker = createInvoker(
    NoteMedicaleController_3.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoteMedicaleController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """notes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_NoteMedicaleController_delete40_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_NoteMedicaleController_delete40_invoker = createInvoker(
    NoteMedicaleController_3.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NoteMedicaleController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """notes/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_RendezVousController_list41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rendezvous")))
  )
  private[this] lazy val controllers_RendezVousController_list41_invoker = createInvoker(
    RendezVousController_7.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RendezVousController",
      "list",
      Nil,
      "GET",
      this.prefix + """rendezvous""",
      """ Rendez-vous""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_RendezVousController_create42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rendezvous")))
  )
  private[this] lazy val controllers_RendezVousController_create42_invoker = createInvoker(
    RendezVousController_7.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RendezVousController",
      "create",
      Nil,
      "POST",
      this.prefix + """rendezvous""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_RendezVousController_get43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rendezvous/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RendezVousController_get43_invoker = createInvoker(
    RendezVousController_7.get(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RendezVousController",
      "get",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """rendezvous/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_RendezVousController_update44_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rendezvous/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RendezVousController_update44_invoker = createInvoker(
    RendezVousController_7.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RendezVousController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """rendezvous/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_RendezVousController_delete45_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rendezvous/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RendezVousController_delete45_invoker = createInvoker(
    RendezVousController_7.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RendezVousController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """rendezvous/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_PatientController_listPatients0_route(params@_) =>
      call { 
        controllers_PatientController_listPatients0_invoker.call(PatientController_2.listPatients)
      }
  
    // @LINE:3
    case controllers_PatientController_createPatient1_route(params@_) =>
      call { 
        controllers_PatientController_createPatient1_invoker.call(PatientController_2.createPatient)
      }
  
    // @LINE:4
    case controllers_PatientController_searchPatient2_route(params@_) =>
      call(params.fromQuery[String]("nom", None)) { (nom) =>
        controllers_PatientController_searchPatient2_invoker.call(PatientController_2.searchPatient(nom))
      }
  
    // @LINE:5
    case controllers_PatientController_getPatient3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PatientController_getPatient3_invoker.call(PatientController_2.getPatient(id))
      }
  
    // @LINE:6
    case controllers_PatientController_updatePatient4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PatientController_updatePatient4_invoker.call(PatientController_2.updatePatient(id))
      }
  
    // @LINE:7
    case controllers_PatientController_deletePatient5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PatientController_deletePatient5_invoker.call(PatientController_2.deletePatient(id))
      }
  
    // @LINE:10
    case controllers_MedecinController_listMedecins6_route(params@_) =>
      call { 
        controllers_MedecinController_listMedecins6_invoker.call(MedecinController_0.listMedecins)
      }
  
    // @LINE:11
    case controllers_MedecinController_createMedecin7_route(params@_) =>
      call { 
        controllers_MedecinController_createMedecin7_invoker.call(MedecinController_0.createMedecin)
      }
  
    // @LINE:12
    case controllers_MedecinController_getMedecin8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedecinController_getMedecin8_invoker.call(MedecinController_0.getMedecin(id))
      }
  
    // @LINE:13
    case controllers_MedecinController_updateMedecin9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedecinController_updateMedecin9_invoker.call(MedecinController_0.updateMedecin(id))
      }
  
    // @LINE:14
    case controllers_MedecinController_deleteMedecin10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedecinController_deleteMedecin10_invoker.call(MedecinController_0.deleteMedecin(id))
      }
  
    // @LINE:17
    case controllers_InfirmierController_list11_route(params@_) =>
      call { 
        controllers_InfirmierController_list11_invoker.call(InfirmierController_1.list)
      }
  
    // @LINE:18
    case controllers_InfirmierController_create12_route(params@_) =>
      call { 
        controllers_InfirmierController_create12_invoker.call(InfirmierController_1.create)
      }
  
    // @LINE:19
    case controllers_InfirmierController_get13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InfirmierController_get13_invoker.call(InfirmierController_1.get(id))
      }
  
    // @LINE:20
    case controllers_InfirmierController_update14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InfirmierController_update14_invoker.call(InfirmierController_1.update(id))
      }
  
    // @LINE:21
    case controllers_InfirmierController_delete15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_InfirmierController_delete15_invoker.call(InfirmierController_1.delete(id))
      }
  
    // @LINE:24
    case controllers_ChambreController_list16_route(params@_) =>
      call { 
        controllers_ChambreController_list16_invoker.call(ChambreController_5.list)
      }
  
    // @LINE:25
    case controllers_ChambreController_create17_route(params@_) =>
      call { 
        controllers_ChambreController_create17_invoker.call(ChambreController_5.create)
      }
  
    // @LINE:26
    case controllers_ChambreController_get18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ChambreController_get18_invoker.call(ChambreController_5.get(id))
      }
  
    // @LINE:27
    case controllers_ChambreController_update19_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ChambreController_update19_invoker.call(ChambreController_5.update(id))
      }
  
    // @LINE:28
    case controllers_ChambreController_delete20_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ChambreController_delete20_invoker.call(ChambreController_5.delete(id))
      }
  
    // @LINE:31
    case controllers_MaterielController_list21_route(params@_) =>
      call { 
        controllers_MaterielController_list21_invoker.call(MaterielController_4.list)
      }
  
    // @LINE:32
    case controllers_MaterielController_create22_route(params@_) =>
      call { 
        controllers_MaterielController_create22_invoker.call(MaterielController_4.create)
      }
  
    // @LINE:33
    case controllers_MaterielController_get23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaterielController_get23_invoker.call(MaterielController_4.get(id))
      }
  
    // @LINE:34
    case controllers_MaterielController_update24_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaterielController_update24_invoker.call(MaterielController_4.update(id))
      }
  
    // @LINE:35
    case controllers_MaterielController_delete25_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MaterielController_delete25_invoker.call(MaterielController_4.delete(id))
      }
  
    // @LINE:38
    case controllers_PaiementController_list26_route(params@_) =>
      call { 
        controllers_PaiementController_list26_invoker.call(PaiementController_6.list)
      }
  
    // @LINE:39
    case controllers_PaiementController_create27_route(params@_) =>
      call { 
        controllers_PaiementController_create27_invoker.call(PaiementController_6.create)
      }
  
    // @LINE:40
    case controllers_PaiementController_get28_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaiementController_get28_invoker.call(PaiementController_6.get(id))
      }
  
    // @LINE:41
    case controllers_PaiementController_update29_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaiementController_update29_invoker.call(PaiementController_6.update(id))
      }
  
    // @LINE:42
    case controllers_PaiementController_delete30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaiementController_delete30_invoker.call(PaiementController_6.delete(id))
      }
  
    // @LINE:45
    case controllers_HospitalisationController_list31_route(params@_) =>
      call { 
        controllers_HospitalisationController_list31_invoker.call(HospitalisationController_8.list)
      }
  
    // @LINE:46
    case controllers_HospitalisationController_create32_route(params@_) =>
      call { 
        controllers_HospitalisationController_create32_invoker.call(HospitalisationController_8.create)
      }
  
    // @LINE:47
    case controllers_HospitalisationController_get33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HospitalisationController_get33_invoker.call(HospitalisationController_8.get(id))
      }
  
    // @LINE:48
    case controllers_HospitalisationController_update34_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HospitalisationController_update34_invoker.call(HospitalisationController_8.update(id))
      }
  
    // @LINE:49
    case controllers_HospitalisationController_delete35_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HospitalisationController_delete35_invoker.call(HospitalisationController_8.delete(id))
      }
  
    // @LINE:52
    case controllers_NoteMedicaleController_list36_route(params@_) =>
      call { 
        controllers_NoteMedicaleController_list36_invoker.call(NoteMedicaleController_3.list)
      }
  
    // @LINE:53
    case controllers_NoteMedicaleController_create37_route(params@_) =>
      call { 
        controllers_NoteMedicaleController_create37_invoker.call(NoteMedicaleController_3.create)
      }
  
    // @LINE:54
    case controllers_NoteMedicaleController_get38_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NoteMedicaleController_get38_invoker.call(NoteMedicaleController_3.get(id))
      }
  
    // @LINE:55
    case controllers_NoteMedicaleController_update39_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NoteMedicaleController_update39_invoker.call(NoteMedicaleController_3.update(id))
      }
  
    // @LINE:56
    case controllers_NoteMedicaleController_delete40_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_NoteMedicaleController_delete40_invoker.call(NoteMedicaleController_3.delete(id))
      }
  
    // @LINE:59
    case controllers_RendezVousController_list41_route(params@_) =>
      call { 
        controllers_RendezVousController_list41_invoker.call(RendezVousController_7.list)
      }
  
    // @LINE:60
    case controllers_RendezVousController_create42_route(params@_) =>
      call { 
        controllers_RendezVousController_create42_invoker.call(RendezVousController_7.create)
      }
  
    // @LINE:61
    case controllers_RendezVousController_get43_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RendezVousController_get43_invoker.call(RendezVousController_7.get(id))
      }
  
    // @LINE:62
    case controllers_RendezVousController_update44_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RendezVousController_update44_invoker.call(RendezVousController_7.update(id))
      }
  
    // @LINE:63
    case controllers_RendezVousController_delete45_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RendezVousController_delete45_invoker.call(RendezVousController_7.delete(id))
      }
  }
}
