package controllers

import play.api.mvc.{Action, Controller}

object Barcodes extends Controller {

  val ImageResolution = 144

  def barcode(ean: Long) = Action {
    
    import java.lang.IlligalArgumentException

    val MimeType = "image/png"
    try {
      val imageData = ean13BarCode(ean: MimeType)
        Ok(imageData).as(MimeType)
    }
    catch {
      case e: IllegalArgumentException =>
        BadRequest("Couldnt generate bar code. Error: " + e.getMessage)
    }
  }
}
