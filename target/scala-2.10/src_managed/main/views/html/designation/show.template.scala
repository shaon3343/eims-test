
package views.html.designation

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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.Designation,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(designation: models.admission.Designation):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("")/*4.10*/{_display_(Seq[Any](format.raw/*4.11*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*7.28*/designation/*7.39*/.id)),format.raw/*7.42*/("""</td> </tr>
    <tr> <th >Designation Name</th> <td>"""),_display_(Seq[Any](/*8.42*/designation/*8.53*/.name)),format.raw/*8.58*/("""</td> </tr>
  </table>
   
     """),_display_(Seq[Any](/*11.7*/form(routes.DesignationManagement.edit(designation.id))/*11.62*/ {_display_(Seq[Any](format.raw/*11.64*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*13.8*/("""
     """)))})),format.raw/*14.7*/("""
"""))}
    }
    
    def render(designation:models.admission.Designation): play.api.templates.Html = apply(designation)
    
    def f:((models.admission.Designation) => play.api.templates.Html) = (designation) => apply(designation)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/designation/show.scala.html
                    HASH: 36ccada3a26e2318e9d4b4039a770ff202114c95
                    MATRIX: 756->1|892->44|919->62|955->64|971->72|1009->73|1083->112|1102->123|1126->126|1214->179|1233->190|1259->195|1327->228|1391->283|1431->285|1511->334|1549->341
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|39->11|39->11|39->11|41->13|42->14
                    -- GENERATED --
                */
            