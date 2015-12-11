
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/emmanuelhcpk/scala/jadiosa/spinnerbank-api-internal/conf/routes
// @DATE:Thu Dec 10 21:35:47 COT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
