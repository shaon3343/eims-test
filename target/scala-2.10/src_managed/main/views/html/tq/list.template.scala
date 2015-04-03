
package views.html.tq

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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.admission.TeacherQualifications],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tqs: List[models.admission.TeacherQualifications]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.53*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("List of Teacher Qualifications")/*4.40*/{_display_(Seq[Any](format.raw/*4.41*/("""

 
  	"""),_display_(Seq[Any](/*7.5*/if(flash.get("msg"))/*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
         	<span>"""),_display_(Seq[Any](/*8.18*/flash/*8.23*/.get("msg"))),format.raw/*8.34*/("""</span>
     """)))})),format.raw/*9.7*/("""
  
  <table>
  <thead>
    <tr>
       <th>ID</th>
       <th>TQ Name</th>
     </tr>
   </thead>
    <tbody>
    """),_display_(Seq[Any](/*19.6*/for(tq <- tqs) yield /*19.20*/ {_display_(Seq[Any](format.raw/*19.22*/("""
      <tr>
        <td><a href=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.TQManagement.show(tq.id))),format.raw/*21.54*/("""">"""),_display_(Seq[Any](/*21.57*/tq/*21.59*/.id)),format.raw/*21.62*/("""</a></td>
        <td>"""),_display_(Seq[Any](/*22.14*/tq/*22.16*/.id)),format.raw/*22.19*/("""</td>
      </tr> 
    """)))})),format.raw/*24.6*/("""
 </tbody>
 </table>

""")))})),format.raw/*28.2*/("""      """))}
    }
    
    def render(tqs:List[models.admission.TeacherQualifications]): play.api.templates.Html = apply(tqs)
    
    def f:((List[models.admission.TeacherQualifications]) => play.api.templates.Html) = (tqs) => apply(tqs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/tq/list.scala.html
                    HASH: c8f040fde9ddcf9c88e794f1b17f7ced716d828a
                    MATRIX: 763->1|907->52|934->70|970->72|1016->110|1054->111|1096->119|1124->139|1162->140|1215->158|1228->163|1260->174|1304->188|1455->304|1485->318|1525->320|1595->354|1610->360|1657->385|1696->388|1707->390|1732->393|1791->416|1802->418|1827->421|1882->445|1936->468
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|47->19|47->19|47->19|49->21|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|52->24|56->28
                    -- GENERATED --
                */
            