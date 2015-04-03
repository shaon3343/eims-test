
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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Employee],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(employeeForm: Form[models.admission.Employee]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Edit Employee")/*4.23*/{_display_(Seq[Any](format.raw/*4.24*/("""
  <h2>Update the Employee having ID """),_display_(Seq[Any](/*5.38*/employeeForm/*5.50*/.get.id)),format.raw/*5.57*/("""</h2><br/><br/>
  
  """),_display_(Seq[Any](/*7.4*/form(routes.EmployeeManagement.update())/*7.44*/ {_display_(Seq[Any](format.raw/*7.46*/("""
  	  <input type="hidden" name="id" value="""),_display_(Seq[Any](/*8.44*/employeeForm/*8.56*/.get.id)),format.raw/*8.63*/(""" >
  	  
      """),_display_(Seq[Any](/*10.8*/inputText(employeeForm("name"), '_label->"Employee Name"))),format.raw/*10.65*/("""</tr>
      
      """),_display_(Seq[Any](/*12.8*/inputText(field=employeeForm("fathersName"), '_label->"Fathers Name"))),format.raw/*12.77*/("""
	  """),_display_(Seq[Any](/*13.5*/inputText(field=employeeForm("mothersName"), '_label->"Mothers Name"))),format.raw/*13.74*/("""
	  
      """),_display_(Seq[Any](/*15.8*/textarea(field=employeeForm("presentAddress"), 'rows -> 3, 'cols -> 50, '_label->"Present Address"))),format.raw/*15.107*/("""
  	  """),_display_(Seq[Any](/*16.7*/textarea(field=employeeForm("permanentAddress"), 'rows -> 3, 'cols -> 50, '_label->"Permanent Address"))),format.raw/*16.110*/("""
	    
	   <select name="placeOfBirth" >
        """),_display_(Seq[Any](/*19.10*/for((id, name) <- District.getDistrictsAsMap) yield /*19.55*/{_display_(Seq[Any](format.raw/*19.56*/("""
          <option value=""""),_display_(Seq[Any](/*20.27*/id)),format.raw/*20.29*/("""" """),_display_(Seq[Any](/*20.32*/if(employeeForm.get.placeOfBirth.toString==id)/*20.78*/{_display_(Seq[Any](format.raw/*20.79*/("""selected""")))})),format.raw/*20.88*/(""">"""),_display_(Seq[Any](/*20.90*/name)),format.raw/*20.94*/("""</option>
        """)))})),format.raw/*21.10*/("""
        </select>
	  
	  """),_display_(Seq[Any](/*24.5*/inputText(field=employeeForm("natIdNo"), '_label->"National Id No"))),format.raw/*24.72*/("""
	  """),_display_(Seq[Any](/*25.5*/inputText(field=employeeForm("birthCertNo"), '_label->"Birth Certificate No"))),format.raw/*25.82*/("""
	  """),_display_(Seq[Any](/*26.5*/inputText(field=employeeForm("tin"), '_label->"TIN"))),format.raw/*26.57*/("""
	  """),_display_(Seq[Any](/*27.5*/inputText(field=employeeForm("nationality"), '_label->"Nationality"))),format.raw/*27.73*/("""
	  
	   <label>Religion</label>
	   <select name="religion" >
         <option value="Islam" """),_display_(Seq[Any](/*31.33*/if(employeeForm.get.religion.toString=="Islam")/*31.80*/{_display_(Seq[Any](format.raw/*31.81*/("""selected""")))})),format.raw/*31.90*/(""">"Islam"</option>
         <option value="Hindu" """),_display_(Seq[Any](/*32.33*/if(employeeForm.get.religion.toString=="Hindu")/*32.80*/{_display_(Seq[Any](format.raw/*32.81*/("""selected""")))})),format.raw/*32.90*/(""">"Hindu"</option>
         <option value="Christian" """),_display_(Seq[Any](/*33.37*/if(employeeForm.get.religion.toString=="Islam")/*33.84*/{_display_(Seq[Any](format.raw/*33.85*/("""selected""")))})),format.raw/*33.94*/(""">"Christian"</option>
         <option value="Buddhist" """),_display_(Seq[Any](/*34.36*/if(employeeForm.get.religion.toString=="Islam")/*34.83*/{_display_(Seq[Any](format.raw/*34.84*/("""selected""")))})),format.raw/*34.93*/(""">"Buddhist"</option>
         <option value="Others" """),_display_(Seq[Any](/*35.34*/if(employeeForm.get.religion.toString=="Islam")/*35.81*/{_display_(Seq[Any](format.raw/*35.82*/("""selected""")))})),format.raw/*35.91*/(""">"Others"</option>
       </select>
	  

	   <label>Blood Group</label>
	   <select name="bloodGroup" >
         <option value="O-" """),_display_(Seq[Any](/*41.30*/if(employeeForm.get.bloodGroup.toString=="O+")/*41.76*/{_display_(Seq[Any](format.raw/*41.77*/("""selected""")))})),format.raw/*41.86*/(""">"O+"</option>
         <option value="O+" """),_display_(Seq[Any](/*42.30*/if(employeeForm.get.bloodGroup.toString=="O+")/*42.76*/{_display_(Seq[Any](format.raw/*42.77*/("""selected""")))})),format.raw/*42.86*/(""">"O+"</option>
         <option value="A-" """),_display_(Seq[Any](/*43.30*/if(employeeForm.get.bloodGroup.toString=="A-")/*43.76*/{_display_(Seq[Any](format.raw/*43.77*/("""selected""")))})),format.raw/*43.86*/(""">"A-"</option>
         <option value="A+" """),_display_(Seq[Any](/*44.30*/if(employeeForm.get.bloodGroup.toString=="A+")/*44.76*/{_display_(Seq[Any](format.raw/*44.77*/("""selected""")))})),format.raw/*44.86*/(""">"A+"</option>
         <option value="B-" """),_display_(Seq[Any](/*45.30*/if(employeeForm.get.bloodGroup.toString=="B-")/*45.76*/{_display_(Seq[Any](format.raw/*45.77*/("""selected""")))})),format.raw/*45.86*/(""">"B-"</option>
         <option value="B+" """),_display_(Seq[Any](/*46.30*/if(employeeForm.get.bloodGroup.toString=="B+")/*46.76*/{_display_(Seq[Any](format.raw/*46.77*/("""selected""")))})),format.raw/*46.86*/(""">"B+"</option>
         <option value="AB-" """),_display_(Seq[Any](/*47.31*/if(employeeForm.get.bloodGroup.toString=="AB-")/*47.78*/{_display_(Seq[Any](format.raw/*47.79*/("""selected""")))})),format.raw/*47.88*/(""">"AB-"</option>
         <option value="AB+" """),_display_(Seq[Any](/*48.31*/if(employeeForm.get.bloodGroup.toString=="AB+")/*48.78*/{_display_(Seq[Any](format.raw/*48.79*/("""selected""")))})),format.raw/*48.88*/(""">"AB+"</option>
      </select>

	  """),_display_(Seq[Any](/*51.5*/inputText(field=employeeForm("maritalStat"), '_label->"Marital Status"))),format.raw/*51.76*/("""
	   """),_display_(Seq[Any](/*52.6*/inputRadioGroup(
	          employeeForm("maritalStat"),
	          options = options("Single"->"Single","Married"->"Married"),
	          '_label -> "Maritual Status"
	          ))),format.raw/*56.13*/("""
	  
	  """),_display_(Seq[Any](/*58.5*/inputText(field=employeeForm("spouseName"), '_label->"Spouse Name"))),format.raw/*58.72*/("""
	  
	  """),_display_(Seq[Any](/*60.5*/inputText(field=employeeForm("noOfChild"), '_label->"No Of Child"))),format.raw/*60.71*/("""
	    <label>No. of Child</label>
	   <select name="noOfChild" >
         <option value="1" """),_display_(Seq[Any](/*63.29*/if(employeeForm.get.noOfChild.toString=="1")/*63.73*/{_display_(Seq[Any](format.raw/*63.74*/("""selected""")))})),format.raw/*63.83*/(""">"1"</option>
		<option value="2" """),_display_(Seq[Any](/*64.22*/if(employeeForm.get.noOfChild.toString=="2")/*64.66*/{_display_(Seq[Any](format.raw/*64.67*/("""selected""")))})),format.raw/*64.76*/(""">"2"</option>
		<option value="3" """),_display_(Seq[Any](/*65.22*/if(employeeForm.get.noOfChild.toString=="3")/*65.66*/{_display_(Seq[Any](format.raw/*65.67*/("""selected""")))})),format.raw/*65.76*/(""">"3"</option>
		<option value="4" """),_display_(Seq[Any](/*66.22*/if(employeeForm.get.noOfChild.toString=="4")/*66.66*/{_display_(Seq[Any](format.raw/*66.67*/("""selected""")))})),format.raw/*66.76*/(""">"4"</option>
		<option value="5" """),_display_(Seq[Any](/*67.22*/if(employeeForm.get.noOfChild.toString=="5")/*67.66*/{_display_(Seq[Any](format.raw/*67.67*/("""selected""")))})),format.raw/*67.76*/(""">"5"</option>
         
      </select>
	  
	  
	  <input type="submit" value="Update">
  """)))})),format.raw/*73.4*/("""
""")))})))}
    }
    
    def render(employeeForm:Form[models.admission.Employee]): play.api.templates.Html = apply(employeeForm)
    
    def f:((Form[models.admission.Employee]) => play.api.templates.Html) = (employeeForm) => apply(employeeForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/employee/edit.scala.html
                    HASH: 3d5e89fa3882512ecc09ad9f22c1beadab9a5fea
                    MATRIX: 756->1|896->48|923->66|959->68|988->89|1026->90|1099->128|1119->140|1147->147|1203->169|1251->209|1290->211|1369->255|1389->267|1417->274|1468->290|1547->347|1602->367|1693->436|1733->441|1824->510|1871->522|1993->621|2035->628|2161->731|2247->781|2308->826|2347->827|2410->854|2434->856|2473->859|2528->905|2567->906|2608->915|2646->917|2672->921|2723->940|2785->967|2874->1034|2914->1039|3013->1116|3053->1121|3127->1173|3167->1178|3257->1246|3388->1341|3444->1388|3483->1389|3524->1398|3610->1448|3666->1495|3705->1496|3746->1505|3836->1559|3892->1606|3931->1607|3972->1616|4065->1673|4121->1720|4160->1721|4201->1730|4291->1784|4347->1831|4386->1832|4427->1841|4596->1974|4651->2020|4690->2021|4731->2030|4811->2074|4866->2120|4905->2121|4946->2130|5026->2174|5081->2220|5120->2221|5161->2230|5241->2274|5296->2320|5335->2321|5376->2330|5456->2374|5511->2420|5550->2421|5591->2430|5671->2474|5726->2520|5765->2521|5806->2530|5887->2575|5943->2622|5982->2623|6023->2632|6105->2678|6161->2725|6200->2726|6241->2735|6313->2772|6406->2843|6447->2849|6649->3029|6693->3038|6782->3105|6826->3114|6914->3180|7043->3273|7096->3317|7135->3318|7176->3327|7247->3362|7300->3406|7339->3407|7380->3416|7451->3451|7504->3495|7543->3496|7584->3505|7655->3540|7708->3584|7747->3585|7788->3594|7859->3629|7912->3673|7951->3674|7992->3683|8114->3774
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|40->12|40->12|41->13|41->13|43->15|43->15|44->16|44->16|47->19|47->19|47->19|48->20|48->20|48->20|48->20|48->20|48->20|48->20|48->20|49->21|52->24|52->24|53->25|53->25|54->26|54->26|55->27|55->27|59->31|59->31|59->31|59->31|60->32|60->32|60->32|60->32|61->33|61->33|61->33|61->33|62->34|62->34|62->34|62->34|63->35|63->35|63->35|63->35|69->41|69->41|69->41|69->41|70->42|70->42|70->42|70->42|71->43|71->43|71->43|71->43|72->44|72->44|72->44|72->44|73->45|73->45|73->45|73->45|74->46|74->46|74->46|74->46|75->47|75->47|75->47|75->47|76->48|76->48|76->48|76->48|79->51|79->51|80->52|84->56|86->58|86->58|88->60|88->60|91->63|91->63|91->63|91->63|92->64|92->64|92->64|92->64|93->65|93->65|93->65|93->65|94->66|94->66|94->66|94->66|95->67|95->67|95->67|95->67|101->73
                    -- GENERATED --
                */
            