package models

import play.api.libs.json.Json
/**
 * Created by alexis on 16/10/15.
 */
case class Movement(
                id: Int,
                dateMovement: String,
                valueMovement: Double,
                description: String
                )

object Movement{
  implicit val movementFormat = Json.format[Movement]
}