package controllers

import play.api.mvc._
import play.api.libs.json.Json


import models.User
object Application extends Controller {

  var listaInt = List(3, 4, 2, 7)
  var us = new User("cc",1,"Holita","",listaInt,true);
  var us2 = new User("cc",2,"prueba","",listaInt,true);
  var us3 = new User("cc",3,"prueba2","",listaInt,true);
  var usuarios= List(us,us2,us3);

  def home= Action {
    Ok(Json.toJson(us.products))
  }
  def find(document: Int, id: Int)=
  {
    var us
    def comparador(x: User) = {
      if (x.documentType == document && x.documentNumber == id)
        {
          us = x;
        }
    }
    usuarios.map(user => comparador(user))
    return us;
  }


//  Return User's products based on id and types of document
  def productsUser(document: Int, id: Int) = Action {
    // Data based query

   //List of products


    Ok(views.html.home("Tipo Documento: "+document+ "Id: "+id))
  }

}
