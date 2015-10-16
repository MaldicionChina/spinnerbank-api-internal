package models

import models.Product

class User(
               var documentType: Int,
               var documentNumber: Int,
               var userName: String,
               var products: List[Product]
            )
