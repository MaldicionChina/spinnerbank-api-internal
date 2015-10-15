package controllers

import play.api.mvc._
import play.api.libs.json.Json


import models.User

object Application extends Controller {

  var listaInt = List("creditos", "CDT","Hipoteca", "Datadebito")
  var us = new User(1,1,"Holita","",listaInt,true);
  var us2 = new User(1,2,"prueba","",listaInt,true);
  var us3 = new User(1,3,"prueba2","",listaInt,true);
  var usuarios= List(us,us2,us3);


//  Datos de prueba para detalle de producto
  var productName = "credito";
  var listDetail = "[{\"id\":1,\"name\":\"CDT\",\"productType\":\"Preferencial\",\"createdAt\":" +
    "\"2015-10-14T21:25:41.456Z\",\"updatedAt\":\"2015-10-14T21:25:41.456Z\",\"CustomerProduct\":" +
    "{\"balance\":\"100.00\",\"createdAt\":\"2015-10-14T21:25:41.525Z\",\"updatedAt\":\"2015-10-14T21:25:41.525Z\"," +
    "\"ProductId\":1,\"CustomerId\":1}}]"

  def home= Action {
    Ok(Json.toJson(us.products))
  }

//  Return User's products based on id and types of document
  def productsUser(document: Int, id: Int) = Action {
    // Query a la base de datos SQL

   //List of products
  val pr = usuarios.filter(x => (x.documentType ==document && x.documentNumber == id))

   // Ok(views.html.home("Tipo Documento: "+pr.head.documentType+ "Id: "+pr.head.firstName))
     Ok(Json.toJson(pr.head.products))
  }


  def detailProductUser(id: Int,document: Int, productId: Int) = Action {
    // Consumo del API del back-end-legacy
    // EJ de URL: https://spinnerbank-api-legacy.herokuapp.com/api/v1/customers/1/products

     Ok(Json.toJson(listDetail))
  }

}
