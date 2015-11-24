
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ferlinux/activator-dist-1.3.6/spinnerbank-api-internal-demo/conf/routes
// @DATE:Tue Nov 24 15:49:39 COT 2015


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
