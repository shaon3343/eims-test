
package views.html.employee

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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.admission.Employee],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(employees: List[models.admission.Employee]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.46*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("List of Employees")/*4.27*/{_display_(Seq[Any](format.raw/*4.28*/("""

 
  	"""),_display_(Seq[Any](/*7.5*/if(flash.get("msg"))/*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
         	<span>"""),_display_(Seq[Any](/*8.18*/flash/*8.23*/.get("msg"))),format.raw/*8.34*/("""</span>
     """)))})),format.raw/*9.7*/("""
  
  <table>
  <thead>
    <tr>
       <th>ID</th>
       <th>Employee Name</th>
        <th>Employee Type</th>
       <th>Fathers Name</th>
       <th>Mothers Name</th>
       <th>Present Address</th>
       <th>Permanent Address</th>
       <th>Place Of Birth</th>
       <th>National Id No</th>
       <th>Birth Certificate No</th>
       <th>TIN</th>
       <th>Nationality</th>
       <th>Religion</th>
       <th>Blood Group</th>
       <th>Marital Status</th>
       <th>Spouse Name</th>
       <th>No Of Child</th>
       
     </tr>
   </thead>
    <tbody>
    """),_display_(Seq[Any](/*35.6*/for(employee <- employees) yield /*35.32*/ {_display_(Seq[Any](format.raw/*35.34*/("""
      <tr>
        <td><a href=""""),_display_(Seq[Any](/*37.23*/routes/*37.29*/.EmployeeManagement.show(employee.id))),format.raw/*37.66*/("""">"""),_display_(Seq[Any](/*37.69*/employee/*37.77*/.id)),format.raw/*37.80*/("""</a></td>
        <td>"""),_display_(Seq[Any](/*38.14*/employee/*38.22*/.name)),format.raw/*38.27*/("""</td>
         <td>"""),_display_(Seq[Any](/*39.15*/employee/*39.23*/.employeeType)),format.raw/*39.36*/("""</td>
        <td>"""),_display_(Seq[Any](/*40.14*/employee/*40.22*/.fathersName)),format.raw/*40.34*/("""</td>
	  <td>"""),_display_(Seq[Any](/*41.9*/employee/*41.17*/.mothersName)),format.raw/*41.29*/("""</td>
	  <td>"""),_display_(Seq[Any](/*42.9*/employee/*42.17*/.presentAddress)),format.raw/*42.32*/("""</td>
	  <td>"""),_display_(Seq[Any](/*43.9*/employee/*43.17*/.permanentAddress)),format.raw/*43.34*/("""</td>
	  <td>"""),_display_(Seq[Any](/*44.9*/employee/*44.17*/.placeOfBirth)),format.raw/*44.30*/("""</td>
	  <td>"""),_display_(Seq[Any](/*45.9*/employee/*45.17*/.natIdNo)),format.raw/*45.25*/("""</td>
	  <td>"""),_display_(Seq[Any](/*46.9*/employee/*46.17*/.birthCertNo)),format.raw/*46.29*/("""</td>
	  <td>"""),_display_(Seq[Any](/*47.9*/employee/*47.17*/.tin)),format.raw/*47.21*/("""</td>
	  <td>"""),_display_(Seq[Any](/*48.9*/employee/*48.17*/.nationality)),format.raw/*48.29*/("""</td>
	  <td>"""),_display_(Seq[Any](/*49.9*/employee/*49.17*/.religion)),format.raw/*49.26*/("""</td>
	  <td>"""),_display_(Seq[Any](/*50.9*/employee/*50.17*/.bloodGroup)),format.raw/*50.28*/("""</td>
	  <td>"""),_display_(Seq[Any](/*51.9*/employee/*51.17*/.maritalStat)),format.raw/*51.29*/("""</td>
	  <td>"""),_display_(Seq[Any](/*52.9*/employee/*52.17*/.spouseName)),format.raw/*52.28*/("""</td>
	  <td>"""),_display_(Seq[Any](/*53.9*/employee/*53.17*/.noOfChild)),format.raw/*53.27*/("""</td>
        
      </tr> 
    """)))})),format.raw/*56.6*/("""
 </tbody>
 </table>

""")))})),format.raw/*60.2*/("""      """))}
    }
    
    def render(employees:List[models.admission.Employee]): play.api.templates.Html = apply(employees)
    
    def f:((List[models.admission.Employee]) => play.api.templates.Html) = (employees) => apply(employees)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/employee/list.scala.html
                    HASH: 4c7cecde8d1f7537eb4d9e4bc49de9f35c322863
                    MATRIX: 756->1|893->45|920->63|956->65|989->90|1027->91|1069->99|1097->119|1135->120|1188->138|1201->143|1233->154|1277->168|1884->740|1926->766|1966->768|2036->802|2051->808|2110->845|2149->848|2166->856|2191->859|2250->882|2267->890|2294->895|2350->915|2367->923|2402->936|2457->955|2474->963|2508->975|2557->989|2574->997|2608->1009|2657->1023|2674->1031|2711->1046|2760->1060|2777->1068|2816->1085|2865->1099|2882->1107|2917->1120|2966->1134|2983->1142|3013->1150|3062->1164|3079->1172|3113->1184|3162->1198|3179->1206|3205->1210|3254->1224|3271->1232|3305->1244|3354->1258|3371->1266|3402->1275|3451->1289|3468->1297|3501->1308|3550->1322|3567->1330|3601->1342|3650->1356|3667->1364|3700->1375|3749->1389|3766->1397|3798->1407|3862->1440|3916->1463
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|36->8|37->9|63->35|63->35|63->35|65->37|65->37|65->37|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|81->53|84->56|88->60
                    -- GENERATED --
                */
            