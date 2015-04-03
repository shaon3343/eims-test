
package views.html.degree

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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Degree],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(degreeForm: Form[models.admission.Degree]):play.api.templates.Html = {
        _display_ {import helper._

import  models.admission.Department


Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Degree Entry")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
	
       """),_display_(Seq[Any](/*7.9*/form(routes.DegreeManagement.save())/*7.45*/ {_display_(Seq[Any](format.raw/*7.47*/(""" 
       		
       		 """),_display_(Seq[Any](/*9.12*/select(
		      degreeForm("department.id"),
		      options(Department.getDepartmentsAsMap),
		      '_label -> "Department",
		      '_default -> "-- Choose a Department --"
		    ))),format.raw/*14.8*/("""
       
              """),_display_(Seq[Any](/*16.16*/inputText(field=degreeForm("name"), args='_label->"Degree Name"))),format.raw/*16.80*/("""
              <input type="submit" value="Create">
            """)))})),format.raw/*18.14*/("""
                       
     """)))})),format.raw/*20.7*/("""

"""))}
    }
    
    def render(degreeForm:Form[models.admission.Degree]): play.api.templates.Html = apply(degreeForm)
    
    def f:((Form[models.admission.Degree]) => play.api.templates.Html) = (degreeForm) => apply(degreeForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/degree/create.scala.html
                    HASH: 7c9f1740e730bd6b8a654f030d0b0d1b07bd1eef
                    MATRIX: 754->1|927->44|954->99|990->101|1018->121|1057->123|1102->134|1146->170|1185->172|1243->195|1447->378|1507->402|1593->466|1690->531|1752->562
                    LINES: 26->1|32->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|38->9|43->14|45->16|45->16|47->18|49->20
                    -- GENERATED --
                */
            