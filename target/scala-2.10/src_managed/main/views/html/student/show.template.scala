
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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.Student,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(student: models.admission.Student):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Student")/*5.17*/{_display_(Seq[Any](format.raw/*5.18*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*8.28*/student/*8.35*/.sid)),format.raw/*8.39*/("""</td> </tr>
    <tr> <th ></th><td> <img src="""),_display_(Seq[Any](/*9.35*/routes/*9.41*/.Assets.at("images/photos/"+student.sid+"_image.png"))),format.raw/*9.94*/(""" alt="" title="" width="64" height="64" border="0" /></td> </tr>
    <tr> <th >Student Name</th> <td>"""),_display_(Seq[Any](/*10.38*/student/*10.45*/.name)),format.raw/*10.50*/("""</td> </tr>
  </table>
   
     """),_display_(Seq[Any](/*13.7*/form(routes.StudentManagement.edit(student.sid))/*13.55*/ {_display_(Seq[Any](format.raw/*13.57*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*15.8*/("""
     """)))})),format.raw/*16.7*/("""

     """))}
    }
    
    def render(student:models.admission.Student): play.api.templates.Html = apply(student)
    
    def f:((models.admission.Student) => play.api.templates.Html) = (student) => apply(student)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/student/show.scala.html
                    HASH: e42f9dec332a3b2cf49478457b0cc0c19920a901
                    MATRIX: 748->1|876->36|904->55|940->57|963->72|1001->73|1075->112|1090->119|1115->123|1196->169|1210->175|1284->228|1422->330|1438->337|1465->342|1533->375|1590->423|1630->425|1710->474|1748->481
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|41->13|41->13|41->13|43->15|44->16
                    -- GENERATED --
                */
            