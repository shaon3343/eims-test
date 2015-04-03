
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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Designation],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(designationForm: Form[models.admission.Designation]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.55*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Edit Designation")/*4.26*/{_display_(Seq[Any](format.raw/*4.27*/("""
  <h2>Update the Designation having ID """),_display_(Seq[Any](/*5.41*/designationForm/*5.56*/.get.id)),format.raw/*5.63*/("""</h2><br/><br/>
  
  """),_display_(Seq[Any](/*7.4*/form(routes.DesignationManagement.update())/*7.47*/ {_display_(Seq[Any](format.raw/*7.49*/("""
  	  <input type="hidden" name="id" value="""),_display_(Seq[Any](/*8.44*/designationForm/*8.59*/.get.id)),format.raw/*8.66*/(""" >
  	  
      """),_display_(Seq[Any](/*10.8*/inputText(designationForm("name"), '_label->"Designation Name"))),format.raw/*10.71*/("""</tr>
	  <input type="submit" value="Update">
  """)))})),format.raw/*12.4*/("""
""")))})))}
    }
    
    def render(designationForm:Form[models.admission.Designation]): play.api.templates.Html = apply(designationForm)
    
    def f:((Form[models.admission.Designation]) => play.api.templates.Html) = (designationForm) => apply(designationForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/designation/edit.scala.html
                    HASH: d5f27b42356c3e1efeacb43dea83d5e39e93d3ad
                    MATRIX: 762->1|908->54|935->72|971->74|1003->98|1041->99|1117->140|1140->155|1168->162|1224->184|1275->227|1314->229|1393->273|1416->288|1444->295|1495->311|1580->374|1660->423
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|40->12
                    -- GENERATED --
                */
            