
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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Degree],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(degreeForm: Form[models.admission.Degree]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Edit Degree")/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
  <h2>Update the Degree having ID """),_display_(Seq[Any](/*5.36*/degreeForm/*5.46*/.get.id)),format.raw/*5.53*/("""</h2><br/><br/>
  
  """),_display_(Seq[Any](/*7.4*/form(routes.DegreeManagement.update())/*7.42*/ {_display_(Seq[Any](format.raw/*7.44*/("""
  	  <input type="hidden" name="id" value="""),_display_(Seq[Any](/*8.44*/degreeForm/*8.54*/.get.id)),format.raw/*8.61*/(""" >
  	  
      """),_display_(Seq[Any](/*10.8*/inputText(degreeForm("name"), '_label->"Degree Name"))),format.raw/*10.61*/("""</tr>
	  <input type="submit" value="Update">
  """)))})),format.raw/*12.4*/("""
""")))})))}
    }
    
    def render(degreeForm:Form[models.admission.Degree]): play.api.templates.Html = apply(degreeForm)
    
    def f:((Form[models.admission.Degree]) => play.api.templates.Html) = (degreeForm) => apply(degreeForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/degree/edit.scala.html
                    HASH: baf435234a528750f4f6a695fc3195612480f0d4
                    MATRIX: 752->1|888->44|915->62|951->64|978->83|1016->84|1087->120|1105->130|1133->137|1189->159|1235->197|1274->199|1353->243|1371->253|1399->260|1450->276|1525->329|1605->378
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|40->12
                    -- GENERATED --
                */
            