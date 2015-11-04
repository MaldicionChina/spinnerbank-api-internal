package models

import play.api.libs.json.Json
import org.joda.time.DateTime


/**
 * Created by alexis on 16/10/15.
 */


case class Movement (id: Int,valueMovement: Double, description: String, dateMovement:DateTime){

 def toJson() = Json.obj(
    "dateMovement" -> this.dateMovement,
    "value" -> this.valueMovement,
    "description" -> this.description

  )
}
object JsonFormats{
    
    implicit val MovementFormat = Json.format[Movement]
}


  



