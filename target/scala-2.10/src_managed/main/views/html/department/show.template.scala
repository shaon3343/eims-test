
package views.html.department

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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.Department,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(department: models.admission.Department):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("")/*4.10*/{_display_(Seq[Any](format.raw/*4.11*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*7.28*/department/*7.38*/.id)),format.raw/*7.41*/("""</td> </tr>
    <tr> <th >Department Name</th> <td>"""),_display_(Seq[Any](/*8.41*/department/*8.51*/.name)),format.raw/*8.56*/("""</td> </tr>
  </table>
   
     """),_display_(Seq[Any](/*11.7*/form(routes.DepartmentManagement.edit(department.id))/*11.60*/ {_display_(Seq[Any](format.raw/*11.62*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*13.8*/("""
  		""")))})),format.raw/*14.6*/("""
"""))}
    }
    
    def render(department:models.admission.Department): play.api.templates.Html = apply(department)
    
    def f:((models.admission.Department) => play.api.templates.Html) = (department) => apply(department)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/department/show.scala.html
                    HASH: 4445ef6ddfe0ead1c73856bc460f4632c179b242
                    MATRIX: 754->1|888->42|915->60|951->62|967->70|1005->71|1079->110|1097->120|1121->123|1208->175|1226->185|1252->190|1320->223|1382->276|1422->278|1502->327|1539->333
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|39->11|39->11|39->11|41->13|42->14
                    -- GENERATED --
                */
            