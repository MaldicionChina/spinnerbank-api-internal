package models

import play.api.libs.json.Json

case class User(
               var documentType: Int,
               var documentNumber: Int,
               var userName: String,
               var products: List[Product]
            )

object User{
  implicit val userFormat = Json.format[User]
}

