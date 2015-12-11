
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/emmanuelhcpk/scala/jadiosa/spinnerbank-api-internal/conf/routes
// @DATE:Thu Dec 10 21:35:47 COT 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:37
  class ReverseLegacy(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def legacy(documentType:String, documentNumber:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "legacy/" + implicitly[PathBindable[String]].unbind("documentType", dynamicString(documentType)) + "/" + implicitly[PathBindable[Int]].unbind("documentNumber", documentNumber))
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:40
  class ReverseAuthentication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "check/")
    }
  
    // @LINE:40
    def auth(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def findRequestAdviser(idAdviser:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adviser/" + implicitly[PathBindable[Int]].unbind("idAdviser", idAdviser) + "/requests")
    }
  
    // @LINE:15
    def findProductsClient(documentType:String, documentNumber:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[String]].unbind("documentType", dynamicString(documentType)) + "/" + implicitly[PathBindable[Int]].unbind("documentNumber", documentNumber) + "/products")
    }
  
    // @LINE:22
    def findRequestClient(idAdviser:Int, documentType:String, documentNumber:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adviser/" + implicitly[PathBindable[Int]].unbind("idAdviser", idAdviser) + "/requests/" + implicitly[PathBindable[String]].unbind("documentType", dynamicString(documentType)) + "/" + implicitly[PathBindable[Int]].unbind("documentNumber", documentNumber))
    }
  
    // @LINE:17
    def findClient(documentType:String, documentNumber:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[String]].unbind("documentType", dynamicString(documentType)) + "/" + implicitly[PathBindable[Int]].unbind("documentNumber", documentNumber) + "/productos")
    }
  
    // @LINE:12
    def findMovement(idProduct:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "product/" + implicitly[PathBindable[Int]].unbind("idProduct", idProduct) + "/movements")
    }
  
    // @LINE:28
    def findMovementsById(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "movements/" + implicitly[PathBindable[Int]].unbind("id", id))
    }
  
    // @LINE:6
    def home(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:25
    def findAllMovements(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "movements")
    }
  
  }


}