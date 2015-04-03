
package views.html.university

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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.University],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(universityForm: Form[models.admission.University]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.53*/("""
"""),format.raw/*3.1*/("""

"""),_display_(Seq[Any](/*5.2*/main("University Entry")/*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/("""

       """),_display_(Seq[Any](/*7.9*/form(routes.UniversityManagement.save())/*7.49*/ {_display_(Seq[Any](format.raw/*7.51*/(""" 
              """),_display_(Seq[Any](/*8.16*/inputText(field=universityForm("name"), args='_label->"University Name"))),format.raw/*8.88*/("""
              """),_display_(Seq[Any](/*9.16*/inputText(field=universityForm("email"), args='_label->"University Email"))),format.raw/*9.90*/("""
              """),_display_(Seq[Any](/*10.16*/inputText(field=universityForm("address"), args='_label->"University Address"))),format.raw/*10.94*/("""
              """),_display_(Seq[Any](/*11.16*/inputText(field=universityForm("personDetails"), args='_label->"University Person Details"))),format.raw/*11.107*/("""
              """),_display_(Seq[Any](/*12.16*/inputText(field=universityForm("contactNo"), args='_label->"University Contact No"))),format.raw/*12.99*/("""
             	<input type="submit" value="Create">
            """)))})),format.raw/*14.14*/("""
                       
     """)))})),format.raw/*16.7*/("""

"""))}
    }
    
    def render(universityForm:Form[models.admission.University]): play.api.templates.Html = apply(universityForm)
    
    def f:((Form[models.admission.University]) => play.api.templates.Html) = (universityForm) => apply(universityForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/university/create.scala.html
                    HASH: df6bea557eba7a8d01a05120181cbfc9013582d8
                    MATRIX: 762->1|906->52|933->70|970->73|1002->97|1041->99|1085->109|1133->149|1172->151|1224->168|1317->240|1368->256|1463->330|1515->346|1615->424|1667->440|1781->531|1833->547|1938->630|2035->695|2097->726
                    LINES: 26->1|30->1|31->3|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|37->9|37->9|38->10|38->10|39->11|39->11|40->12|40->12|42->14|44->16
                    -- GENERATED --
                */
            