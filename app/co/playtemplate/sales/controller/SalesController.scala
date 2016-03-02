package co.playtemplate.sales.controller

import play.api.mvc.{Action, Controller}

import scala.concurrent.Future
import javax.inject.Singleton

@Singleton
class SalesController extends Controller {

  def addSale = Action.async {
    Future.successful( Ok("under construction") )
  }

}
