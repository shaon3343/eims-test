
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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.Parent,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(parent: models.admission.Parent):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Parent")/*5.16*/{_display_(Seq[Any](format.raw/*5.17*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*8.28*/parent/*8.34*/.pid)),format.raw/*8.38*/("""</td> </tr>
    <tr> <th >Parent Name</th> <td>"""),_display_(Seq[Any](/*9.37*/parent/*9.43*/.name)),format.raw/*9.48*/("""</td> </tr>
  </table>
   
     """),_display_(Seq[Any](/*12.7*/form(routes.ParentManagement.edit(parent.pid))/*12.53*/ {_display_(Seq[Any](format.raw/*12.55*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*14.8*/("""
     """)))})),format.raw/*15.7*/("""

     """))}
    }
    
    def render(parent:models.admission.Parent): play.api.templates.Html = apply(parent)
    
    def f:((models.admission.Parent) => play.api.templates.Html) = (parent) => apply(parent)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/parent/show.scala.html
                    HASH: aff70444333bb48e89e423dc34c7a91d33697ac2
                    MATRIX: 746->1|872->34|900->53|936->55|958->69|996->70|1070->109|1084->115|1109->119|1192->167|1206->173|1232->178|1300->211|1355->257|1395->259|1475->308|1513->315
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|36->8|37->9|37->9|37->9|40->12|40->12|40->12|42->14|43->15
                    -- GENERATED --
                */
            