package models


import play.api.libs.json.Json

/**
 * Created by emmanuelhcpk on 15/10/15.
 */
case class Product(
               var productName: String,
               var productType: Int,
               var productBalance: Double,
               var movements: List[Movement]
               )

object Product{
  implicit val productFormat = Json.format[Product]
}