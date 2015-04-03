
package views.html.designation

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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Designation],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(designationForm: Form[models.admission.Designation]):play.api.templates.Html = {
        _display_ {import helper._

import  models.admission.Department


Seq[Any](format.raw/*1.55*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Designation Entry")/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""
	
       """),_display_(Seq[Any](/*7.9*/form(routes.DesignationManagement.save())/*7.50*/ {_display_(Seq[Any](format.raw/*7.52*/(""" 
       		
       		 """),_display_(Seq[Any](/*9.12*/select(
		      designationForm("department.id"),
		      options(Department.getDepartmentsAsMap),
		      '_label -> "Department",
		      '_default -> "-- Choose a Department --"
		    ))),format.raw/*14.8*/("""
       
              """),_display_(Seq[Any](/*16.16*/inputText(field=designationForm("name"), args='_label->"Designation Name"))),format.raw/*16.90*/("""
              <input type="submit" value="Create">
            """)))})),format.raw/*18.14*/("""
                       
     """)))})),format.raw/*20.7*/("""

"""))}
    }
    
    def render(designationForm:Form[models.admission.Designation]): play.api.templates.Html = apply(designationForm)
    
    def f:((Form[models.admission.Designation]) => play.api.templates.Html) = (designationForm) => apply(designationForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/designation/create.scala.html
                    HASH: 18c44c2b9c2fbfea6da2ae7161ad933f50c02591
                    MATRIX: 764->1|947->54|974->109|1010->111|1043->136|1082->138|1127->149|1176->190|1215->192|1273->215|1482->403|1542->427|1638->501|1735->566|1797->597
                    LINES: 26->1|32->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|38->9|43->14|45->16|45->16|47->18|49->20
                    -- GENERATED --
                */
            