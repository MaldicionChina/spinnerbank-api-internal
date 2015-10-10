package models

case class User(
                 documentType: Int,
                 documentNumber: Int,
                 firstName: String,
                 lastName: String,
                 products: List[Int],
                 active: Boolean)

object JsonFormats {
  import play.api.libs.json.Json

  // Generates Writes and Reads for Feed and User thanks to Json Macros
  implicit val userFormat = Json.format[User]
}