package co.naferx.playtemplate.sales

import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}

import scala.concurrent.Future


class SalesController extends Controller {

  def hi = Action.async {
    Future.successful(Ok(Json.obj("status" -> "OK", "message" -> "service responding")))
  }
}
