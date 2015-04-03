
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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.SectionSemester],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(sectionSemesterForm: Form[models.admission.SectionSemester]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Edit Section or Semester")/*4.34*/{_display_(Seq[Any](format.raw/*4.35*/("""
  <h2>Update the Section or Semester having ID """),_display_(Seq[Any](/*5.49*/sectionSemesterForm/*5.68*/.get.id)),format.raw/*5.75*/("""</h2><br/><br/>
  
  """),_display_(Seq[Any](/*7.4*/form(routes.SectionSemesterManagement.update())/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
  	  <input type="hidden" name="id" value="""),_display_(Seq[Any](/*8.44*/sectionSemesterForm/*8.63*/.get.id)),format.raw/*8.70*/(""">
  	  
      """),_display_(Seq[Any](/*10.8*/inputText(sectionSemesterForm("name"), '_label->"Section or Semester Name"))),format.raw/*10.83*/("""
      """),_display_(Seq[Any](/*11.8*/inputText(sectionSemesterForm("code"), '_label->"Section or Semester Code"))),format.raw/*11.83*/("""
	  <input type="submit" value="Update">
  """)))})),format.raw/*13.4*/("""
""")))})))}
    }
    
    def render(sectionSemesterForm:Form[models.admission.SectionSemester]): play.api.templates.Html = apply(sectionSemesterForm)
    
    def f:((Form[models.admission.SectionSemester]) => play.api.templates.Html) = (sectionSemesterForm) => apply(sectionSemesterForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:42 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/sectionsemester/edit.scala.html
                    HASH: 506f8ce9c30a952b03078189906915a129d876ff
                    MATRIX: 770->1|924->62|951->80|987->82|1027->114|1065->115|1149->164|1176->183|1204->190|1260->212|1315->259|1354->261|1433->305|1460->324|1488->331|1538->346|1635->421|1678->429|1775->504|1850->548
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|39->11|39->11|41->13
                    -- GENERATED --
                */
            