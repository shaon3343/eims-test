
package views.html.student

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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Student],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(studentForm: Form[models.admission.Student]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Edit Student")/*4.22*/{_display_(Seq[Any](format.raw/*4.23*/("""
  <h2>Update the Student having ID """),_display_(Seq[Any](/*5.37*/studentForm/*5.48*/.get.sid)),format.raw/*5.56*/("""</h2><br/><br/>
  
  """),_display_(Seq[Any](/*7.4*/form(routes.StudentManagement.update())/*7.43*/ {_display_(Seq[Any](format.raw/*7.45*/("""
  	  <input type="hidden" name="sid" value="""),_display_(Seq[Any](/*8.45*/studentForm/*8.56*/.get.sid)),format.raw/*8.64*/(""">
  	  
      """),_display_(Seq[Any](/*10.8*/inputText(studentForm("name"), '_label->"Student Name"))),format.raw/*10.63*/("""</tr>
	  <input type="submit" value="Update">
  """)))})),format.raw/*12.4*/("""
""")))})))}
    }
    
    def render(studentForm:Form[models.admission.Student]): play.api.templates.Html = apply(studentForm)
    
    def f:((Form[models.admission.Student]) => play.api.templates.Html) = (studentForm) => apply(studentForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/student/edit.scala.html
                    HASH: effb71406c0fca8c34374033f96113edde77f874
                    MATRIX: 754->1|892->46|919->64|955->66|983->86|1021->87|1093->124|1112->135|1141->143|1197->165|1244->204|1283->206|1363->251|1382->262|1411->270|1461->285|1538->340|1618->389
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|40->12
                    -- GENERATED --
                */
            