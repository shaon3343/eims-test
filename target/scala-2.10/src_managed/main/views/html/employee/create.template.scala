
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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[dummymodels.DummyEmployee],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(employeeForm: Form[dummymodels.DummyEmployee]):play.api.templates.Html = {
        _display_ {import helper._

import  models.admission.Department

import  models.admission.Designation

import  models.admission.Category


Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*6.1*/("""
"""),_display_(Seq[Any](/*7.2*/main("Employee Entry")/*7.24*/ {_display_(Seq[Any](format.raw/*7.26*/("""
	
       """),_display_(Seq[Any](/*9.9*/form(routes.EmployeeManagement.save())/*9.47*/ {_display_(Seq[Any](format.raw/*9.49*/(""" 
       		
       		 
       		  """),_display_(Seq[Any](/*12.13*/inputText(field=employeeForm("employeeName"), args='_label->"Employee Name"))),format.raw/*12.89*/("""
       		 
       		  
       		  """),_display_(Seq[Any](/*15.13*/select(
		      employeeForm("categoryId"),
		      options(Category.getCategoriesAsMap),
		      '_label -> "Category",
		      '_default -> "-- Choose a Category --"
		    ))),format.raw/*20.8*/("""
       		 
       		 <!--other fields-->
       		 
       		  """),_display_(Seq[Any](/*24.13*/select(
		      employeeForm("departmentId"),
		      options(Department.getDepartmentsAsMap),
		      '_label -> "Department",
		      '_default -> "-- Choose a Department --"
		    ))),format.raw/*29.8*/("""
		    
		    """),_display_(Seq[Any](/*31.8*/select(
		      employeeForm("designationId"),
		      options(Designation.getDesignationsAsMap),
		      '_label -> "Designation",
		      '_default -> "-- Choose a Designation --"
		    ))),format.raw/*36.8*/("""
       
	  		"""),_display_(Seq[Any](/*38.7*/select(
		      employeeForm("employeeType"),
		      options(Seq("Teacher","Staff")),
		      '_label -> "Employee Type",
		      '_default -> "-- Choose a Employee Type --"
		    ))),format.raw/*43.8*/("""			
		           
       		 """),_display_(Seq[Any](/*45.12*/inputText(field=employeeForm("fathersName"), args='_label->"Fathers Name"))),format.raw/*45.86*/("""
       		  """),_display_(Seq[Any](/*46.13*/inputText(field=employeeForm("mothersName"), args='_label->"Mothers Name"))),format.raw/*46.87*/("""
       		  
       		  
       		  """),_display_(Seq[Any](/*49.13*/textarea(field=employeeForm("presentAddress"), 'rows -> 3, 'cols -> 50, '_label->"Present Address"))),format.raw/*49.112*/("""
       		  """),_display_(Seq[Any](/*50.13*/textarea(field=employeeForm("permanentAddress"), 'rows -> 3, 'cols -> 50, '_label->"Permanent Address"))),format.raw/*50.116*/("""
       		  
       		  """),_display_(Seq[Any](/*52.13*/inputText(field=employeeForm("dateOfBirth"), args='_label->"Date Of Birth"))),format.raw/*52.88*/("""
       		  """),_display_(Seq[Any](/*53.13*/select(
		      employeeForm("placeOfBirth"),
		      options(District.getDistrictsAsMap),
		      '_label -> "Place Of Birth",
		      '_default -> "-- Choose one --"
		     ))),format.raw/*58.9*/("""
       		  
       		  """),_display_(Seq[Any](/*60.13*/inputText(field=employeeForm("natIdNo"), args='_label->"National Id No"))),format.raw/*60.85*/("""
       		  """),_display_(Seq[Any](/*61.13*/inputText(field=employeeForm("birthCertNo"), args='_label->"Birth Certificate No"))),format.raw/*61.95*/("""
       		  """),_display_(Seq[Any](/*62.13*/inputText(field=employeeForm("tin"), args='_label->"TIN"))),format.raw/*62.70*/("""
       		  """),_display_(Seq[Any](/*63.13*/inputText(field=employeeForm("nationality"), args='_label->"Nationality"))),format.raw/*63.86*/("""


       		  """),_display_(Seq[Any](/*66.13*/select(
		      employeeForm("religion"),
		      options(Seq("Islam","Hindu","Christian","Buddhist","Others")),
		      '_label -> "Religion",
		      '_default -> "-- Choose Your Religion --"
		    ))),format.raw/*71.8*/("""	
       		  
       		  """),_display_(Seq[Any](/*73.13*/select(
		      employeeForm("bloodGroup"),
		      options(Seq("O-","O+","A-","A+","B-","B+","AB-","AB+")),
		      '_label -> "Blood Group",
		      '_default -> "-- Choose Your Blood Group --"
		    ))),format.raw/*78.8*/("""
       		 
       		  """),_display_(Seq[Any](/*80.13*/inputRadioGroup(
	          employeeForm("maritalStat"),
	          options = options("Single"->"Single","Married"->"Married"),
	          '_label -> "Maritual Status"
	          ))),format.raw/*84.13*/("""
       		  
       		  """),_display_(Seq[Any](/*86.13*/inputText(field=employeeForm("spouseName"), args='_label->"Spouse Name"))),format.raw/*86.85*/("""
       		 
       		  """),_display_(Seq[Any](/*88.13*/select(
		      employeeForm("noOfChild"),
		      options(Seq("1","2","3","4","5")),
		      '_label -> "No Of Child",
		      '_default -> "-- Choose a number --"
		    ))),format.raw/*93.8*/("""
       		  
       		 """),_display_(Seq[Any](/*95.12*/inputText(field=employeeForm("SSCSession"), args='_label->"SSC Session"))),format.raw/*95.84*/("""
			 """),_display_(Seq[Any](/*96.6*/inputText(field=employeeForm("SSCResult"), args='_label->"SSC Result"))),format.raw/*96.76*/("""
			 """),_display_(Seq[Any](/*97.6*/inputText(field=employeeForm("SSCSchool"), args='_label->"School Name"))),format.raw/*97.77*/("""
			
			//hsc
			 """),_display_(Seq[Any](/*100.6*/inputText(field=employeeForm("HSCSession"), args='_label->"HSC Session"))),format.raw/*100.78*/("""
			 """),_display_(Seq[Any](/*101.6*/inputText(field=employeeForm("HSCResult"), args='_label->"HSC Result"))),format.raw/*101.76*/("""
			 """),_display_(Seq[Any](/*102.6*/inputText(field=employeeForm("HSCCollage"), args='_label->"College Name"))),format.raw/*102.79*/("""
			
			//hons
			 """),_display_(Seq[Any](/*105.6*/inputText(field=employeeForm("HonsSession"), args='_label->"Hons Session"))),format.raw/*105.80*/("""
			 """),_display_(Seq[Any](/*106.6*/inputText(field=employeeForm("HonsResult"), args='_label->"Hons Result"))),format.raw/*106.78*/("""
			 """),_display_(Seq[Any](/*107.6*/inputText(field=employeeForm("HonsUniv"), args='_label->"University Name"))),format.raw/*107.80*/("""
			
			//ms
			 """),_display_(Seq[Any](/*110.6*/inputText(field=employeeForm("MsSession"), args='_label->"MS Session"))),format.raw/*110.76*/("""
			 """),_display_(Seq[Any](/*111.6*/inputText(field=employeeForm("MsResult"), args='_label->"MS result"))),format.raw/*111.74*/("""
			 """),_display_(Seq[Any](/*112.6*/inputText(field=employeeForm("MsUniv"), args='_label->"MS University"))),format.raw/*112.76*/("""
			
			//phd
			 """),_display_(Seq[Any](/*115.6*/inputText(field=employeeForm("PHDYear"), args='_label->"Phd Year"))),format.raw/*115.72*/("""
			 """),_display_(Seq[Any](/*116.6*/inputText(field=employeeForm("PHDTopics"), args='_label->"Phd Topics"))),format.raw/*116.76*/("""
			 """),_display_(Seq[Any](/*117.6*/inputText(field=employeeForm("PHDUniv"), args='_label->"University"))),format.raw/*117.74*/("""
       		  
       		  
       <!--other fields-->
             
              <input type="submit" value="Create">
            """)))})),format.raw/*123.14*/("""
                       
     """)))})),format.raw/*125.7*/("""

"""))}
    }
    
    def render(employeeForm:Form[dummymodels.DummyEmployee]): play.api.templates.Html = apply(employeeForm)
    
    def f:((Form[dummymodels.DummyEmployee]) => play.api.templates.Html) = (employeeForm) => apply(employeeForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/employee/create.scala.html
                    HASH: fe63574a8d36523260e99f225fceea12f661fb0a
                    MATRIX: 758->1|1008->48|1035->176|1071->178|1101->200|1140->202|1185->213|1231->251|1270->253|1341->288|1439->364|1511->400|1707->575|1808->640|2013->824|2063->839|2273->1028|2323->1043|2526->1225|2591->1254|2687->1328|2736->1341|2832->1415|2905->1452|3027->1551|3076->1564|3202->1667|3263->1692|3360->1767|3409->1780|3606->1956|3667->1981|3761->2053|3810->2066|3914->2148|3963->2161|4042->2218|4091->2231|4186->2304|4237->2319|4459->2520|4521->2546|4745->2749|4805->2773|5007->2953|5068->2978|5162->3050|5222->3074|5415->3246|5475->3270|5569->3342|5610->3348|5702->3418|5743->3424|5836->3495|5891->3514|5986->3586|6028->3592|6121->3662|6163->3668|6259->3741|6315->3761|6412->3835|6454->3841|6549->3913|6591->3919|6688->3993|6742->4011|6835->4081|6877->4087|6968->4155|7010->4161|7103->4231|7158->4250|7247->4316|7289->4322|7382->4392|7424->4398|7515->4466|7678->4596|7741->4627
                    LINES: 26->1|36->1|37->6|38->7|38->7|38->7|40->9|40->9|40->9|43->12|43->12|46->15|51->20|55->24|60->29|62->31|67->36|69->38|74->43|76->45|76->45|77->46|77->46|80->49|80->49|81->50|81->50|83->52|83->52|84->53|89->58|91->60|91->60|92->61|92->61|93->62|93->62|94->63|94->63|97->66|102->71|104->73|109->78|111->80|115->84|117->86|117->86|119->88|124->93|126->95|126->95|127->96|127->96|128->97|128->97|131->100|131->100|132->101|132->101|133->102|133->102|136->105|136->105|137->106|137->106|138->107|138->107|141->110|141->110|142->111|142->111|143->112|143->112|146->115|146->115|147->116|147->116|148->117|148->117|154->123|156->125
                    -- GENERATED --
                */
            