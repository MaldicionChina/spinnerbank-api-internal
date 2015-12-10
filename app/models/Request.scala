package models

import play.api.libs.json.Json

case class Request (idRequest: Int,documentType:String, documentNumber: Int, clientName:String,lastName:String, cupo: Double, productType:String, productName:String, dateRequest:String,state:String , idAdviser:Int)

object RequestFormats{
    
    implicit val  RequestFormat = Json.format[Request]
}
