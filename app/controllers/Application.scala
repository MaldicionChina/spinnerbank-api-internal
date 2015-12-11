package controllers


import javax.inject.Inject
import play.api._
import play.api.mvc._
import org.joda.time.DateTime
import play.api.libs.json.{Writes, Json, JsValue,JsArray, JsObject}
import scala.concurrent.Future
import play.api.libs.concurrent.Execution.Implicits.defaultContext

import models.MovementFormats._
import models.RequestFormats._
import models.UserFormats._
import models.ProductFormats._
import models.ClientFormats._
import models.Product
import models.User
import models.Client
import models.Movement
import models.Request

import reactivemongo.api.Cursor

import play.modules.reactivemongo.json._
import play.modules.reactivemongo.{
  MongoController, ReactiveMongoApi, ReactiveMongoComponents
}

import play.modules.reactivemongo.json._, ImplicitBSONHandlers._
import play.modules.reactivemongo.json.collection._

// Token JWT
import authentikat.jwt._

class Application @Inject() (

  val reactiveMongoApi: ReactiveMongoApi)
    extends Controller with MongoController with ReactiveMongoComponents {
           
    def collection :JSONCollection = db.collection[JSONCollection]("movements")
    def requestCollection :JSONCollection = db.collection[JSONCollection]("request")
     
    def home = Action {
      Ok(views.html.home("spinnerbank-api-internal"))
    }
    
  
      def findAllMovements = Action.async{
        val cursor: Cursor[Movement] = collection.find(Json.obj()).cursor[Movement]
        val futureMovementList: Future[List[Movement]] = cursor.collect[List]()
        val futureMovementJsonArray :Future[JsArray]=futureMovementList.map{
          movement => Json.arr(movement)
        }
        futureMovementJsonArray.map{
          movement =>Ok(movement).withHeaders(
              ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
              ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept,Referer, User-Agent")
        }
    }
    
     def findMovementsById(id:Int) = Action.async{
    
        val cursor: Cursor[Movement] = collection.find(Json.obj("id"->id)).cursor[Movement]
        val futureMovementList: Future[List[Movement]] = cursor.collect[List]()
        val futureMovementJsonArray :Future[JsArray]=futureMovementList.map{
          movement => Json.arr(movement)
        }
        futureMovementJsonArray.map{
          movement =>Ok(movement).withHeaders(
              ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
              ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept,Referer, User-Agent")
        }
    }
    
       //Metodo para buscar solicitudes
     def findAllRequest(idAdviser:Int) = Action.async{
        val cursor: Cursor[Request] = requestCollection.find(Json.obj("idAdviser"->idAdviser)).cursor[Request]
        val futureRequestList: Future[List[Request]] = cursor.collect[List]()
        val futureRequestJsonArray :Future[JsArray]=futureRequestList.map{
          request => Json.arr(request)
        }
        futureRequestJsonArray.map{
          request =>Ok(request).withHeaders(
              ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
              ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept,Referer, User-Agent")
        }
    }
    
    def findRequestByClient(idAdviser:Int,documentType:String,documentNumber:Int) = Action.async{
        val cursor: Cursor[Request] = requestCollection.find(Json.obj("documentType"->documentType,"documentNumber"->documentNumber,"idAdviser"->idAdviser)).cursor[Request]
        val futureRequestList: Future[List[Request]] = cursor.collect[List]()
        val futureRequestJsonArray :Future[JsArray]=futureRequestList.map{
          request => Json.arr(request)
        }
        futureRequestJsonArray.map{
          request =>Ok(request).withHeaders(
              ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
              ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept,Referer, User-Agent")
        }
    }
    
   //hasta aca va lo de mongo, de qui en adelante   son datos quemados para  dejar el servicio que hasta el momento está consumiendo el front-end  
      var mov1 = new Movement(1,2,500.34,"Retiro",new DateTime().toString())
      var mov2 = new Movement(2,3,500,"Pago cuota",new DateTime().toString())
      var mov3 = new Movement(3,2,5500,"Reverso",new DateTime().toString())
      var mov4 = new Movement(4,2,500,"Avance",new DateTime().toString())
      var mov5 = new Movement(5,3,500,"Pago cuota",new DateTime().toString())
      var mov6 = new Movement(6,1,5500,"Abono",new DateTime().toString())
      var mov7 = new Movement(7,1,500,"Abono",new DateTime().toString())
      var mov8 = new Movement(8,4,500,"Pago interes",new DateTime().toString())
      var mov9 = new Movement(9,5,500,"Apertura",new DateTime().toString())
      var mov10 = new Movement(10,6,500,"Desembolso",new DateTime().toString())
        
      var movements = List(mov1,mov2,mov3,mov4,mov5,mov6,mov7,mov8,mov9,mov10)
        
      var producto1 = new Product(1,"cc",123,"Ahorro","CDT",200.25)
      var producto2 = new Product(2,"cc",123,"Debito","Cuenta corriente",2000000)
      var producto3 = new Product(3,"ce",456,"Credito","Vivienda",1500000)
      var producto4 = new Product(4,"ce",456,"Credito","Vehiculo",1500000)
      var producto5 = new Product(5,"ce",456,"Ahorro","CDT",200.25)
      var producto6 = new Product(6,"cc",123,"Credito","Credito gerencia",1500000)
      
      var products = List (producto1,producto2,producto3,producto4,producto5,producto6)
      
      var user1 = new User("cc",123,"Alexis","Rodriguez",products.filter(product =>product.clientIdType == "cc" &&product.clientIdNumber == 123))
      var user2 = new User("ce",456,"Emmanuel","Velez",products)
      var users =List(user1,user2)
     
      var request1 =new Request(1,"cc",123,"Fer","Rodriguez",250000.0,"Ahorro","CDAT",new DateTime().toString(),"Pendiente",1216)
      var request2 =new Request(2,"cc",123,"Fer","Rodriguez",25000000.0,"Crédito","Vivienda",new DateTime().toString(),"Aprobada",1216) 
      var request3 =new Request(3,"cc",456,"Jose","Sanabria",250000.0,"Ahorro","CDAT",new DateTime().toString(),"Pendiente",4191)
      var request4 =new Request(4,"cc",456,"Jose","Sanabria",250000.0,"Ahorro","CDAT",new DateTime().toString(),"Pendiente",1216)
      
      var cliente = new Client("cc",123,"Rafael","Patiño","flameAdmin@flame.com",
                            "12345678","calle 67 No. 53 - 108", "-112.234,33.5",
                            "https://fbcdn-sphotos-b-a.akamaihd.net/hphotos-ak-xtp1/v/t1.0-9/12243113_903274886427851_7865177271505574706_n.jpg?oh=38daf22dee688eaf59f5d6abf448e41d&oe=57205168&__gda__=1457947230_5294a5ec394e64f5658488678468a3ab" )
                            
      val error : JsValue = Json.parse("""{"error":404, " description": "not found"}""")                            

      def allClient(documentType:String,documentNumber:Int) = Action{
          
          if("cc" == documentType && 123 == documentNumber){
              Ok(Json.toJson(cliente)).withHeaders(
              ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
              ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept,Referer, User-Agent")
          }else{
              Ok(error)
          }
      } 
       
      var requests = List (request1,request2,request3,request4)
      
          
      
    
      def findRequestAdviser(idAdviser:Int) = Action{
 
          val result = requests.filter(request =>request.idAdviser ==idAdviser)
            if(result.size ==0) {
              Ok(error)
            }else {
              Ok(Json.toJson(result)).withHeaders(
              ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
              ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept,Referer, User-Agent")
            }
          
      }
      
      
      def findRequestClient(idAdviser:Int,documentType:String,documentNumber:Int)  = Action{
 
          val result = requests.filter(request =>request.idAdviser ==idAdviser && request.documentType ==documentType && request.documentNumber == documentNumber)
            if(result.size ==0) {
              Ok(error)
            }else {
              Ok(Json.toJson(result)).withHeaders(
              ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
              ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept,Referer, User-Agent")
            }
          
      }
      
     
    
      def findMovement(idProduct:Int) = Action{
       
          val result = movements.filter(movement =>movement.idProduct ==idProduct)
            if(result.size ==0) {
              Ok(error)
            }else {
              Ok(Json.toJson(result)).withHeaders(
              ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
              ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept,Referer, User-Agent")
            }
          
      }
      
      def findProductsClient(documentType:String,documentNumber:Int) = Action{
          
          val result =products.filter(product => product.clientIdType == documentType && product.clientIdNumber == documentNumber)
          
          if(result.size ==0) {
              Ok(error)
            }else {
              Ok(Json.toJson(result)).withHeaders(
              ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
              ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept,Referer, User-Agent")
            }
          
      }
        
      def findClient(documentType:String,documentNumber:Int) = Action{
          
          val result = users.filter(user => user.documentType == documentType && user.documentNumber == documentNumber)
          
          if(result.size ==0) {
              Ok(error)
            }else {
              Ok(Json.toJson(result)).withHeaders(
              ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
              ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept,Referer, User-Agent")
            }
          
      }    
      
      def authClient(documentType:String,documentNumber:Int, clientPassword: String)
      {
          val client = findClient(documentType,documentNumber)
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
            "documentType" -> documentType ,
            "documentNumber" -> documentNumber.toString)
            )
            
          val jwt: String = JsonWebToken(header, claimsSet, "secretkey")

          Ok("Authenticación Exitosa").withHeaders(
              "access_token"-> jwt,
              "expires_in" -> "3600",
              ACCESS_CONTROL_ALLOW_ORIGIN -> "*",
              ACCESS_CONTROL_ALLOW_HEADERS -> "Origin, X-Requested-With, Content-Type, Accept,Referer, User-Agent")
      }
      

}
