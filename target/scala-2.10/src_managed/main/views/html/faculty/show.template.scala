
package views.html.faculty

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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.Faculty,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(faculty: models.admission.Faculty):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("")/*4.10*/{_display_(Seq[Any](format.raw/*4.11*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*7.28*/faculty/*7.35*/.id)),format.raw/*7.38*/("""</td> </tr>
    <tr> <th >Faculty Name</th> <td>"""),_display_(Seq[Any](/*8.38*/faculty/*8.45*/.name)),format.raw/*8.50*/("""</td> </tr>
  </table>
   
     """),_display_(Seq[Any](/*11.7*/form(routes.FacultyManagement.edit(faculty.id))/*11.54*/ {_display_(Seq[Any](format.raw/*11.56*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*13.8*/("""
  		""")))})),format.raw/*14.6*/("""
"""))}
    }
    
    def render(faculty:models.admission.Faculty): play.api.templates.Html = apply(faculty)
    
    def f:((models.admission.Faculty) => play.api.templates.Html) = (faculty) => apply(faculty)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/faculty/show.scala.html
                    HASH: 5f0d05c09885befb59aa97b7b52b28dd56ea329c
                    MATRIX: 748->1|876->36|903->54|939->56|955->64|993->65|1067->104|1082->111|1106->114|1190->163|1205->170|1231->175|1299->208|1355->255|1395->257|1475->306|1512->312
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|39->11|39->11|39->11|41->13|42->14
                    -- GENERATED --
                */
            