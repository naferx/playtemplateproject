package co.playtemplate.sales.controller

import org.joda.time.DateTime


case class CreateSaleRequest (clientId: Long, date: DateTime, products: List[ ProductRequest ] )


case class ProductRequest ( id: Long, quantity: Int )


