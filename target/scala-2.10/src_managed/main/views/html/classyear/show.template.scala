
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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.ClassYear,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(classYear: models.admission.ClassYear):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.41*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Class or Year")/*5.23*/{_display_(Seq[Any](format.raw/*5.24*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*8.28*/classYear/*8.37*/.id)),format.raw/*8.40*/("""</td> </tr>
    <tr> <th >Class or Year Name</th> <td>"""),_display_(Seq[Any](/*9.44*/classYear/*9.53*/.name)),format.raw/*9.58*/("""</td> </tr>
  </table>
   
     """),_display_(Seq[Any](/*12.7*/form(routes.ClassYearManagement.edit(classYear.id))/*12.58*/ {_display_(Seq[Any](format.raw/*12.60*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*14.8*/("""
     """)))})),format.raw/*15.7*/("""
"""))}
    }
    
    def render(classYear:models.admission.ClassYear): play.api.templates.Html = apply(classYear)
    
    def f:((models.admission.ClassYear) => play.api.templates.Html) = (classYear) => apply(classYear)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/classyear/show.scala.html
                    HASH: cd9330c01928bf696c99a8091d63a6b01987110a
                    MATRIX: 752->1|884->40|912->59|948->61|977->82|1015->83|1089->122|1106->131|1130->134|1220->189|1237->198|1263->203|1331->236|1391->287|1431->289|1511->338|1549->345
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|36->8|37->9|37->9|37->9|40->12|40->12|40->12|42->14|43->15
                    -- GENERATED --
                */
            