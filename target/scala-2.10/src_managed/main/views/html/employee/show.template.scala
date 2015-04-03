
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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.admission.Employee,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(employee: models.admission.Employee):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Employee")/*5.18*/{_display_(Seq[Any](format.raw/*5.19*/("""

  <table>
    <tr> <th >ID</th> <td>"""),_display_(Seq[Any](/*8.28*/employee/*8.36*/.id)),format.raw/*8.39*/("""</td> </tr>
    <tr> <th >Employee Name</th> <td>"""),_display_(Seq[Any](/*9.39*/employee/*9.47*/.name)),format.raw/*9.52*/("""</td> </tr>
     <tr> <th>Employee Type</th> <td>"""),_display_(Seq[Any](/*10.39*/employee/*10.47*/.employeeType)),format.raw/*10.60*/("""</td> </tr>
   <tr> <th>Fathers Name</th> <td>"""),_display_(Seq[Any](/*11.36*/employee/*11.44*/.fathersName)),format.raw/*11.56*/("""</td> </tr>
   <tr>    <th>Mothers Name</th><td>"""),_display_(Seq[Any](/*12.38*/employee/*12.46*/.mothersName)),format.raw/*12.58*/("""</td> </tr>
    <tr>   <th>Present Address</th> <td>"""),_display_(Seq[Any](/*13.42*/employee/*13.50*/.presentAddress)),format.raw/*13.65*/("""</td></tr>
      <tr> <th>Permanent Address</th>  <td>"""),_display_(Seq[Any](/*14.45*/employee/*14.53*/.permanentAddress)),format.raw/*14.70*/("""</td> </tr>
       <tr><th>Place Of Birth</th> <td>"""),_display_(Seq[Any](/*15.41*/employee/*15.49*/.placeOfBirth)),format.raw/*15.62*/("""</td> </tr>
       <tr><th>National Id No</th> <td>"""),_display_(Seq[Any](/*16.41*/employee/*16.49*/.natIdNo)),format.raw/*16.57*/("""</td> </tr>
       <tr><th>Birth Certificate No</th> <td>"""),_display_(Seq[Any](/*17.47*/employee/*17.55*/.birthCertNo)),format.raw/*17.67*/("""</td> </tr>
       <tr><th>TIN</th> <td>"""),_display_(Seq[Any](/*18.30*/employee/*18.38*/.tin)),format.raw/*18.42*/("""</td></tr>
       <tr><th>Nationality</th> <td>"""),_display_(Seq[Any](/*19.38*/employee/*19.46*/.nationality)),format.raw/*19.58*/("""</td> </tr>
       <tr><th>Religion</th>   <td>"""),_display_(Seq[Any](/*20.37*/employee/*20.45*/.religion)),format.raw/*20.54*/("""</td></tr>
       <tr><th>Blood Group</th> <td>"""),_display_(Seq[Any](/*21.38*/employee/*21.46*/.bloodGroup)),format.raw/*21.57*/("""</td> </tr>
       <tr><th>Marital Status</th><td>"""),_display_(Seq[Any](/*22.40*/employee/*22.48*/.maritalStat)),format.raw/*22.60*/("""</td> </tr>
       <tr><th>Spouse Name</th><td>"""),_display_(Seq[Any](/*23.37*/employee/*23.45*/.spouseName)),format.raw/*23.56*/("""</td> </tr>
       <tr><th>No Of Child</th><td>"""),_display_(Seq[Any](/*24.37*/employee/*24.45*/.noOfChild)),format.raw/*24.55*/("""</td> </tr>
    
    
  </table>
   
     """),_display_(Seq[Any](/*29.7*/form(routes.EmployeeManagement.edit(employee.id))/*29.56*/ {_display_(Seq[Any](format.raw/*29.58*/("""
		    <input type="submit" value="Edit">
  		  """)))})),format.raw/*31.8*/("""
     """)))})),format.raw/*32.7*/("""

     """))}
    }
    
    def render(employee:models.admission.Employee): play.api.templates.Html = apply(employee)
    
    def f:((models.admission.Employee) => play.api.templates.Html) = (employee) => apply(employee)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/employee/show.scala.html
                    HASH: b72271158f24a8f54315a65d50c86edeec066fa5
                    MATRIX: 750->1|880->38|908->57|944->59|968->75|1006->76|1080->115|1096->123|1120->126|1205->176|1221->184|1247->189|1333->239|1350->247|1385->260|1468->307|1485->315|1519->327|1604->376|1621->384|1655->396|1744->449|1761->457|1798->472|1889->527|1906->535|1945->552|2033->604|2050->612|2085->625|2173->677|2190->685|2220->693|2314->751|2331->759|2365->771|2442->812|2459->820|2485->824|2569->872|2586->880|2620->892|2704->940|2721->948|2752->957|2836->1005|2853->1013|2886->1024|2973->1075|2990->1083|3024->1095|3108->1143|3125->1151|3158->1162|3242->1210|3259->1218|3291->1228|3369->1271|3427->1320|3467->1322|3547->1371|3585->1378
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|57->29|57->29|57->29|59->31|60->32
                    -- GENERATED --
                */
            