
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/emmanuelhcpk/scala/jadiosa/spinnerbank-api-internal/conf/routes
// @DATE:Thu Dec 10 21:35:47 COT 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseLegacy Legacy = new controllers.ReverseLegacy(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAuthentication Authentication = new controllers.ReverseAuthentication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseLegacy Legacy = new controllers.javascript.ReverseLegacy(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAuthentication Authentication = new controllers.javascript.ReverseAuthentication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
