
package views.html.sectionsemester

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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.admission.SectionSemester],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(sectionSemesters: List[models.admission.SectionSemester]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.60*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("List of Section or Semesters")/*4.38*/{_display_(Seq[Any](format.raw/*4.39*/("""

 
  	"""),_display_(Seq[Any](/*7.5*/if(flash.get("msg"))/*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
         	<span>"""),_display_(Seq[Any](/*8.18*/flash/*8.23*/.get("msg"))),format.raw/*8.34*/("""</span>
     """)))})),format.raw/*9.7*/("""
  
  <table>
  <thead>
    <tr>
       <th>ID</th>
       <th>Section or Semester Name</th>
       <th>Section or Semester Code</th>
     </tr>
   </thead>
    <tbody>
    """),_display_(Seq[Any](/*20.6*/for(sectionSemester <- sectionSemesters) yield /*20.46*/ {_display_(Seq[Any](format.raw/*20.48*/("""
      <tr>
        <td><a href=""""),_display_(Seq[Any](/*22.23*/routes/*22.29*/.SectionSemesterManagement.show(sectionSemester.id))),format.raw/*22.80*/("""">"""),_display_(Seq[Any](/*22.83*/sectionSemester/*22.98*/.id)),format.raw/*22.101*/("""</a></td>
        <td>"""),_display_(Seq[Any](/*23.14*/sectionSemester/*23.29*/.name)),format.raw/*23.34*/("""</td>
        <td>"""),_display_(Seq[Any](/*24.14*/sectionSemester/*24.29*/.code)),format.raw/*24.34*/("""</td>
      </tr> 
    """)))})),format.raw/*26.6*/("""
 </tbody>
 </table>

""")))})),format.raw/*30.2*/("""      """))}
    }
    
    def render(sectionSemesters:List[models.admission.SectionSemester]): play.api.templates.Html = apply(sectionSemesters)
    
    def f:((List[models.admission.SectionSemester]) => play.api.templates.Html) = (sectionSemesters) => apply(sectionSemesters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:42 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/sectionsemester/list.scala.html
                    HASH: b6122f1fc770fc0a9818ebe704ce49b24384e212
                    MATRIX: 770->1|921->59|948->77|984->79|1028->115|1066->116|1108->124|1136->144|1174->145|1227->163|1240->168|1272->179|1316->193|1525->367|1581->407|1621->409|1691->443|1706->449|1779->500|1818->503|1842->518|1868->521|1927->544|1951->559|1978->564|2033->583|2057->598|2084->603|2139->627|2193->650
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|48->20|48->20|48->20|50->22|50->22|50->22|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|54->26|58->30
                    -- GENERATED --
                */
            