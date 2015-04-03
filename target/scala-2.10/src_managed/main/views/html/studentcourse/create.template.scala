
package views.html.studentcourse

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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Boolean],Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(isChecked :List[Boolean])(content: Html):play.api.templates.Html = {
        _display_ {import models.admission.Course

import helper._


Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("")/*6.10*/{_display_(Seq[Any](format.raw/*6.11*/("""
  """),_display_(Seq[Any](/*7.4*/content)),format.raw/*7.11*/("""

  <table>
    <tr align="center">
        <th>Active</th>
        <th>Course Name</th>
    </tr>

    """),_display_(Seq[Any](/*15.6*/for((course, idx) <- Course.all.zipWithIndex) yield /*15.51*/ {_display_(Seq[Any](format.raw/*15.53*/("""
    <tr align="center">
        <td><input type="checkbox" name="courseId" value=""""),_display_(Seq[Any](/*17.60*/course/*17.66*/.id)),format.raw/*17.69*/("""" """),_display_(Seq[Any](/*17.72*/(if(isChecked.get(idx)== true) "checked"))),format.raw/*17.113*/("""></td>
        <td>"""),_display_(Seq[Any](/*18.14*/course/*18.20*/.name)),format.raw/*18.25*/("""</td>
    </tr>
    """)))})),format.raw/*20.6*/("""
  </table>
  <br/>
  <input type="submit" value="Assign Course to this Student">
  </form>

  <br/> <br/>
  <h3>View the <a href=""""),_display_(Seq[Any](/*27.26*/routes/*27.32*/.StudentCourseManagement.list())),format.raw/*27.63*/("""">list</a> of all assigned courses to students</h3>

""")))})))}
    }
    
    def render(isChecked:List[Boolean],content:Html): play.api.templates.Html = apply(isChecked)(content)
    
    def f:((List[Boolean]) => (Html) => play.api.templates.Html) = (isChecked) => (content) => apply(isChecked)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/studentcourse/create.scala.html
                    HASH: d3aab43355210b40857a4fb64a42f0681e2b38e2
                    MATRIX: 750->1|916->42|943->92|980->95|996->103|1034->104|1072->108|1100->115|1240->220|1301->265|1341->267|1461->351|1476->357|1501->360|1540->363|1604->404|1660->424|1675->430|1702->435|1754->456|1922->588|1937->594|1990->625
                    LINES: 26->1|32->1|33->4|35->6|35->6|35->6|36->7|36->7|44->15|44->15|44->15|46->17|46->17|46->17|46->17|46->17|47->18|47->18|47->18|49->20|56->27|56->27|56->27
                    -- GENERATED --
                */
            