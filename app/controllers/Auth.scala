package controllers

import play.api.mvc.Results._
import play.api.mvc._
import scala.concurrent._


object AuthAction extends ActionBuilder[Request] {

    def invokeBlock[A](request: Request[A], block: (Request[A]) => Future[Result]) = {
        val valor = request.headers.get("access_token")
        if (valor == "") {

           Future.successful( Ok(request.headers.get("User-Agent").toString()))
            //Future.successful(Redirect("/"))
        } else {
            block(request)
        }
    }

}