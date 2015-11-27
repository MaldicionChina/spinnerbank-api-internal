// https://github.com/jasongoodwin/authentikat-jwt
package controllers

import authentikat.jwt._
import javax.inject.Inject
import scala.concurrent.Future

import play.api.mvc._
import play.api.libs.ws._
import play.api.libs.json.{Writes, Json, JsValue,JsArray, JsObject}


class Authentication extends Controller {
    
    def auth() = Action {
                 
      // Comparación de contraseñas para autenticación
      //if(){
      // Autenticación Exitosa
      // Ok()
      //}else{
      // Autenticación Fallida   
      // badRequest()
      //}
          
        val header = JwtHeader("HS256")
        val claimsSet = JwtClaimsSet(
            Map( 
                "documentType" -> "CC" ,
                "documentNumber" -> "123456789"
                )
            )
        val jwt: String = JsonWebToken(header, claimsSet, "secretkey")
        
        Ok("Authenticación Exitosa").withHeaders(
            "access_token"-> jwt,
            "expires_in" -> "3600")
    }
    
    def home = Action {
      Ok(views.html.index("spinnerbank-api-internal"))
    }
}