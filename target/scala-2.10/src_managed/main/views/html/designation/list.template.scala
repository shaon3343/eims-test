
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.admission.Designation],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(designations: List[models.admission.Designation]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.52*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("List of Designations")/*4.30*/{_display_(Seq[Any](format.raw/*4.31*/("""

 
  	"""),_display_(Seq[Any](/*7.5*/if(flash.get("msg"))/*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
         	<span>"""),_display_(Seq[Any](/*8.18*/flash/*8.23*/.get("msg"))),format.raw/*8.34*/("""</span>
     """)))})),format.raw/*9.7*/("""
  
  <table>
  <thead>
    <tr>
       <th>ID</th>
       <th>Designation Name</th>
     </tr>
   </thead>
    <tbody>
    """),_display_(Seq[Any](/*19.6*/for(designation <- designations) yield /*19.38*/ {_display_(Seq[Any](format.raw/*19.40*/("""
      <tr>
        <td><a href=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.DesignationManagement.show(designation.id))),format.raw/*21.72*/("""">"""),_display_(Seq[Any](/*21.75*/designation/*21.86*/.id)),format.raw/*21.89*/("""</a></td>
        <td>"""),_display_(Seq[Any](/*22.14*/designation/*22.25*/.name)),format.raw/*22.30*/("""</td>
      </tr> 
    """)))})),format.raw/*24.6*/("""
 </tbody>
 </table>

""")))})),format.raw/*28.2*/("""      """))}
    }
    
    def render(designations:List[models.admission.Designation]): play.api.templates.Html = apply(designations)
    
    def f:((List[models.admission.Designation]) => play.api.templates.Html) = (designations) => apply(designations)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/designation/list.scala.html
                    HASH: 93a8acdf4caa55a5a8a77007ad505a6f99722e5c
                    MATRIX: 762->1|905->51|932->69|968->71|1004->99|1042->100|1084->108|1112->128|1150->129|1203->147|1216->152|1248->163|1292->177|1452->302|1500->334|1540->336|1610->370|1625->376|1690->419|1729->422|1749->433|1774->436|1833->459|1853->470|1880->475|1935->499|1989->522
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|47->19|47->19|47->19|49->21|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|52->24|56->28
                    -- GENERATED --
                */
            