package co.naferx.playtemplate.sales

import play.api.mvc.{ Action, Controller }

import scala.concurrent.Future


class SalesController extends Controller {

  def addSale = Action.async {
    Future.successful( Ok("under construction") )
  }

}
