
package views.html.university

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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.admission.University],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(universities: List[models.admission.University]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.51*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("List of University")/*4.28*/{_display_(Seq[Any](format.raw/*4.29*/("""

 
  	"""),_display_(Seq[Any](/*7.5*/if(flash.get("msg"))/*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
         	<span>"""),_display_(Seq[Any](/*8.18*/flash/*8.23*/.get("msg"))),format.raw/*8.34*/("""</span>
     """)))})),format.raw/*9.7*/("""
  
  <table>
  <thead>
    <tr>
       <th>ID</th>
       <th>University Name</th>
       <th>University Email</th>
       <th>University Address</th>
       <th>University Person Details</th>
       <th>University Contact No</th>
     </tr>
   </thead>
    <tbody>
    """),_display_(Seq[Any](/*23.6*/for(university <- universities) yield /*23.37*/ {_display_(Seq[Any](format.raw/*23.39*/("""
      <tr>
        <td><a href=""""),_display_(Seq[Any](/*25.23*/routes/*25.29*/.UniversityManagement.show(university.id))),format.raw/*25.70*/("""">"""),_display_(Seq[Any](/*25.73*/university/*25.83*/.id)),format.raw/*25.86*/("""</a></td>
        <td>"""),_display_(Seq[Any](/*26.14*/university/*26.24*/.name)),format.raw/*26.29*/("""</td>
        <td>"""),_display_(Seq[Any](/*27.14*/university/*27.24*/.email)),format.raw/*27.30*/("""</td>
       	<td>"""),_display_(Seq[Any](/*28.14*/university/*28.24*/.address)),format.raw/*28.32*/(""" </td>
         <td>"""),_display_(Seq[Any](/*29.15*/university/*29.25*/.personDetails)),format.raw/*29.39*/("""</td>
         <td>"""),_display_(Seq[Any](/*30.15*/university/*30.25*/.contactNo)),format.raw/*30.35*/(""" </td>
      </tr> 
    """)))})),format.raw/*32.6*/("""
 </tbody>
 </table>

""")))})),format.raw/*36.2*/("""      """))}
    }
    
    def render(universities:List[models.admission.University]): play.api.templates.Html = apply(universities)
    
    def f:((List[models.admission.University]) => play.api.templates.Html) = (universities) => apply(universities)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/university/list.scala.html
                    HASH: 6167e2e2c3e6e0755184eaadfa545b53348f304f
                    MATRIX: 760->1|902->50|929->68|965->70|999->96|1037->97|1079->105|1107->125|1145->126|1198->144|1211->149|1243->160|1287->174|1594->446|1641->477|1681->479|1751->513|1766->519|1829->560|1868->563|1887->573|1912->576|1971->599|1990->609|2017->614|2072->633|2091->643|2119->649|2174->668|2193->678|2223->686|2280->707|2299->717|2335->731|2391->751|2410->761|2442->771|2498->796|2552->819
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|51->23|51->23|51->23|53->25|53->25|53->25|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|60->32|64->36
                    -- GENERATED --
                */
            