package controllers

import play.api.mvc._
import play.api.libs.json.Json


import models.User
object Application extends Controller {

  var listaInt = List(3, 4, 2, 7)
  var us = new User("cc",1,"Holita","",listaInt,true);

  def home= Action {
    Ok(Json.toJson(us.products))
  }

//  Return User's products based on id and types of document
  def productsUser(document: Int, id: Int) = Action {
    // Data based query

   //List of products


    Ok(views.html.home("Tipo Documento: "+document+ "Id: "+id))
  }

}
