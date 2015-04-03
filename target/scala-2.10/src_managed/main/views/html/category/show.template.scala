
package views.html.category

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.Category,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(category: models.admission.Category):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.39*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("")/*4.10*/{_display_(Seq[Any](format.raw/*4.11*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*7.28*/category/*7.36*/.id)),format.raw/*7.39*/("""</td> </tr>
    <tr> <th >Category Name</th> <td>"""),_display_(Seq[Any](/*8.39*/category/*8.47*/.name)),format.raw/*8.52*/("""</td> </tr>
  </table>
   
     """),_display_(Seq[Any](/*11.7*/form(routes.CategoryManagement.edit(category.id))/*11.56*/ {_display_(Seq[Any](format.raw/*11.58*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*13.8*/("""
     """)))})),format.raw/*14.7*/("""
"""))}
    }
    
    def render(category:models.admission.Category): play.api.templates.Html = apply(category)
    
    def f:((models.admission.Category) => play.api.templates.Html) = (category) => apply(category)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/category/show.scala.html
                    HASH: aa7a0df98847536d86319a91a647dd7feee38a80
                    MATRIX: 750->1|880->38|907->56|943->58|959->66|997->67|1071->106|1087->114|1111->117|1196->167|1212->175|1238->180|1306->213|1364->262|1404->264|1484->313|1522->320
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|39->11|39->11|39->11|41->13|42->14
                    -- GENERATED --
                */
            