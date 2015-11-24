package controllers

import javax.inject.Inject
import scala.concurrent.Future

import play.api.mvc._
import play.api.libs.ws._
import play.api.libs.json.{Writes, Json, JsValue,JsArray, JsObject}

import models.Product
import models.ProductFormats._

class Legacy @Inject() (ws: WSClient) extends Controller{

    implicit val context = play.api.libs.concurrent.Execution.Implicits.defaultContext

   
    def legacy(idProduct: Int) = Action.async{
      
       
       // ws.url("https://spinnerbank-api-legacy.herokuapp.com/api/v1/customers/"+idProduct+"/products").get().map { response => Ok(response.json) ---> esto para devolver el Json completo
        
       ws.url("https://spinnerbank-api-legacy.herokuapp.com/api/v1/customers/"+idProduct+"/products").get().map { response =>
           val CustomerProduct =(response.json \\ "CustomerProduct")(0)
           val product = Product((response.json \\ "id")(0).as[Int], "cc",(CustomerProduct \\"CustomerId")(0).as[Int], (response.json \\ "productType")(0).as[String],(response.json \\ "name")(0).as[String],(CustomerProduct \\"balance")(0).as[String].toDouble)
           Ok(Json.toJson(product)).withHeaders(
              ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
              ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept,Referer, User-Agent")
        }
       
        
    }


}