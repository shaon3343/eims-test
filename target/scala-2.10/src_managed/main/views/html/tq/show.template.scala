
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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.TeacherQualifications,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tq: models.admission.TeacherQualifications):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.46*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Teacher Qualifications")/*5.32*/{_display_(Seq[Any](format.raw/*5.33*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*8.28*/tq/*8.30*/.id)),format.raw/*8.33*/("""</td> </tr>
    
  </table>
   
     """),_display_(Seq[Any](/*12.7*/form(routes.TQManagement.edit(tq.id))/*12.44*/ {_display_(Seq[Any](format.raw/*12.46*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*14.8*/("""
     """)))})),format.raw/*15.7*/("""

     """))}
    }
    
    def render(tq:models.admission.TeacherQualifications): play.api.templates.Html = apply(tq)
    
    def f:((models.admission.TeacherQualifications) => play.api.templates.Html) = (tq) => apply(tq)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/tq/show.scala.html
                    HASH: c34c267b9eb5a020ea8ff4262fd8ef516f76f8e9
                    MATRIX: 757->1|894->45|922->64|958->66|996->96|1034->97|1108->136|1118->138|1142->141|1215->179|1261->216|1301->218|1381->267|1419->274
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|36->8|40->12|40->12|40->12|42->14|43->15
                    -- GENERATED --
                */
            