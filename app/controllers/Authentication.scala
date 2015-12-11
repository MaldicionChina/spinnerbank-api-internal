// https://github.com/jasongoodwin/authentikat-jwt
package controllers

import authentikat.jwt._
import javax.inject.Inject
import scala.concurrent.Future

import play.api.mvc._
import play.api.libs.ws._
import play.api.libs.json.{Writes, Json, JsValue,JsArray, JsObject}


class Authentication extends Controller {
    

    def index = AuthAction {
        Ok(views.html.index("You are logged in."))
      }
      
    val secretkey: String = "dbqdrpEE9Mm66VUXGegUCmse"
    
    def auth() = Action { request =>

     def name = request.body.asFormUrlEncoded.get("email")(0)  
     def password = request.body.asFormUrlEncoded.get("password")(0)                 
               
      // Comparación de contraseñas para autenticación
      if( (name == "flameAdmin@flame.com") && (password == "F14M3") ){
      // Autenticación Exitosa
                
        val header = JwtHeader("HS256")
        val claimsSet = JwtClaimsSet(
            Map( 
                "iss"-> "spinnerbank-api-internal.herokuapp.com",
                "role"-> "user",
                "email" -> "flameAdmin@flame.com",
                "id" -> "1216"
                
                )
            )
            
        val jwt: String = JsonWebToken(header, claimsSet, secretkey)
        
        Ok("access_token :"+jwt)
      }else{
      // Autenticación Fallida   
        BadRequest("access_token :error 400")
      }

    }
    
    def temporalEmberAuth(user:String,pass:String) = Action{
         val info = "{"+
              "\"iss\":  \"spinnerbank-api-internal.herokuapp.com\","+
              "\"role\":  \"user\","+
              "\"email\": \"flameAdmin@flame.com\","+
              "\"id\": \"1216\""+
            "}";
        Ok(info)
    }
    
    def home = Action {
      Ok(views.html.index("spinnerbank-api-internal"))
    }
}