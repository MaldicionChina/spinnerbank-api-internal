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

}
