
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""



"""),_display_(/*5.2*/message),format.raw/*5.9*/("""

"""),format.raw/*7.1*/("""<dl>
<dt>Para consultar movimiento  de un productos</dt>
<dd> product/"""),format.raw/*9.14*/("""{"""),format.raw/*9.15*/(""":idProduct"""),format.raw/*9.25*/("""}"""),format.raw/*9.26*/("""/movements  donde  idProduct para pruebas puede tomar valor de 1, 2 3,4,5 y 6</dd>
</dl>
<br>
<dl>
<dt>Para consultar productos dado  tipo y numero de documento</dt>
<dd>/user/"""),format.raw/*14.11*/("""{"""),format.raw/*14.12*/("""documentType"""),format.raw/*14.24*/("""}"""),format.raw/*14.25*/("""/"""),format.raw/*14.26*/("""{"""),format.raw/*14.27*/("""documentoNumber"""),format.raw/*14.42*/("""}"""),format.raw/*14.43*/("""/products     donde documentType puede ser  cc ó ce... y documentNumber puede ser 123 ó 456</dd>
</dl>

<dl>
<dt>Otra forma Para consultar productos dado  tipo y numero de documento (la ruta es con productos no con products)</dt>
<dd>/user/"""),format.raw/*19.11*/("""{"""),format.raw/*19.12*/("""documentType"""),format.raw/*19.24*/("""}"""),format.raw/*19.25*/("""/"""),format.raw/*19.26*/("""{"""),format.raw/*19.27*/("""documentoNumber"""),format.raw/*19.42*/("""}"""),format.raw/*19.43*/("""/productos     donde documentType puede ser  cc ó ce... y documentNumber puede ser 123 ó 456</dd>
</dl>

<dl>
<dt>Para consultar productos de un usuario desde legacy</dt>
<dd>/legacy/products/"""),format.raw/*24.22*/("""{"""),format.raw/*24.23*/("""documentType"""),format.raw/*24.35*/("""}"""),format.raw/*24.36*/("""/"""),format.raw/*24.37*/("""{"""),format.raw/*24.38*/("""documentoNumber"""),format.raw/*24.53*/("""}"""),format.raw/*24.54*/("""  """),format.raw/*24.56*/("""documentType = cc documentoNumber = 789456123</dd>
</dl>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 21:20:00 COT 2015
                  SOURCE: /Users/emmanuelhcpk/scala/jadiosa/spinnerbank-api-internal/app/views/index.scala.html
                  HASH: 6ae17c47816e0e16f3bb8fba980b0b8480dfb529
                  MATRIX: 527->1|639->18|669->23|695->30|723->32|820->102|848->103|885->113|913->114|1117->290|1146->291|1186->303|1215->304|1244->305|1273->306|1316->321|1345->322|1613->562|1642->563|1682->575|1711->576|1740->577|1769->578|1812->593|1841->594|2061->786|2090->787|2130->799|2159->800|2188->801|2217->802|2260->817|2289->818|2319->820
                  LINES: 20->1|25->1|29->5|29->5|31->7|33->9|33->9|33->9|33->9|38->14|38->14|38->14|38->14|38->14|38->14|38->14|38->14|43->19|43->19|43->19|43->19|43->19|43->19|43->19|43->19|48->24|48->24|48->24|48->24|48->24|48->24|48->24|48->24|48->24
                  -- GENERATED --
              */
          