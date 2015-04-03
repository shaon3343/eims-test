
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
object createWithoutList extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Long,String,List[Boolean],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(teacherId: Long, teacherName: String, isChecked: List[Boolean]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.66*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/teachercourse/*4.15*/.create(isChecked)/*4.33*/{_display_(Seq[Any](format.raw/*4.34*/("""

       <h2>Assign Course to Teacher <b>"""),_display_(Seq[Any](/*6.41*/teacherId)),format.raw/*6.50*/(""" : """),_display_(Seq[Any](/*6.54*/teacherName)),format.raw/*6.65*/("""</b></h2><br/><br/>

        <form method="post" action="""),_display_(Seq[Any](/*8.37*/routes/*8.43*/.TeacherCourseManagement.insert())),format.raw/*8.76*/(""">
        <input type="hidden" name="teacherId" value=""""),_display_(Seq[Any](/*9.55*/teacherId)),format.raw/*9.64*/("""">


""")))})))}
    }
    
    def render(teacherId:Long,teacherName:String,isChecked:List[Boolean]): play.api.templates.Html = apply(teacherId,teacherName,isChecked)
    
    def f:((Long,String,List[Boolean]) => play.api.templates.Html) = (teacherId,teacherName,isChecked) => apply(teacherId,teacherName,isChecked)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/teachercourse/createWithoutList.scala.html
                    HASH: c3e8a617cf38a823bef82f57dc1567a5a0520668
                    MATRIX: 768->1|925->65|952->83|988->85|1009->98|1035->116|1073->117|1150->159|1180->168|1219->172|1251->183|1343->240|1357->246|1411->279|1502->335|1532->344
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|32->4|34->6|34->6|34->6|34->6|36->8|36->8|36->8|37->9|37->9
                    -- GENERATED --
                */
            