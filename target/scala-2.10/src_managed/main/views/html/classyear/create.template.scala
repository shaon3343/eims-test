
package views.html.classyear

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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.ClassYear],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(classYearForm: Form[models.admission.ClassYear]):play.api.templates.Html = {
        _display_ {import helper._

import  models.admission.Degree


Seq[Any](format.raw/*1.51*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Class Or Year Entry")/*5.29*/ {_display_(Seq[Any](format.raw/*5.31*/("""
	
       """),_display_(Seq[Any](/*7.9*/form(routes.ClassYearManagement.save())/*7.48*/ {_display_(Seq[Any](format.raw/*7.50*/(""" 
       		
       		  """),_display_(Seq[Any](/*9.13*/select(
		      classYearForm("degree.id"),
		      options(Degree.getDegreesAsMap),
		      '_label -> "Degree",
		      '_default -> "-- Choose a Degree --"
		    ))),format.raw/*14.8*/("""
       
              """),_display_(Seq[Any](/*16.16*/inputText(field=classYearForm("name"), args='_label->"Class or Year Name"))),format.raw/*16.90*/("""
              <input type="submit" value="Create">
            """)))})),format.raw/*18.14*/("""
                       
     """)))})),format.raw/*20.7*/("""

"""))}
    }
    
    def render(classYearForm:Form[models.admission.ClassYear]): play.api.templates.Html = apply(classYearForm)
    
    def f:((Form[models.admission.ClassYear]) => play.api.templates.Html) = (classYearForm) => apply(classYearForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/classyear/create.scala.html
                    HASH: c4538764b6994e97cc77f78b9cced237138fcf4d
                    MATRIX: 760->1|935->50|962->101|998->103|1033->130|1072->132|1117->143|1164->182|1203->184|1262->208|1449->374|1509->398|1605->472|1702->537|1764->568
                    LINES: 26->1|32->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|38->9|43->14|45->16|45->16|47->18|49->20
                    -- GENERATED --
                */
            