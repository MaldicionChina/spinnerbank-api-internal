
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ferlinux/activator-dist-1.3.6/spinnerbank-api-internal-demo/conf/routes
// @DATE:Tue Nov 24 15:49:39 COT 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:27
  class ReverseLegacy(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def legacy(idProduct:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "legacy/products/" + implicitly[PathBindable[Int]].unbind("idProduct", idProduct))
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

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def findProductsClient(documentType:String, documentNumber:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[String]].unbind("documentType", dynamicString(documentType)) + "/" + implicitly[PathBindable[Int]].unbind("documentNumber", documentNumber) + "/products")
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
  
    // @LINE:24
    def findMovementsById(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "movements/" + implicitly[PathBindable[Int]].unbind("id", id))
    }
  
    // @LINE:6
    def home(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:21
    def findAllMovements(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "movements")
    }
  
  }


}