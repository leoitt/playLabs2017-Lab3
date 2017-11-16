
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
    </head>
    <body>
        <!--Common nav menu shared by all pages v1
        <ul>
            <li><a href="/">Home</a></li>
            <li><a href="/about">About</a></li>
            <li><a href="/products">Products</a></li>
        </ul>-->

        <!-- List containing nav links v2-->
        <ul class="nav navbar-nav">
            <li><a href=""""),_display_(/*27.27*/routes/*27.33*/.HomeController.index()),format.raw/*27.56*/("""">Home</a></li>
            <li><a href=""""),_display_(/*28.27*/routes/*28.33*/.HomeController.about()),format.raw/*28.56*/("""">About Us</a></li>
            <li><a href=""""),_display_(/*29.27*/routes/*29.33*/.HomeController.products()),format.raw/*29.59*/("""">Products</a></li>
        </ul>

        <!-- Page content-->
        """),_display_(/*33.10*/content),format.raw/*33.17*/("""
        """),format.raw/*34.9*/("""<!-- Shared footer-->
        <hr>
        <h4>Copyright &copy 2017</h4>

        <script src=""""),_display_(/*38.23*/routes/*38.29*/.Assets.versioned("javascripts/main.js")),format.raw/*38.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 16 00:08:48 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/Lab3/app/views/main.scala.html
                  HASH: 5fcbf8ce5072c5e12ec0f7c7e208f091ac450316
                  MATRIX: 1206->260|1331->290|1359->292|1439->397|1475->406|1510->414|1536->419|1625->481|1640->487|1703->528|1791->589|1806->595|1867->634|2253->993|2268->999|2312->1022|2381->1064|2396->1070|2440->1093|2513->1139|2528->1145|2575->1171|2675->1244|2703->1251|2739->1260|2862->1356|2877->1362|2938->1402
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|64->33|64->33|65->34|69->38|69->38|69->38
                  -- GENERATED --
              */
          