
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.admission.StudentCourse],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(studentCourses: List[models.admission.StudentCourse]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.56*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("")/*4.10*/{_display_(Seq[Any](format.raw/*4.11*/("""

    
  <h1>List of assigned Courses to a Student</h1>


  <table border="1">
    <tr>
       <th>Id</th> <th>Student Name</th> <th>Course Name</th>
    </tr>
    """),_display_(Seq[Any](/*14.6*/for(studentCourse <- studentCourses) yield /*14.42*/ {_display_(Seq[Any](format.raw/*14.44*/("""
      <tr>
        <td><a href=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.StudentCourseManagement.show(studentCourse.id))),format.raw/*16.76*/("""">"""),_display_(Seq[Any](/*16.79*/studentCourse/*16.92*/.id)),format.raw/*16.95*/("""</a></td>
        <td>"""),_display_(Seq[Any](/*17.14*/studentCourse/*17.27*/.student.name)),format.raw/*17.40*/("""</td>
        <td>"""),_display_(Seq[Any](/*18.14*/studentCourse/*18.27*/.course.name)),format.raw/*18.39*/("""</td>
      </tr>
    """)))})),format.raw/*20.6*/("""
 
  </table>
  
  <br/>
  Select any of the Students Courses (click on Id) to view its detail information.
  
  <br/> <br/>
  <h3><a href=""""),_display_(Seq[Any](/*28.17*/routes/*28.23*/.StudentCourseManagement.create())),format.raw/*28.56*/("""">Assign Course to a Student.</a> </h3>
</div>
	    </div> 
""")))})),format.raw/*31.2*/("""      """))}
    }
    
    def render(studentCourses:List[models.admission.StudentCourse]): play.api.templates.Html = apply(studentCourses)
    
    def f:((List[models.admission.StudentCourse]) => play.api.templates.Html) = (studentCourses) => apply(studentCourses)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/studentcourse/list.scala.html
                    HASH: f2cfd0db64029791a0a611e41885b29608a1e00a
                    MATRIX: 766->1|913->55|940->73|976->75|992->83|1030->84|1230->249|1282->285|1322->287|1392->321|1407->327|1476->374|1515->377|1537->390|1562->393|1621->416|1643->429|1678->442|1733->461|1755->474|1789->486|1843->509|2020->650|2035->656|2090->689|2182->750
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|42->14|42->14|42->14|44->16|44->16|44->16|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|48->20|56->28|56->28|56->28|59->31
                    -- GENERATED --
                */
            