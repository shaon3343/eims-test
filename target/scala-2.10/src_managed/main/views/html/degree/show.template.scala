
package views.html.degree

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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.Degree,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(degree: models.admission.Degree):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("")/*4.10*/{_display_(Seq[Any](format.raw/*4.11*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*7.28*/degree/*7.34*/.id)),format.raw/*7.37*/("""</td> </tr>
    <tr> <th >Degree Name</th> <td>"""),_display_(Seq[Any](/*8.37*/degree/*8.43*/.name)),format.raw/*8.48*/("""</td> </tr>
  </table>
   
     """),_display_(Seq[Any](/*11.7*/form(routes.DegreeManagement.edit(degree.id))/*11.52*/ {_display_(Seq[Any](format.raw/*11.54*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*13.8*/("""
     """)))})),format.raw/*14.7*/("""
"""))}
    }
    
    def render(degree:models.admission.Degree): play.api.templates.Html = apply(degree)
    
    def f:((models.admission.Degree) => play.api.templates.Html) = (degree) => apply(degree)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/degree/show.scala.html
                    HASH: dd879b7b07404dd64e89873156b0a13aa655771a
                    MATRIX: 746->1|872->34|899->52|935->54|951->62|989->63|1063->102|1077->108|1101->111|1184->159|1198->165|1224->170|1292->203|1346->248|1386->250|1466->299|1504->306
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|39->11|39->11|39->11|41->13|42->14
                    -- GENERATED --
                */
            