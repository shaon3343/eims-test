
package views.html.category

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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Category],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(categoryForm: Form[models.admission.Category]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Edit Category")/*4.23*/{_display_(Seq[Any](format.raw/*4.24*/("""
  <h2>Update the Category having ID """),_display_(Seq[Any](/*5.38*/categoryForm/*5.50*/.get.id)),format.raw/*5.57*/("""</h2><br/><br/>
  
  """),_display_(Seq[Any](/*7.4*/form(routes.CategoryManagement.update())/*7.44*/ {_display_(Seq[Any](format.raw/*7.46*/("""
  	  <input type="hidden" name="id" value="""),_display_(Seq[Any](/*8.44*/categoryForm/*8.56*/.get.id)),format.raw/*8.63*/(""" >
  	  
      """),_display_(Seq[Any](/*10.8*/inputText(categoryForm("name"), '_label->"Category Name"))),format.raw/*10.65*/("""</tr>
	  <input type="submit" value="Update">
  """)))})),format.raw/*12.4*/("""
""")))})))}
    }
    
    def render(categoryForm:Form[models.admission.Category]): play.api.templates.Html = apply(categoryForm)
    
    def f:((Form[models.admission.Category]) => play.api.templates.Html) = (categoryForm) => apply(categoryForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/category/edit.scala.html
                    HASH: f43f91b64d243fb795209bb9fa6050d5b852b6c8
                    MATRIX: 756->1|896->48|923->66|959->68|988->89|1026->90|1099->128|1119->140|1147->147|1203->169|1251->209|1290->211|1369->255|1389->267|1417->274|1468->290|1547->347|1627->396
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|40->12
                    -- GENERATED --
                */
            