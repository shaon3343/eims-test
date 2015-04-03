
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.admission.Course],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(courses: List[models.admission.Course]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.42*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("List of Courses")/*4.25*/{_display_(Seq[Any](format.raw/*4.26*/("""

 
  	"""),_display_(Seq[Any](/*7.5*/if(flash.get("msg"))/*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
         	<span>"""),_display_(Seq[Any](/*8.18*/flash/*8.23*/.get("msg"))),format.raw/*8.34*/("""</span>
     """)))})),format.raw/*9.7*/("""
  
  <table>
  <thead>
    <tr>
       <th>ID</th>
       <th>Course Name</th>
     </tr>
   </thead>
    <tbody>
    """),_display_(Seq[Any](/*19.6*/for(course <- courses) yield /*19.28*/ {_display_(Seq[Any](format.raw/*19.30*/("""
      <tr>
        <td><a href=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.CourseManagement.show(course.id))),format.raw/*21.62*/("""">"""),_display_(Seq[Any](/*21.65*/course/*21.71*/.id)),format.raw/*21.74*/("""</a></td>
        <td>"""),_display_(Seq[Any](/*22.14*/course/*22.20*/.name)),format.raw/*22.25*/("""</td>
      </tr> 
    """)))})),format.raw/*24.6*/("""
 </tbody>
 </table>

""")))})),format.raw/*28.2*/("""      """))}
    }
    
    def render(courses:List[models.admission.Course]): play.api.templates.Html = apply(courses)
    
    def f:((List[models.admission.Course]) => play.api.templates.Html) = (courses) => apply(courses)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/course/list.scala.html
                    HASH: 12f2dc1d3fc182076d81c4f987b3cb477e183563
                    MATRIX: 752->1|885->41|912->59|948->61|979->84|1017->85|1059->93|1087->113|1125->114|1178->132|1191->137|1223->148|1267->162|1422->282|1460->304|1500->306|1570->340|1585->346|1640->379|1679->382|1694->388|1719->391|1778->414|1793->420|1820->425|1875->449|1929->472
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|47->19|47->19|47->19|49->21|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|52->24|56->28
                    -- GENERATED --
                */
            