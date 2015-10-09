package controllers

import play.api.mvc._

object Application extends Controller {

  def home= Action {
    Ok(views.html.home("FLAME's API"))
  }
}
