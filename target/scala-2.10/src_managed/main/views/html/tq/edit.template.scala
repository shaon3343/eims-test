
package views.html.tq

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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.TeacherQualifications],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tqForm: Form[models.admission.TeacherQualifications]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.56*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Edit Teacher's Qualifications")/*4.39*/{_display_(Seq[Any](format.raw/*4.40*/("""
  <h2>Update the Teacher's Qualifications having ID """),_display_(Seq[Any](/*5.54*/tqForm/*5.60*/.get.id)),format.raw/*5.67*/("""</h2><br/><br/>
  
  """),_display_(Seq[Any](/*7.4*/form(routes.TQManagement.update())/*7.38*/ {_display_(Seq[Any](format.raw/*7.40*/("""
  	  <input type="hidden" name="id" value="""),_display_(Seq[Any](/*8.44*/tqForm/*8.50*/.get.id)),format.raw/*8.57*/(""" >
  	  
     <!--  """),_display_(Seq[Any](/*10.13*/inputText(tqForm("name"), '_label->"Employee Name"))),format.raw/*10.64*/(""" -->
	  <input type="submit" value="Update">
  """)))})),format.raw/*12.4*/("""
""")))})))}
    }
    
    def render(tqForm:Form[models.admission.TeacherQualifications]): play.api.templates.Html = apply(tqForm)
    
    def f:((Form[models.admission.TeacherQualifications]) => play.api.templates.Html) = (tqForm) => apply(tqForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/tq/edit.scala.html
                    HASH: 7c3514b420af03c9d6ab6bf648f1d747f3bc01cc
                    MATRIX: 763->1|910->55|937->73|973->75|1018->112|1056->113|1145->167|1159->173|1187->180|1243->202|1285->236|1324->238|1403->282|1417->288|1445->295|1502->316|1575->367|1654->415
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|40->12
                    -- GENERATED --
                */
            