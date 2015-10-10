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

  def home= Action {
    Ok(Json.toJson(us.products))
  }

//  Return User's products based on id and types of document
  def productsUser(document: Int, id: Int) = Action {
    // Data based query

   //List of products
  val pr = usuarios.filter(x => (x.documentType ==document && x.documentNumber == id))

   // Ok(views.html.home("Tipo Documento: "+pr.head.documentType+ "Id: "+pr.head.firstName))
  Ok(Json.toJson(pr.head.products))
  }

}
