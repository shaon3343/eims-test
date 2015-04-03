
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.admission.Category],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(categories: List[models.admission.Category]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("List of Categories")/*4.28*/{_display_(Seq[Any](format.raw/*4.29*/("""

  	"""),_display_(Seq[Any](/*6.5*/if(flash.get("msg"))/*6.25*/{_display_(Seq[Any](format.raw/*6.26*/("""
         	<span>"""),_display_(Seq[Any](/*7.18*/flash/*7.23*/.get("msg"))),format.raw/*7.34*/("""</span>
     """)))})),format.raw/*8.7*/("""
  
  <table>
  <thead>
    <tr>
       <th>ID</th>
       <th>Category Name</th>
     </tr>
   </thead>
    <tbody>
    """),_display_(Seq[Any](/*18.6*/for(category <- categories) yield /*18.33*/ {_display_(Seq[Any](format.raw/*18.35*/("""
      <tr>
        <td><a href=""""),_display_(Seq[Any](/*20.23*/routes/*20.29*/.CategoryManagement.show(category.id))),format.raw/*20.66*/("""">"""),_display_(Seq[Any](/*20.69*/category/*20.77*/.id)),format.raw/*20.80*/("""</a></td>
        <td>"""),_display_(Seq[Any](/*21.14*/category/*21.22*/.name)),format.raw/*21.27*/("""</td>
      </tr> 
    """)))})),format.raw/*23.6*/("""
 </tbody>
 </table>

""")))})),format.raw/*27.2*/("""      """))}
    }
    
    def render(categories:List[models.admission.Category]): play.api.templates.Html = apply(categories)
    
    def f:((List[models.admission.Category]) => play.api.templates.Html) = (categories) => apply(categories)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/category/list.scala.html
                    HASH: 1819f0cfd522b6b2e2517c744cab860e4217105b
                    MATRIX: 756->1|894->46|921->64|957->66|991->92|1029->93|1069->99|1097->119|1135->120|1188->138|1201->143|1233->154|1277->168|1434->290|1477->317|1517->319|1587->353|1602->359|1661->396|1700->399|1717->407|1742->410|1801->433|1818->441|1845->446|1900->470|1954->493
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|34->6|34->6|34->6|35->7|35->7|35->7|36->8|46->18|46->18|46->18|48->20|48->20|48->20|48->20|48->20|48->20|49->21|49->21|49->21|51->23|55->27
                    -- GENERATED --
                */
            