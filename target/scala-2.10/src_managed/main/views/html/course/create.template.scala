
package views.html.course

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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Course],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(courseForm: Form[models.admission.Course]):play.api.templates.Html = {
        _display_ {import helper._

import  models.admission.Department


Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Course Entry")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
	
       """),_display_(Seq[Any](/*7.9*/form(routes.CourseManagement.save())/*7.45*/ {_display_(Seq[Any](format.raw/*7.47*/(""" 
       		
       
              """),_display_(Seq[Any](/*10.16*/inputText(field=courseForm("name"), args='_label->"Course Name"))),format.raw/*10.80*/("""
               """),_display_(Seq[Any](/*11.17*/inputText(field=courseForm("code"), args='_label->"Course Code"))),format.raw/*11.81*/("""
                """),_display_(Seq[Any](/*12.18*/inputText(field=courseForm("credit"), args='_label->"Course Credit"))),format.raw/*12.86*/("""
                
              <input type="submit" value="Create">
            """)))})),format.raw/*15.14*/("""
                       
     """)))})),format.raw/*17.7*/("""

"""))}
    }
    
    def render(courseForm:Form[models.admission.Course]): play.api.templates.Html = apply(courseForm)
    
    def f:((Form[models.admission.Course]) => play.api.templates.Html) = (courseForm) => apply(courseForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/course/create.scala.html
                    HASH: 284620eba50196cce1e9d74f386036f11973739b
                    MATRIX: 754->1|927->44|954->99|990->101|1018->121|1057->123|1102->134|1146->170|1185->172|1256->207|1342->271|1395->288|1481->352|1535->370|1625->438|1739->520|1801->551
                    LINES: 26->1|32->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|39->10|39->10|40->11|40->11|41->12|41->12|44->15|46->17
                    -- GENERATED --
                */
            