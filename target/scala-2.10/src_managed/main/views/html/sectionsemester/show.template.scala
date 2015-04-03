
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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.SectionSemester,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(sectionSemester: models.admission.SectionSemester):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.53*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("")/*4.10*/{_display_(Seq[Any](format.raw/*4.11*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*7.28*/sectionSemester/*7.43*/.id)),format.raw/*7.46*/("""</td> </tr>
    <tr> <th >Section or Semester Name</th> <td>"""),_display_(Seq[Any](/*8.50*/sectionSemester/*8.65*/.name)),format.raw/*8.70*/("""</td> </tr>
    <tr> <th >Section or Semester Code</th> <td>"""),_display_(Seq[Any](/*9.50*/sectionSemester/*9.65*/.code)),format.raw/*9.70*/("""</td> </tr>
  </table>
   
     """),_display_(Seq[Any](/*12.7*/form(routes.SectionSemesterManagement.edit(sectionSemester.id))/*12.70*/ {_display_(Seq[Any](format.raw/*12.72*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*14.8*/("""
     """)))})),format.raw/*15.7*/("""
"""))}
    }
    
    def render(sectionSemester:models.admission.SectionSemester): play.api.templates.Html = apply(sectionSemester)
    
    def f:((models.admission.SectionSemester) => play.api.templates.Html) = (sectionSemester) => apply(sectionSemester)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:42 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/sectionsemester/show.scala.html
                    HASH: a6ed28f205e17d8cca21eb4c3d344624b4a6e074
                    MATRIX: 764->1|908->52|935->70|971->72|987->80|1025->81|1099->120|1122->135|1146->138|1242->199|1265->214|1291->219|1387->280|1410->295|1436->300|1504->333|1576->396|1616->398|1696->447|1734->454
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|40->12|40->12|40->12|42->14|43->15
                    -- GENERATED --
                */
            