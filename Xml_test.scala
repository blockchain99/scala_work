import scala.io._
import scala.xml._
import scala.io.Source

object Xml_test {
  def main(args: Array[String]): Unit = {
    val xml = <hello></hello>
    println(xml)

    def getWeatherInfo(woeid: String) = {
      //http://weather.yahooapis.com/forecastrss?p=94089&u=c
      //val url = "http://weather.yahooapis.com/forecastrss?p=" + woeid + "&u=c" //94089
      val url = "http://weather.yahooapis.com/forecastrss?w=" + woeid + "&u=f" //2391271
      val response = Source.fromURL(url).mkString
      println(response)
      //    val html = Source.fromURL("http://google.com")
      //    val s = html.mkString
      //    println(s)
    }
// this is changed !
    getWeatherInfo("2391271")
  }

}
