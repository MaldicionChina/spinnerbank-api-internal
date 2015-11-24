
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ferlinux/activator-dist-1.3.6/spinnerbank-api-internal-demo/conf/routes
// @DATE:Tue Nov 24 15:49:39 COT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:27
  class ReverseLegacy(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def legacy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Legacy.legacy",
      """
        function(idProduct) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "legacy/products/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("idProduct", idProduct)})
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

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def findProductsClient: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findProductsClient",
      """
        function(documentType,documentNumber) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("documentType", encodeURIComponent(documentType)) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("documentNumber", documentNumber) + "/products"})
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
  
    // @LINE:24
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
  
    // @LINE:21
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