package models

import play.api.libs.json.Json
import play.api.libs.json._


import play.api.libs.json.Json


case class User(
               var documentType: Int,
               var documentNumber: Int,
               var name: String,
               var products: List[Product]

            ){



    def toJson() = Json.obj(
      "documentType" -> this.documentType,
      "documentNumber" -> this.documentNumber,
      "name" -> this.name,
      "producta"-> Json.toJson(this.listToJson())


    )
    def listToJson()=
    {
      var arry = this.products.map(x => x.toJson())
      arry
    }



}
