
package views.html.teachercourse

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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.TeacherCourse],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(teacherCourseForm: Form[models.admission.TeacherCourse]):play.api.templates.Html = {
        _display_ {import models.admission.Teacher

import models.admission.Course

import helper._


Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main("")/*6.10*/{_display_(Seq[Any](format.raw/*6.11*/("""


   <h2>Update the Teacher's assigned Courses information having Id """),_display_(Seq[Any](/*9.69*/teacherCourseForm/*9.86*/.get.id)),format.raw/*9.93*/("""</h2><br/><br/>

"""),_display_(Seq[Any](/*11.2*/form(routes.TeacherCourseManagement.update())/*11.47*/ {_display_(Seq[Any](format.raw/*11.49*/("""

<input type="hidden" name="id" value=teacherCourseForm>

"""),_display_(Seq[Any](/*15.2*/select(teacherCourseForm("teacher.id"),
options(Teacher.getTeachersAsMap),
'_label -> "Teacher", '_default -> "-- Choose a Teacher --",
'_showConstraints -> false
))),format.raw/*19.2*/("""

<br/>
"""),_display_(Seq[Any](/*22.2*/select(teacherCourseForm("course.id"),
options(Course.getCoursesAsMap),
'_label -> "Course",
'_showConstraints -> false
))),format.raw/*26.2*/("""
<br/>

<input type="submit" value="Save">

""")))})),format.raw/*31.2*/("""
   
""")))})))}
    }
    
    def render(teacherCourseForm:Form[models.admission.TeacherCourse]): play.api.templates.Html = apply(teacherCourseForm)
    
    def f:((Form[models.admission.TeacherCourse]) => play.api.templates.Html) = (teacherCourseForm) => apply(teacherCourseForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/teachercourse/edit.scala.html
                    HASH: 6c123723ce48fddbc98a999aa90c9f938aaeae7a
                    MATRIX: 766->1|981->58|1008->141|1044->143|1060->151|1098->152|1204->223|1229->240|1257->247|1310->265|1364->310|1404->312|1499->372|1684->536|1728->545|1870->666|1946->711
                    LINES: 26->1|34->1|35->5|36->6|36->6|36->6|39->9|39->9|39->9|41->11|41->11|41->11|45->15|49->19|52->22|56->26|61->31
                    -- GENERATED --
                */
            