package controllers

import play.api.mvc.{Action, Controller}
import models.Product

object Application extends Controller {

  def index = Action {
    Redirect(routes.Products.list())
  }

}
