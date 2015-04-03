
package views.html.teacher

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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.Teacher,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(teacher: models.admission.Teacher):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Teacher")/*5.17*/{_display_(Seq[Any](format.raw/*5.18*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*8.28*/teacher/*8.35*/.tid)),format.raw/*8.39*/("""</td> </tr>
    <tr> <th >Teacher Name</th> <td>"""),_display_(Seq[Any](/*9.38*/teacher/*9.45*/.name)),format.raw/*9.50*/("""</td> </tr>
  </table>
   
     """),_display_(Seq[Any](/*12.7*/form(routes.TeacherManagement.edit(teacher.tid))/*12.55*/ {_display_(Seq[Any](format.raw/*12.57*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*14.8*/("""
     """)))})),format.raw/*15.7*/("""

     """))}
    }
    
    def render(teacher:models.admission.Teacher): play.api.templates.Html = apply(teacher)
    
    def f:((models.admission.Teacher) => play.api.templates.Html) = (teacher) => apply(teacher)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:42 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/teacher/show.scala.html
                    HASH: 25fbb4fb0843ed574e14bad438f2da8a5d350b3f
                    MATRIX: 748->1|876->36|904->55|940->57|963->72|1001->73|1075->112|1090->119|1115->123|1199->172|1214->179|1240->184|1308->217|1365->265|1405->267|1485->316|1523->323
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|36->8|37->9|37->9|37->9|40->12|40->12|40->12|42->14|43->15
                    -- GENERATED --
                */
            