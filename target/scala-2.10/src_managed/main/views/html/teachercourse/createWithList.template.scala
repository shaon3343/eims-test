
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
object createWithList extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[dummymodels.DummyTeacherCourse],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(teacherCourseForm: Form[dummymodels.DummyTeacherCourse]):play.api.templates.Html = {
        _display_ {import models.admission.Course

import models.admission.Teacher

import helper._


Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main("")/*6.10*/{_display_(Seq[Any](format.raw/*6.11*/("""

  <h2>Assign Course to a Teacher</h2><br/><br/>

  """),_display_(Seq[Any](/*10.4*/form(routes.TeacherCourseManagement.createWithTeacher())/*10.60*/{_display_(Seq[Any](format.raw/*10.61*/("""
    """),_display_(Seq[Any](/*11.6*/select(teacherCourseForm("teacherId"),
      options(Teacher.getTeachersAsMap),
       '_label -> "Teacher", '_id -> "id", '_default -> "-- Choose a Teacher --",
       '_showConstraints -> false
    ))),format.raw/*15.6*/("""
       <br/>
        <input type="submit" value="Assign Course to this Teacher">
       """)))})),format.raw/*18.9*/("""


""")))})),format.raw/*21.2*/("""


"""))}
    }
    
    def render(teacherCourseForm:Form[dummymodels.DummyTeacherCourse]): play.api.templates.Html = apply(teacherCourseForm)
    
    def f:((Form[dummymodels.DummyTeacherCourse]) => play.api.templates.Html) = (teacherCourseForm) => apply(teacherCourseForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/teachercourse/createWithList.scala.html
                    HASH: 1a4ad38bfa52f9131d8b476079ce1082eb681157
                    MATRIX: 776->1|991->58|1018->141|1054->143|1070->151|1108->152|1197->206|1262->262|1301->263|1342->269|1564->470|1685->560|1720->564
                    LINES: 26->1|34->1|35->5|36->6|36->6|36->6|40->10|40->10|40->10|41->11|45->15|48->18|51->21
                    -- GENERATED --
                */
            