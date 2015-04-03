
package views.html.parent

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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Parent],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(parentForm: Form[models.admission.Parent]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Edit Parent")/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
  <h2>Update the Parent having ID """),_display_(Seq[Any](/*5.36*/parentForm/*5.46*/.get.pid)),format.raw/*5.54*/("""</h2><br/><br/>
  
  """),_display_(Seq[Any](/*7.4*/form(routes.ParentManagement.update())/*7.42*/ {_display_(Seq[Any](format.raw/*7.44*/("""
  	  <input type="hidden" name="pid" value="""),_display_(Seq[Any](/*8.45*/parentForm/*8.55*/.get.pid)),format.raw/*8.63*/(""" >
  	  
      """),_display_(Seq[Any](/*10.8*/inputText(parentForm("name"), '_label->"Parent Name"))),format.raw/*10.61*/("""</tr>
	  <input type="submit" value="Update">
  """)))})),format.raw/*12.4*/("""
""")))})))}
    }
    
    def render(parentForm:Form[models.admission.Parent]): play.api.templates.Html = apply(parentForm)
    
    def f:((Form[models.admission.Parent]) => play.api.templates.Html) = (parentForm) => apply(parentForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/parent/edit.scala.html
                    HASH: 1de81ee79afd73cfca6e0f1137289e47e7ad4721
                    MATRIX: 752->1|888->44|915->62|951->64|978->83|1016->84|1087->120|1105->130|1134->138|1190->160|1236->198|1275->200|1355->245|1373->255|1402->263|1453->279|1528->332|1608->381
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|40->12
                    -- GENERATED --
                */
            