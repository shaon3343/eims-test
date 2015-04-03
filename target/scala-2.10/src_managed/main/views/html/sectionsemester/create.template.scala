
package views.html.sectionsemester

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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.SectionSemester],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(sectionSemesterForm: Form[models.admission.SectionSemester]):play.api.templates.Html = {
        _display_ {import helper._

import  models.admission.ClassYear


Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Section or Semester Entry")/*5.35*/ {_display_(Seq[Any](format.raw/*5.37*/("""
	
       """),_display_(Seq[Any](/*7.9*/form(routes.SectionSemesterManagement.save())/*7.54*/ {_display_(Seq[Any](format.raw/*7.56*/(""" 
       		 
       		 """),_display_(Seq[Any](/*9.12*/select(
		      sectionSemesterForm("classYear.id"),
		      options(ClassYear.getClassYearsAsMap),
		      '_label -> "Class or Year",
		      '_default -> "-- Choose a Class or Year --"
		    ))),format.raw/*14.8*/("""
		    
              """),_display_(Seq[Any](/*16.16*/inputText(field=sectionSemesterForm("name"), args='_label->"Section or Semester Name"))),format.raw/*16.102*/("""
              """),_display_(Seq[Any](/*17.16*/inputText(field=sectionSemesterForm("code"), args='_label->"Section or Semester Code"))),format.raw/*17.102*/("""
              <input type="submit" value="Create">
            """)))})),format.raw/*19.14*/("""
                       
     """)))})),format.raw/*21.7*/("""

"""))}
    }
    
    def render(sectionSemesterForm:Form[models.admission.SectionSemester]): play.api.templates.Html = apply(sectionSemesterForm)
    
    def f:((Form[models.admission.SectionSemester]) => play.api.templates.Html) = (sectionSemesterForm) => apply(sectionSemesterForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:42 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/sectionsemester/create.scala.html
                    HASH: 02991d336f412bc13e80b07b1037d4f9edf6648e
                    MATRIX: 772->1|962->62|989->116|1025->118|1066->151|1105->153|1150->164|1203->209|1242->211|1301->235|1517->430|1576->453|1685->539|1737->555|1846->641|1943->706|2005->737
                    LINES: 26->1|32->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|38->9|43->14|45->16|45->16|46->17|46->17|48->19|50->21
                    -- GENERATED --
                */
            