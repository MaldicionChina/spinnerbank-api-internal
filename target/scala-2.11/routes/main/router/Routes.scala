
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/emmanuelhcpk/scala/jadiosa/spinnerbank-api-internal/conf/routes
// @DATE:Thu Dec 10 21:35:47 COT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: javax.inject.Provider[controllers.Application],
  // @LINE:9
  Assets_1: controllers.Assets,
  // @LINE:37
  Legacy_0: javax.inject.Provider[controllers.Legacy],
  // @LINE:40
  Authentication_3: javax.inject.Provider[controllers.Authentication],
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: javax.inject.Provider[controllers.Application],
    // @LINE:9
    Assets_1: controllers.Assets,
    // @LINE:37
    Legacy_0: javax.inject.Provider[controllers.Legacy],
    // @LINE:40
    Authentication_3: javax.inject.Provider[controllers.Authentication]
  ) = this(errorHandler, Application_2, Assets_1, Legacy_0, Authentication_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, Assets_1, Legacy_0, Authentication_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """@controllers.Application@.home"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/$idProduct<[^/]+>/movements""", """@controllers.Application@.findMovement(idProduct:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/$documentType<[^/]+>/$documentNumber<[^/]+>/products""", """@controllers.Application@.findProductsClient(documentType:String, documentNumber:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/$documentType<[^/]+>/$documentNumber<[^/]+>/productos""", """@controllers.Application@.findClient(documentType:String, documentNumber:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adviser/$idAdviser<[^/]+>/requests""", """@controllers.Application@.findRequestAdviser(idAdviser:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adviser/$idAdviser<[^/]+>/requests/$documentType<[^/]+>/$documentNumber<[^/]+>""", """@controllers.Application@.findRequestClient(idAdviser:Int, documentType:String, documentNumber:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movements""", """@controllers.Application@.findAllMovements"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movements/$id<[^/]+>""", """@controllers.Application@.findMovementsById(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """legacy/$documentType<[^/]+>/$documentNumber<[^/]+>""", """@controllers.Legacy@.legacy(documentType:String, documentNumber:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """@controllers.Authentication@.auth()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """check/""", """@controllers.Authentication@.index()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_home0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_home0_invoker = createInvoker(
    Application_2.get.home,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "home",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_findMovement2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("idProduct", """[^/]+""",true), StaticPart("/movements")))
  )
  private[this] lazy val controllers_Application_findMovement2_invoker = createInvoker(
    Application_2.get.findMovement(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findMovement",
      Seq(classOf[Int]),
      "GET",
      """Consultar movimientos de una cuenta    """,
      this.prefix + """product/$idProduct<[^/]+>/movements"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_findProductsClient3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("documentType", """[^/]+""",true), StaticPart("/"), DynamicPart("documentNumber", """[^/]+""",true), StaticPart("/products")))
  )
  private[this] lazy val controllers_Application_findProductsClient3_invoker = createInvoker(
    Application_2.get.findProductsClient(fakeValue[String], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findProductsClient",
      Seq(classOf[String], classOf[Int]),
      "GET",
      """Consultar productos dato tipo y numero de documento""",
      this.prefix + """user/$documentType<[^/]+>/$documentNumber<[^/]+>/products"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_findClient4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("documentType", """[^/]+""",true), StaticPart("/"), DynamicPart("documentNumber", """[^/]+""",true), StaticPart("/productos")))
  )
  private[this] lazy val controllers_Application_findClient4_invoker = createInvoker(
    Application_2.get.findClient(fakeValue[String], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findClient",
      Seq(classOf[String], classOf[Int]),
      "GET",
      """""",
      this.prefix + """user/$documentType<[^/]+>/$documentNumber<[^/]+>/productos"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_findRequestAdviser5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adviser/"), DynamicPart("idAdviser", """[^/]+""",true), StaticPart("/requests")))
  )
  private[this] lazy val controllers_Application_findRequestAdviser5_invoker = createInvoker(
    Application_2.get.findRequestAdviser(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findRequestAdviser",
      Seq(classOf[Int]),
      "GET",
      """Consultar solicidutes de un asesor""",
      this.prefix + """adviser/$idAdviser<[^/]+>/requests"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_findRequestClient6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adviser/"), DynamicPart("idAdviser", """[^/]+""",true), StaticPart("/requests/"), DynamicPart("documentType", """[^/]+""",true), StaticPart("/"), DynamicPart("documentNumber", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_findRequestClient6_invoker = createInvoker(
    Application_2.get.findRequestClient(fakeValue[Int], fakeValue[String], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findRequestClient",
      Seq(classOf[Int], classOf[String], classOf[Int]),
      "GET",
      """""",
      this.prefix + """adviser/$idAdviser<[^/]+>/requests/$documentType<[^/]+>/$documentNumber<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_findAllMovements7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movements")))
  )
  private[this] lazy val controllers_Application_findAllMovements7_invoker = createInvoker(
    Application_2.get.findAllMovements,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findAllMovements",
      Nil,
      "GET",
      """URL para consultar todos los movimientos Con mongo !!!!""",
      this.prefix + """movements"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_findMovementsById8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movements/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_findMovementsById8_invoker = createInvoker(
    Application_2.get.findMovementsById(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findMovementsById",
      Seq(classOf[Int]),
      "GET",
      """URL para consultar movimientos de id""",
      this.prefix + """movements/$id<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Legacy_legacy9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("legacy/"), DynamicPart("documentType", """[^/]+""",true), StaticPart("/"), DynamicPart("documentNumber", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Legacy_legacy9_invoker = createInvoker(
    Legacy_0.get.legacy(fakeValue[String], fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Legacy",
      "legacy",
      Seq(classOf[String], classOf[Int]),
      "GET",
      """Acceder a Legacy""",
      this.prefix + """legacy/$documentType<[^/]+>/$documentNumber<[^/]+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Authentication_auth10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Authentication_auth10_invoker = createInvoker(
    Authentication_3.get.auth(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "auth",
      Nil,
      "POST",
      """ Realizar Autenticación""",
      this.prefix + """login"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Authentication_index11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("check/")))
  )
  private[this] lazy val controllers_Authentication_index11_invoker = createInvoker(
    Authentication_3.get.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "index",
      Nil,
      "POST",
      """""",
      this.prefix + """check/"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_home0_route(params) =>
      call { 
        controllers_Application_home0_invoker.call(Application_2.get.home)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_Application_findMovement2_route(params) =>
      call(params.fromPath[Int]("idProduct", None)) { (idProduct) =>
        controllers_Application_findMovement2_invoker.call(Application_2.get.findMovement(idProduct))
      }
  
    // @LINE:15
    case controllers_Application_findProductsClient3_route(params) =>
      call(params.fromPath[String]("documentType", None), params.fromPath[Int]("documentNumber", None)) { (documentType, documentNumber) =>
        controllers_Application_findProductsClient3_invoker.call(Application_2.get.findProductsClient(documentType, documentNumber))
      }
  
    // @LINE:17
    case controllers_Application_findClient4_route(params) =>
      call(params.fromPath[String]("documentType", None), params.fromPath[Int]("documentNumber", None)) { (documentType, documentNumber) =>
        controllers_Application_findClient4_invoker.call(Application_2.get.findClient(documentType, documentNumber))
      }
  
    // @LINE:20
    case controllers_Application_findRequestAdviser5_route(params) =>
      call(params.fromPath[Int]("idAdviser", None)) { (idAdviser) =>
        controllers_Application_findRequestAdviser5_invoker.call(Application_2.get.findRequestAdviser(idAdviser))
      }
  
    // @LINE:22
    case controllers_Application_findRequestClient6_route(params) =>
      call(params.fromPath[Int]("idAdviser", None), params.fromPath[String]("documentType", None), params.fromPath[Int]("documentNumber", None)) { (idAdviser, documentType, documentNumber) =>
        controllers_Application_findRequestClient6_invoker.call(Application_2.get.findRequestClient(idAdviser, documentType, documentNumber))
      }
  
    // @LINE:25
    case controllers_Application_findAllMovements7_route(params) =>
      call { 
        controllers_Application_findAllMovements7_invoker.call(Application_2.get.findAllMovements)
      }
  
    // @LINE:28
    case controllers_Application_findMovementsById8_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_findMovementsById8_invoker.call(Application_2.get.findMovementsById(id))
      }
  
    // @LINE:37
    case controllers_Legacy_legacy9_route(params) =>
      call(params.fromPath[String]("documentType", None), params.fromPath[Int]("documentNumber", None)) { (documentType, documentNumber) =>
        controllers_Legacy_legacy9_invoker.call(Legacy_0.get.legacy(documentType, documentNumber))
      }
  
    // @LINE:40
    case controllers_Authentication_auth10_route(params) =>
      call { 
        controllers_Authentication_auth10_invoker.call(Authentication_3.get.auth())
      }
  
    // @LINE:41
    case controllers_Authentication_index11_route(params) =>
      call { 
        controllers_Authentication_index11_invoker.call(Authentication_3.get.index())
      }
  }
}