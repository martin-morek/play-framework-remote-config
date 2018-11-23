package controllers

import com.typesafe.config.Config
import javax.inject.{Inject, Singleton}
import play.api.mvc._

@Singleton
class Application @Inject()(config: Config, cc: ControllerComponents) extends AbstractController(cc) {

  val RemoteMessage = config.getString("message")

  def index = Action {
    Ok(views.html.index(s"Message from remote config is: $RemoteMessage"))
  }

}