
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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.StudentCourse],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(studentCourseForm: Form[models.admission.StudentCourse]):play.api.templates.Html = {
        _display_ {import models.admission.Student

import models.admission.Course

import helper._


Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main("")/*6.10*/{_display_(Seq[Any](format.raw/*6.11*/("""


   <h2>Update the Student's assigned Courses information having Id """),_display_(Seq[Any](/*9.69*/studentCourseForm/*9.86*/.get.id)),format.raw/*9.93*/("""</h2><br/><br/>

"""),_display_(Seq[Any](/*11.2*/form(routes.StudentCourseManagement.update())/*11.47*/ {_display_(Seq[Any](format.raw/*11.49*/("""

<input type="hidden" name="id" value=studentCourseForm>

"""),_display_(Seq[Any](/*15.2*/select(studentCourseForm("student.id"),
options(Student.getStudentsAsMap),
'_label -> "Student", '_default -> "-- Choose a Student --",
'_showConstraints -> false
))),format.raw/*19.2*/("""

<br/>
"""),_display_(Seq[Any](/*22.2*/select(studentCourseForm("course.id"),
options(Course.getCoursesAsMap),
'_label -> "Course",
'_showConstraints -> false
))),format.raw/*26.2*/("""
<br/>

<input type="submit" value="Save">

""")))})),format.raw/*31.2*/("""
   
""")))})))}
    }
    
    def render(studentCourseForm:Form[models.admission.StudentCourse]): play.api.templates.Html = apply(studentCourseForm)
    
    def f:((Form[models.admission.StudentCourse]) => play.api.templates.Html) = (studentCourseForm) => apply(studentCourseForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/studentcourse/edit.scala.html
                    HASH: 1c5a8afdb7e9bf944f973c1e2d745b71098f9ba6
                    MATRIX: 766->1|981->58|1008->141|1044->143|1060->151|1098->152|1204->223|1229->240|1257->247|1310->265|1364->310|1404->312|1499->372|1684->536|1728->545|1870->666|1946->711
                    LINES: 26->1|34->1|35->5|36->6|36->6|36->6|39->9|39->9|39->9|41->11|41->11|41->11|45->15|49->19|52->22|56->26|61->31
                    -- GENERATED --
                */
            