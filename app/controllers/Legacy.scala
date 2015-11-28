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

   
    def legacy(documentType:String,documentNumber:Int) = Action.async{
      
       
      // ws.url("https://spinnerbank-api-legacy.herokuapp.com/api/v1/customers/"+idProduct+"/products").get().map { response => Ok(response.json) ---> esto para devolver el Json completo
       
      ws.url("https://spinnerbank-api-legacy.herokuapp.com/api/v1/users/"+documentType+"-"+documentNumber+"/products").get().map { response =>
          val CustomerProduct =(response.json \\ "products")(0)
               //id: Int, clientIdType: String, clientIdNumber: Int, productType: String, productName: String, productBalance: Double
          val product = Product(1,"Asesor",1,(CustomerProduct \\"productType")(0).as[String],(CustomerProduct \\"name")(0).as[String],(response.json \\ "balance")(0).as[Double])
          Ok(Json.toJson(product)).withHeaders(
             ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
             ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept,Referer, User-Agent")
       }
       
        
    }


}