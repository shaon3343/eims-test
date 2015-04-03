
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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.University,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(university: models.admission.University):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("")/*4.10*/{_display_(Seq[Any](format.raw/*4.11*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*7.28*/university/*7.38*/.id)),format.raw/*7.41*/("""</td> </tr>
    <tr> <th >University Name</th> <td>"""),_display_(Seq[Any](/*8.41*/university/*8.51*/.name)),format.raw/*8.56*/("""</td> </tr>
    <tr> <th >University Email</th> <td>"""),_display_(Seq[Any](/*9.42*/university/*9.52*/.email)),format.raw/*9.58*/("""</td> </tr>
    <tr> <th >University Address</th> <td>"""),_display_(Seq[Any](/*10.44*/university/*10.54*/.address)),format.raw/*10.62*/("""</td> </tr>
    <tr> <th >University Person Details</th> <td>"""),_display_(Seq[Any](/*11.51*/university/*11.61*/.personDetails)),format.raw/*11.75*/("""</td> </tr>
    <tr> <th >University Contact No</th> <td>"""),_display_(Seq[Any](/*12.47*/university/*12.57*/.contactNo)),format.raw/*12.67*/("""</td> </tr>
  </table>
 	 """),_display_(Seq[Any](/*14.5*/form(routes.UniversityManagement.edit(university.id))/*14.58*/ {_display_(Seq[Any](format.raw/*14.60*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*16.8*/("""
  		""")))})),format.raw/*17.6*/("""
"""))}
    }
    
    def render(university:models.admission.University): play.api.templates.Html = apply(university)
    
    def f:((models.admission.University) => play.api.templates.Html) = (university) => apply(university)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:44 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/university/show.scala.html
                    HASH: 9011ad290bb4d923bd8b078562d58d846a479ce7
                    MATRIX: 754->1|888->42|915->60|951->62|967->70|1005->71|1079->110|1097->120|1121->123|1208->175|1226->185|1252->190|1340->243|1358->253|1385->259|1476->314|1495->324|1525->332|1623->394|1642->404|1678->418|1772->476|1791->486|1823->496|1885->523|1947->576|1987->578|2067->627|2104->633
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|44->16|45->17
                    -- GENERATED --
                */
            