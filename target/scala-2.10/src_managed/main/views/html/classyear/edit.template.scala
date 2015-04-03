
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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.ClassYear],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(classYearForm: Form[models.admission.ClassYear]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.51*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Edit Class Or Year")/*4.28*/{_display_(Seq[Any](format.raw/*4.29*/("""
  <h2>Update the Class/Year having ID """),_display_(Seq[Any](/*5.40*/classYearForm/*5.53*/.get.id)),format.raw/*5.60*/("""</h2><br/><br/>
  
  """),_display_(Seq[Any](/*7.4*/form(routes.ClassYearManagement.update())/*7.45*/ {_display_(Seq[Any](format.raw/*7.47*/("""
  	  <input type="hidden" name="id" value="""),_display_(Seq[Any](/*8.44*/classYearForm/*8.57*/.get.id)),format.raw/*8.64*/(""" >
  	  
      """),_display_(Seq[Any](/*10.8*/inputText(classYearForm("name"), '_label->"Class or Year Name"))),format.raw/*10.71*/("""</tr>
	  <input type="submit" value="Update">
  """)))})),format.raw/*12.4*/("""
""")))})))}
    }
    
    def render(classYearForm:Form[models.admission.ClassYear]): play.api.templates.Html = apply(classYearForm)
    
    def f:((Form[models.admission.ClassYear]) => play.api.templates.Html) = (classYearForm) => apply(classYearForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/classyear/edit.scala.html
                    HASH: 21ef04e7d90f4b2ba565d0d199fc283cabbea7b0
                    MATRIX: 758->1|900->50|927->68|963->70|997->96|1035->97|1110->137|1131->150|1159->157|1215->179|1264->220|1303->222|1382->266|1403->279|1431->286|1482->302|1567->365|1647->414
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|40->12
                    -- GENERATED --
                */
            