
package views.html.course

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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.Course,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(course: models.admission.Course):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("")/*4.10*/{_display_(Seq[Any](format.raw/*4.11*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*7.28*/course/*7.34*/.id)),format.raw/*7.37*/("""</td> </tr>
    <tr> <th >Course Name</th> <td>"""),_display_(Seq[Any](/*8.37*/course/*8.43*/.name)),format.raw/*8.48*/("""</td> </tr>
  </table>
   
     """),_display_(Seq[Any](/*11.7*/form(routes.CourseManagement.edit(course.id))/*11.52*/ {_display_(Seq[Any](format.raw/*11.54*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*13.8*/("""
     """)))})),format.raw/*14.7*/("""
"""))}
    }
    
    def render(course:models.admission.Course): play.api.templates.Html = apply(course)
    
    def f:((models.admission.Course) => play.api.templates.Html) = (course) => apply(course)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/course/show.scala.html
                    HASH: 9b791f4b3934192f8ff9c13ef5062bf4a5d2ff93
                    MATRIX: 746->1|872->34|899->52|935->54|951->62|989->63|1063->102|1077->108|1101->111|1184->159|1198->165|1224->170|1292->203|1346->248|1386->250|1466->299|1504->306
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|39->11|39->11|39->11|41->13|42->14
                    -- GENERATED --
                */
            