
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.admission.Faculty],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(faculties: List[models.admission.Faculty]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("List of Faculties")/*4.27*/{_display_(Seq[Any](format.raw/*4.28*/("""

 
  	"""),_display_(Seq[Any](/*7.5*/if(flash.get("msg"))/*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
         	<span>"""),_display_(Seq[Any](/*8.18*/flash/*8.23*/.get("msg"))),format.raw/*8.34*/("""</span>
     """)))})),format.raw/*9.7*/("""
  
  <table>
  <thead>
    <tr>
       <th>ID</th>
       <th>Faculty Name</th>
     </tr>
   </thead>
    <tbody>
    """),_display_(Seq[Any](/*19.6*/for(faculty <- faculties) yield /*19.31*/ {_display_(Seq[Any](format.raw/*19.33*/("""
      <tr>
        <td><a href=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.FacultyManagement.show(faculty.id))),format.raw/*21.64*/("""">"""),_display_(Seq[Any](/*21.67*/faculty/*21.74*/.id)),format.raw/*21.77*/("""</a></td>
        <td>"""),_display_(Seq[Any](/*22.14*/faculty/*22.21*/.name)),format.raw/*22.26*/("""</td>
      </tr> 
    """)))})),format.raw/*24.6*/("""
 </tbody>
 </table>

""")))})),format.raw/*28.2*/("""      """))}
    }
    
    def render(faculties:List[models.admission.Faculty]): play.api.templates.Html = apply(faculties)
    
    def f:((List[models.admission.Faculty]) => play.api.templates.Html) = (faculties) => apply(faculties)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/faculty/list.scala.html
                    HASH: 42ba1de96486d6ee350e3074141d68fc5cab5074
                    MATRIX: 754->1|890->44|917->62|953->64|986->89|1024->90|1066->98|1094->118|1132->119|1185->137|1198->142|1230->153|1274->167|1430->288|1471->313|1511->315|1581->349|1596->355|1653->390|1692->393|1708->400|1733->403|1792->426|1808->433|1835->438|1890->462|1944->485
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|47->19|47->19|47->19|49->21|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|52->24|56->28
                    -- GENERATED --
                */
            