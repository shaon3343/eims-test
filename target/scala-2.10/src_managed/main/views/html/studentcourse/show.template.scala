
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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.StudentCourse,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(studentCourse: models.admission.StudentCourse):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("")/*4.10*/{_display_(Seq[Any](format.raw/*4.11*/("""


   
"""),_display_(Seq[Any](/*8.2*/if(flash.get("msg"))/*8.22*/ {_display_(Seq[Any](format.raw/*8.24*/("""
<b>"""),_display_(Seq[Any](/*9.5*/flash/*9.10*/.get("msg"))),format.raw/*9.21*/("""</b>
""")))})),format.raw/*10.2*/("""

<h1>Student's Course Information</h1>

<table border=1>
    <tr>
        <th align="left">Id</th>
        <td>"""),_display_(Seq[Any](/*17.14*/studentCourse/*17.27*/.id)),format.raw/*17.30*/("""</td>
    </tr>
     <tr>
        <th align="left">Student Id</th>
        <td>"""),_display_(Seq[Any](/*21.14*/studentCourse/*21.27*/.student.sid)),format.raw/*21.39*/("""</td>
    </tr>
    <tr>
        <th align="left">Student Name</th>
        <td>"""),_display_(Seq[Any](/*25.14*/studentCourse/*25.27*/.student.name)),format.raw/*25.40*/("""</td>
    </tr>

     <tr>
        <th align="left">Course Id</th>
        <td>"""),_display_(Seq[Any](/*30.14*/studentCourse/*30.27*/.course.id)),format.raw/*30.37*/("""</td>
    </tr>
    <tr>
        <th align="left">Course Name</th>
        <td>"""),_display_(Seq[Any](/*34.14*/studentCourse/*34.27*/.course.name)),format.raw/*34.39*/("""</td>
    </tr>
 </table>

<br/> <br/>
"""),_display_(Seq[Any](/*39.2*/form(routes.StudentCourseManagement.edit(studentCourse.id))/*39.61*/ {_display_(Seq[Any](format.raw/*39.63*/("""
<input type="submit" value="Edit">
""")))})),format.raw/*41.2*/("""
<br/> <br/>
<h3>View the <a href=""""),_display_(Seq[Any](/*43.24*/routes/*43.30*/.StudentCourseManagement.list())),format.raw/*43.61*/("""">list</a> of all Student's Courses</h3>

""")))})))}
    }
    
    def render(studentCourse:models.admission.StudentCourse): play.api.templates.Html = apply(studentCourse)
    
    def f:((models.admission.StudentCourse) => play.api.templates.Html) = (studentCourse) => apply(studentCourse)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/studentcourse/show.scala.html
                    HASH: 074f6bbe83a917defe8c618b735b2bbe72afcd18
                    MATRIX: 760->1|901->48|929->68|966->71|982->79|1020->80|1066->92|1094->112|1133->114|1173->120|1186->125|1218->136|1256->143|1412->263|1434->276|1459->279|1579->363|1601->376|1635->388|1756->473|1778->486|1813->499|1934->584|1956->597|1988->607|2108->691|2130->704|2164->716|2244->761|2312->820|2352->822|2422->861|2496->899|2511->905|2564->936
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|36->8|36->8|36->8|37->9|37->9|37->9|38->10|45->17|45->17|45->17|49->21|49->21|49->21|53->25|53->25|53->25|58->30|58->30|58->30|62->34|62->34|62->34|67->39|67->39|67->39|69->41|71->43|71->43|71->43
                    -- GENERATED --
                */
            