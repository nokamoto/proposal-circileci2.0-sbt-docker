package controllers

import org.scalatestplus.play.PlaySpec
import play.api.mvc.Results
import play.api.test.FakeRequest
import play.api.test.Helpers._

class ApplicationSpec extends PlaySpec with Results {
  "Application" should {
    "return TODO" in {
      val sut = new Application(stubControllerComponents())
      assert(status(sut.index(FakeRequest())) === NOT_IMPLEMENTED)
    }
  }
}
