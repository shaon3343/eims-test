
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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Category],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(categoryForm: Form[models.admission.Category]):play.api.templates.Html = {
        _display_ {import helper._

import  models.admission.Department


Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Category Entry")/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
	
       """),_display_(Seq[Any](/*7.9*/form(routes.CategoryManagement.save())/*7.47*/ {_display_(Seq[Any](format.raw/*7.49*/(""" 
       		
      
              """),_display_(Seq[Any](/*10.16*/inputText(field=categoryForm("name"), args='_label->"Category Name"))),format.raw/*10.84*/("""
              <input type="submit" value="Create">
            """)))})),format.raw/*12.14*/("""
                       
     """)))})),format.raw/*14.7*/("""

"""))}
    }
    
    def render(categoryForm:Form[models.admission.Category]): play.api.templates.Html = apply(categoryForm)
    
    def f:((Form[models.admission.Category]) => play.api.templates.Html) = (categoryForm) => apply(categoryForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/category/create.scala.html
                    HASH: bf2e6ca5e34f558215c35c207b869ac1f8247db3
                    MATRIX: 758->1|935->48|962->103|998->105|1028->127|1067->129|1112->140|1158->178|1197->180|1267->214|1357->282|1454->347|1516->378
                    LINES: 26->1|32->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|39->10|39->10|41->12|43->14
                    -- GENERATED --
                */
            