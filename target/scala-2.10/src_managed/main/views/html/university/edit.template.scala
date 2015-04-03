
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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.University],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(universityForm: Form[models.admission.University]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.53*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Edit University")/*4.25*/{_display_(Seq[Any](format.raw/*4.26*/("""
  <h2>Update the University having ID """),_display_(Seq[Any](/*5.40*/universityForm/*5.54*/.get.id)),format.raw/*5.61*/("""</h2><br/><br/>
  
  """),_display_(Seq[Any](/*7.4*/form(routes.UniversityManagement.update())/*7.46*/ {_display_(Seq[Any](format.raw/*7.48*/("""
  	  <input type="hidden" name="id" value="""),_display_(Seq[Any](/*8.44*/universityForm/*8.58*/.get.id)),format.raw/*8.65*/(""" >
  	  
      """),_display_(Seq[Any](/*10.8*/inputText(universityForm("name"), '_label->"University Name"))),format.raw/*10.69*/("""
      """),_display_(Seq[Any](/*11.8*/inputText(field=universityForm("email"), '_label->"University Email"))),format.raw/*11.77*/("""
      """),_display_(Seq[Any](/*12.8*/inputText(field=universityForm("address"), '_label->"University Address"))),format.raw/*12.81*/("""
      """),_display_(Seq[Any](/*13.8*/inputText(field=universityForm("personDetails"), '_label->"University Person Details"))),format.raw/*13.94*/("""
      """),_display_(Seq[Any](/*14.8*/inputText(field=universityForm("contactNo"), '_label->"University Contact No"))),format.raw/*14.86*/("""
	  <input type="submit" value="Update">
  """)))})),format.raw/*16.4*/("""
""")))})))}
    }
    
    def render(universityForm:Form[models.admission.University]): play.api.templates.Html = apply(universityForm)
    
    def f:((Form[models.admission.University]) => play.api.templates.Html) = (universityForm) => apply(universityForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/university/edit.scala.html
                    HASH: 621177af118e3e547de4625dc1940de242e13837
                    MATRIX: 760->1|904->52|931->70|967->72|998->95|1036->96|1111->136|1133->150|1161->157|1217->179|1267->221|1306->223|1385->267|1407->281|1435->288|1486->304|1569->365|1612->373|1703->442|1746->450|1841->523|1884->531|1992->617|2035->625|2135->703|2210->747
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|42->14|42->14|44->16
                    -- GENERATED --
                */
            