
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.admission.Department],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(depts: List[models.admission.Department]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.44*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("List of Departments")/*4.29*/{_display_(Seq[Any](format.raw/*4.30*/("""

 
  	"""),_display_(Seq[Any](/*7.5*/if(flash.get("msg"))/*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
         	<span>"""),_display_(Seq[Any](/*8.18*/flash/*8.23*/.get("msg"))),format.raw/*8.34*/("""</span>
     """)))})),format.raw/*9.7*/("""
  
  <table>
  <thead>
    <tr>
       <th>ID</th>
       <th>Department Name</th>
     </tr>
   </thead>
    <tbody>
    """),_display_(Seq[Any](/*19.6*/for(dept <- depts) yield /*19.24*/ {_display_(Seq[Any](format.raw/*19.26*/("""
      <tr>
        <td><a href=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.DepartmentManagement.show(dept.id))),format.raw/*21.64*/("""">"""),_display_(Seq[Any](/*21.67*/dept/*21.71*/.id)),format.raw/*21.74*/("""</a></td>
        <td>"""),_display_(Seq[Any](/*22.14*/dept/*22.18*/.name)),format.raw/*22.23*/("""</td>
      </tr> 
    """)))})),format.raw/*24.6*/("""
 </tbody>
 </table>

""")))})),format.raw/*28.2*/("""      """))}
    }
    
    def render(depts:List[models.admission.Department]): play.api.templates.Html = apply(depts)
    
    def f:((List[models.admission.Department]) => play.api.templates.Html) = (depts) => apply(depts)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/department/list.scala.html
                    HASH: 578d419501ff4b6c32219b8e58504e94614daec8
                    MATRIX: 760->1|895->43|922->61|958->63|993->90|1031->91|1073->99|1101->119|1139->120|1192->138|1205->143|1237->154|1281->168|1440->292|1474->310|1514->312|1584->346|1599->352|1656->387|1695->390|1708->394|1733->397|1792->420|1805->424|1832->429|1887->453|1941->476
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|47->19|47->19|47->19|49->21|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|52->24|56->28
                    -- GENERATED --
                */
            