
package views.html.department

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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Department],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(deptForm: Form[models.admission.Department]):play.api.templates.Html = {
        _display_ {import helper._

import  models.admission.Faculty


Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Department Entry")/*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/("""
	
       """),_display_(Seq[Any](/*7.9*/form(routes.DepartmentManagement.save())/*7.49*/ {_display_(Seq[Any](format.raw/*7.51*/(""" 
       		
       		 """),_display_(Seq[Any](/*9.12*/select(
		      deptForm("faculty.id"),
		      options(Faculty.getFacultiesAsMap),
		      '_label -> "Faculty",
		      '_default -> "-- Choose a Faculty --"
		    ))),format.raw/*14.8*/("""
       
              """),_display_(Seq[Any](/*16.16*/inputText(field=deptForm("name"), args='_label->"Department Name"))),format.raw/*16.82*/("""
              <input type="submit" value="Create">
            """)))})),format.raw/*18.14*/("""
                       
     """)))})),format.raw/*20.7*/("""

"""))}
    }
    
    def render(deptForm:Form[models.admission.Department]): play.api.templates.Html = apply(deptForm)
    
    def f:((Form[models.admission.Department]) => play.api.templates.Html) = (deptForm) => apply(deptForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/department/create.scala.html
                    HASH: af2982a57c557433411f6bf3eb1a2d2ca182030d
                    MATRIX: 762->1|934->46|961->98|997->100|1029->124|1068->126|1113->137|1161->177|1200->179|1258->202|1446->369|1506->393|1594->459|1691->524|1753->555
                    LINES: 26->1|32->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|38->9|43->14|45->16|45->16|47->18|49->20
                    -- GENERATED --
                */
            