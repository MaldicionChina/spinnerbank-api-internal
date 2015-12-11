package models

import play.api.libs.json.Json

case class Client(
                documentType:String, 
                documentNumber: Int, 
                clientName:String,
                lastName:String, 
                email:String,
                cellNumber:String,
                adress:String,
                geoAdress:String,
                urlPhoto:String)


object ClientFormats{
    
    implicit val  ClientFormat = Json.format[Client]
}

