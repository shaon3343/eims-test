
package views.html.student

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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.admission.Student],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(students: List[models.admission.Student]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.44*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("List of Students")/*4.26*/{_display_(Seq[Any](format.raw/*4.27*/("""

 
  	"""),_display_(Seq[Any](/*7.5*/if(flash.get("msg"))/*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
         	<span>"""),_display_(Seq[Any](/*8.18*/flash/*8.23*/.get("msg"))),format.raw/*8.34*/("""</span>
     """)))})),format.raw/*9.7*/("""
  
  <table>
  <thead>
    <tr>
       <th>ID</th>
       <th>Student Name</th>
     </tr>
   </thead>
    <tbody>
    """),_display_(Seq[Any](/*19.6*/for(student <- students) yield /*19.30*/ {_display_(Seq[Any](format.raw/*19.32*/("""
      <tr>
        <td><a href=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.StudentManagement.show(student.sid))),format.raw/*21.65*/("""">"""),_display_(Seq[Any](/*21.68*/student/*21.75*/.sid)),format.raw/*21.79*/("""</a></td>
        <img src="""),_display_(Seq[Any](/*22.19*/routes/*22.25*/.Assets.at("images/photos/"+student.sid+"_image.png"))),format.raw/*22.78*/(""" alt="" title="" width="64" height="64" border="0" />
        <td>"""),_display_(Seq[Any](/*23.14*/student/*23.21*/.name)),format.raw/*23.26*/("""</td>
        
      </tr> 
    """)))})),format.raw/*26.6*/("""
 </tbody>
 </table>

""")))})),format.raw/*30.2*/("""      """))}
    }
    
    def render(students:List[models.admission.Student]): play.api.templates.Html = apply(students)
    
    def f:((List[models.admission.Student]) => play.api.templates.Html) = (students) => apply(students)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/student/list.scala.html
                    HASH: 51a2ea6ff683d6534adbfe34e6db7f04bd136d68
                    MATRIX: 754->1|889->43|916->61|952->63|984->87|1022->88|1064->96|1092->116|1130->117|1183->135|1196->140|1228->151|1272->165|1428->286|1468->310|1508->312|1578->346|1593->352|1651->388|1690->391|1706->398|1732->402|1796->430|1811->436|1886->489|1989->556|2005->563|2032->568|2096->601|2150->624
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|47->19|47->19|47->19|49->21|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|54->26|58->30
                    -- GENERATED --
                */
            