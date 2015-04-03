
package views.html.classyear

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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.admission.ClassYear],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(classYears: List[models.admission.ClassYear]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.48*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("List of Class or Year")/*4.31*/{_display_(Seq[Any](format.raw/*4.32*/("""

 
  	"""),_display_(Seq[Any](/*7.5*/if(flash.get("msg"))/*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
         	<span>"""),_display_(Seq[Any](/*8.18*/flash/*8.23*/.get("msg"))),format.raw/*8.34*/("""</span>
     """)))})),format.raw/*9.7*/("""
  
  <table>
  <thead>
    <tr>
       <th>ID</th>
       <th>Class or Year Name</th>
     </tr>
   </thead>
    <tbody>
    """),_display_(Seq[Any](/*19.6*/for(classYear <- classYears) yield /*19.34*/ {_display_(Seq[Any](format.raw/*19.36*/("""
      <tr>
        <td><a href=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.ClassYearManagement.show(classYear.id))),format.raw/*21.68*/("""">"""),_display_(Seq[Any](/*21.71*/classYear/*21.80*/.id)),format.raw/*21.83*/("""</a></td>
        <td>"""),_display_(Seq[Any](/*22.14*/classYear/*22.23*/.name)),format.raw/*22.28*/("""</td>
      </tr> 
    """)))})),format.raw/*24.6*/("""
 </tbody>
 </table>

""")))})),format.raw/*28.2*/("""      """))}
    }
    
    def render(classYears:List[models.admission.ClassYear]): play.api.templates.Html = apply(classYears)
    
    def f:((List[models.admission.ClassYear]) => play.api.templates.Html) = (classYears) => apply(classYears)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/classyear/list.scala.html
                    HASH: f2e1e62e3a56a4c67d38bc717e45f8d48b40dab2
                    MATRIX: 758->1|897->47|924->65|960->67|997->96|1035->97|1077->105|1105->125|1143->126|1196->144|1209->149|1241->160|1285->174|1447->301|1491->329|1531->331|1601->365|1616->371|1677->410|1716->413|1734->422|1759->425|1818->448|1836->457|1863->462|1918->486|1972->509
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|47->19|47->19|47->19|49->21|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|52->24|56->28
                    -- GENERATED --
                */
            