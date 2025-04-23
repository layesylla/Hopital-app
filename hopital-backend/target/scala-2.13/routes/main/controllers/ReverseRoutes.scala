// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:2
package controllers {

  // @LINE:38
  class ReversePaiementController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def delete(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "paiements/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:39
    def create: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paiements")
    }
  
    // @LINE:41
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "paiements/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:40
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paiements/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:38
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paiements")
    }
  
  }

  // @LINE:17
  class ReverseInfirmierController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def delete(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "infirmiers/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:18
    def create: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "infirmiers")
    }
  
    // @LINE:20
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "infirmiers/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:19
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "infirmiers/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:17
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "infirmiers")
    }
  
  }

  // @LINE:59
  class ReverseRendezVousController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def delete(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "rendezvous/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:60
    def create: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rendezvous")
    }
  
    // @LINE:62
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "rendezvous/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:61
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rendezvous/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:59
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rendezvous")
    }
  
  }

  // @LINE:31
  class ReverseMaterielController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def delete(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "materiels/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:32
    def create: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "materiels")
    }
  
    // @LINE:34
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "materiels/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:33
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "materiels/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:31
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "materiels")
    }
  
  }

  // @LINE:24
  class ReverseChambreController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def delete(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "chambres/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:25
    def create: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "chambres")
    }
  
    // @LINE:27
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "chambres/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:26
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "chambres/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:24
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "chambres")
    }
  
  }

  // @LINE:45
  class ReverseHospitalisationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def delete(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "hospitalisations/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:46
    def create: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "hospitalisations")
    }
  
    // @LINE:48
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "hospitalisations/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:47
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hospitalisations/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:45
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hospitalisations")
    }
  
  }

  // @LINE:10
  class ReverseMedecinController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def createMedecin: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "medecins")
    }
  
    // @LINE:14
    def deleteMedecin(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "medecins/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:13
    def updateMedecin(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "medecins/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:12
    def getMedecin(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "medecins/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:10
    def listMedecins: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "medecins")
    }
  
  }

  // @LINE:2
  class ReversePatientController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def listPatients: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "patients")
    }
  
    // @LINE:3
    def createPatient: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "patients")
    }
  
    // @LINE:7
    def deletePatient(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "patients/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:5
    def getPatient(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "patients/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:4
    def searchPatient(nom:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "patients/search" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("nom", nom)))))
    }
  
    // @LINE:6
    def updatePatient(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "patients/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:52
  class ReverseNoteMedicaleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def delete(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "notes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:53
    def create: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "notes")
    }
  
    // @LINE:55
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "notes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:54
    def get(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "notes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:52
    def list: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "notes")
    }
  
  }


}
