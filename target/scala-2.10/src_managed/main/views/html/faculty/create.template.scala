
package views.html.faculty

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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Faculty],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(facultyForm: Form[models.admission.Faculty]):play.api.templates.Html = {
        _display_ {import models.admission.University

import helper._


Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("Faculty Entry")/*6.23*/ {_display_(Seq[Any](format.raw/*6.25*/("""

       """),_display_(Seq[Any](/*8.9*/form(routes.FacultyManagement.save())/*8.46*/ {_display_(Seq[Any](format.raw/*8.48*/(""" 
       
	       """),_display_(Seq[Any](/*10.10*/select(
		      facultyForm("university.id"),
		      options(University.getUnivsAsMap),
		      '_label -> "University",
		      '_default -> "-- Choose a University --"
		    ))),format.raw/*15.8*/("""
              """),_display_(Seq[Any](/*16.16*/inputText(field=facultyForm("name"), args='_label->"Faculty Name"))),format.raw/*16.82*/("""
               <input type="submit" value="Create">
            """)))})),format.raw/*18.14*/("""
                       
     """)))})),format.raw/*20.7*/("""

"""))}
    }
    
    def render(facultyForm:Form[models.admission.Faculty]): play.api.templates.Html = apply(facultyForm)
    
    def f:((Form[models.admission.Faculty]) => play.api.templates.Html) = (facultyForm) => apply(facultyForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/faculty/create.scala.html
                    HASH: d057be0f0b8168b114c2a8886825f2c5fbcefbf7
                    MATRIX: 756->1|930->46|957->100|994->103|1023->124|1062->126|1106->136|1151->173|1190->175|1245->194|1444->372|1496->388|1584->454|1682->520|1744->551
                    LINES: 26->1|32->1|33->4|35->6|35->6|35->6|37->8|37->8|37->8|39->10|44->15|45->16|45->16|47->18|49->20
                    -- GENERATED --
                */
            