
package views.html.faculty

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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Faculty],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(facultyForm: Form[models.admission.Faculty]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Edit Faculty")/*4.22*/{_display_(Seq[Any](format.raw/*4.23*/("""
  <h2>Update the Faculty having ID """),_display_(Seq[Any](/*5.37*/facultyForm/*5.48*/.get.id)),format.raw/*5.55*/("""</h2><br/><br/>
  
  """),_display_(Seq[Any](/*7.4*/form(routes.FacultyManagement.update())/*7.43*/ {_display_(Seq[Any](format.raw/*7.45*/("""
  	  <input type="hidden" name="id" value="""),_display_(Seq[Any](/*8.44*/facultyForm/*8.55*/.get.id)),format.raw/*8.62*/(""" >
  	  
      """),_display_(Seq[Any](/*10.8*/inputText(facultyForm("name"), '_label->"Faculty Name"))),format.raw/*10.63*/("""</tr>
	  <input type="submit" value="Update">
  """)))})),format.raw/*12.4*/("""
""")))})))}
    }
    
    def render(facultyForm:Form[models.admission.Faculty]): play.api.templates.Html = apply(facultyForm)
    
    def f:((Form[models.admission.Faculty]) => play.api.templates.Html) = (facultyForm) => apply(facultyForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/faculty/edit.scala.html
                    HASH: 3a06e64ef13d40e004a810e3e4c56e2b76f4ff02
                    MATRIX: 754->1|892->46|919->64|955->66|983->86|1021->87|1093->124|1112->135|1140->142|1196->164|1243->203|1282->205|1361->249|1380->260|1408->267|1459->283|1536->338|1616->387
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|40->12
                    -- GENERATED --
                */
            