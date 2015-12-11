
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/emmanuelhcpk/scala/jadiosa/spinnerbank-api-internal/conf/routes
// @DATE:Thu Dec 10 21:35:47 COT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:37
  class ReverseLegacy(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def legacy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Legacy.legacy",
      """
        function(documentType,documentNumber) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "legacy/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documentType", encodeURIComponent(documentType)) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("documentNumber", documentNumber)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseAuthentication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.index",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "check/"})
        }
      """
    )
  
    // @LINE:40
    def auth: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.auth",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def findRequestAdviser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findRequestAdviser",
      """
        function(idAdviser) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adviser/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("idAdviser", idAdviser) + "/requests"})
        }
      """
    )
  
    // @LINE:15
    def findProductsClient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findProductsClient",
      """
        function(documentType,documentNumber) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documentType", encodeURIComponent(documentType)) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("documentNumber", documentNumber) + "/products"})
        }
      """
    )
  
    // @LINE:22
    def findRequestClient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findRequestClient",
      """
        function(idAdviser,documentType,documentNumber) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adviser/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("idAdviser", idAdviser) + "/requests/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documentType", encodeURIComponent(documentType)) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("documentNumber", documentNumber)})
        }
      """
    )
  
    // @LINE:17
    def findClient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findClient",
      """
        function(documentType,documentNumber) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documentType", encodeURIComponent(documentType)) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("documentNumber", documentNumber) + "/productos"})
        }
      """
    )
  
    // @LINE:12
    def findMovement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findMovement",
      """
        function(idProduct) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("idProduct", idProduct) + "/movements"})
        }
      """
    )
  
    // @LINE:28
    def findMovementsById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findMovementsById",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movements/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:6
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:25
    def findAllMovements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findAllMovements",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movements"})
        }
      """
    )
  
  }


}