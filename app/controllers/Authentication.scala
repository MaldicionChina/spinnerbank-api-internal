// https://github.com/jasongoodwin/authentikat-jwt
package controllers

import authentikat.jwt._
import javax.inject.Inject
import scala.concurrent.Future

import play.api.mvc._
import play.api.libs.ws._
import play.api.libs.json.{Writes, Json, JsValue,JsArray, JsObject}


class Authentication extends Controller {
    
    val secretkey: String = "dbqdrpEE9Mm66VUXGegUCmse"
    
    def auth(clientUser: String, passClient:String) = Action {
                 
      // Comparación de contraseñas para autenticación
      if( (clientUser == "alexis") && (passClient == "123456") ){
      // Autenticación Exitosa
                
        val header = JwtHeader("HS256")
        val claimsSet = JwtClaimsSet(
            Map( 
                "iss"-> "spinnerbank-api-internal.herokuapp.com",
                "exp"-> 1300819380,
                "role"-> "assesor",
                "sub" -> "alexisrodgtz@gmail.com"
                )
            )
            
        val jwt: String = JsonWebToken(header, claimsSet, secretkey)
        
        Ok("access_token :"+jwt)
      }else{
      // Autenticación Fallida   
        BadRequest("access_token :error 400")
      }

    }
    
    def home = Action {
      Ok(views.html.index("spinnerbank-api-internal"))
    }
}