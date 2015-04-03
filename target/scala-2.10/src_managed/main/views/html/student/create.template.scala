
package views.html.student

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
object create extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[dummymodels.DummyStudent],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(studentForm: Form[dummymodels.DummyStudent]):play.api.templates.Html = {
        _display_ {import helper._

import  models.admission.Department

import  models.admission.Designation

import  models.admission.Category

import  models.admission.Degree

import  models.admission.ClassYear

import  models.admission.SectionSemester

import  models.Division

import  models.District


Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*11.1*/("""
"""),_display_(Seq[Any](/*12.2*/main("Student Entry")/*12.23*/ {_display_(Seq[Any](format.raw/*12.25*/("""
	
		<script type="text/javascript" src='"""),_display_(Seq[Any](/*14.40*/routes/*14.46*/.DistrictFunctions.javascriptRoutes())),format.raw/*14.83*/("""'></script>
       """),_display_(Seq[Any](/*15.9*/form(routes.StudentManagement.save())/*15.46*/ {_display_(Seq[Any](format.raw/*15.48*/(""" 
       		
       		 
       		  """),_display_(Seq[Any](/*18.13*/inputText(field=studentForm("studentName"), args='_label->"Student Name"))),format.raw/*18.86*/("""
       		  
             		 
       		  """),_display_(Seq[Any](/*21.13*/select(
		      studentForm("departmentId"),
		      options(Department.getDepartmentsAsMap),
		      '_label -> "Department",
		      '_default -> "-- Choose a Department --"
		    ))),format.raw/*26.8*/("""
		    
		    """),_display_(Seq[Any](/*28.8*/select(
		      studentForm("degreeId"),
		      options(Degree.getDegreesAsMap),
		      '_label -> "Degree",
		      '_default -> "-- Choose a Degree --"
		    ))),format.raw/*33.8*/("""
		    
		    """),_display_(Seq[Any](/*35.8*/select(
		      studentForm("classId"),
		      options(ClassYear.getClassYearsAsMap),
		      '_label -> "Class or Year",
		      '_default -> "-- Choose a Class --"
		    ))),format.raw/*40.8*/("""
		    
		       
		    """),_display_(Seq[Any](/*43.8*/select(
		      studentForm("sectionId"),
		      options(SectionSemester.getSectionSemestersAsMap),
		      '_label -> "Class or Section",
		      '_default -> "-- Choose a Section --"
		    ))),format.raw/*48.8*/("""
       
        <table>
		     <tr>
		         <th>Select Image </th>
		         <td><input type="file" name="student-image" accept="image/png"></td>
		     </tr>
		</table>
       
        """),_display_(Seq[Any](/*57.10*/inputText(field=studentForm("parentName"), args='_label->"Parent Name"))),format.raw/*57.81*/("""
        
        """),_display_(Seq[Any](/*59.10*/inputText(field=studentForm("parentPhone"), args='_label->"Parent Phone"))),format.raw/*59.83*/("""
        
        """),_display_(Seq[Any](/*61.10*/inputText(field=studentForm("parentEmail"), args='_label->"Parent Email"))),format.raw/*61.83*/("""
		
		"""),_display_(Seq[Any](/*63.4*/inputText(field=studentForm("placeOfBirth"), args='_label->"Place Of Birth"))),format.raw/*63.80*/(""" 
    	"""),_display_(Seq[Any](/*64.7*/inputText(field=studentForm("maritalStatus"), args='_label->"Marital Status"))),format.raw/*64.84*/("""  
    	"""),_display_(Seq[Any](/*65.7*/inputText(field=studentForm("citizen"), args='_label->"Citizen"))),format.raw/*65.71*/("""
    	"""),_display_(Seq[Any](/*66.7*/textarea(field=studentForm("presentAddress"), 'rows -> 3, 'cols -> 50, '_label->"Present Address"))),format.raw/*66.105*/("""
	  
	    """),format.raw/*68.98*/("""
	   """),format.raw/*77.8*/("""
		    <select name="division" id="division">
			     <option value="" class="blank">-- Choose a Division --</option>
			     """),_display_(Seq[Any](/*80.10*/for((id, name) <- Division.getDivisionsAsMap) yield /*80.55*/{_display_(Seq[Any](format.raw/*80.56*/("""
			       <option value=""""),_display_(Seq[Any](/*81.27*/id)),format.raw/*81.29*/("""">"""),_display_(Seq[Any](/*81.32*/name)),format.raw/*81.36*/("""</option>
			     """)))})),format.raw/*82.10*/("""
   			</select>
		    
		     
	    """),format.raw/*86.97*/("""
	   """),format.raw/*94.8*/("""
		 <select name="district" id="district">
			     <option value="" class="blank">-- Choose a District --</option>
			  """),format.raw/*99.19*/("""
   			</select>
		    
	    """),_display_(Seq[Any](/*102.7*/textarea(field=studentForm("permanentAddress"), 'rows -> 3, 'cols -> 50, '_label->"Permanent Address"))),format.raw/*102.109*/("""
	   
		"""),_display_(Seq[Any](/*104.4*/inputText(field=studentForm("mobile"), args='_label->"Mobile"))),format.raw/*104.66*/("""
	    """),_display_(Seq[Any](/*105.7*/inputText(field=studentForm("email"), args='_label->"Email"))),format.raw/*105.67*/("""
       
       <!--other fields-->
             
              <input type="submit" value="Create">
              
              <script>
$('#division').on('change', function() """),format.raw/*112.40*/("""{"""),format.raw/*112.41*/("""
var idToGet = this.value;
jsRoute.controllers.DistrictFunctions.getDistByDiv(idToGet).ajax("""),format.raw/*114.66*/("""{"""),format.raw/*114.67*/("""
		success: function(data) 
			"""),format.raw/*116.4*/("""{"""),format.raw/*116.5*/("""
		            //alert(data[0]);
		            
							var result = $.parseJSON(data);
							
							
							var select = document.getElementById("district"); 
							
							$("#district").empty();
							var el = document.createElement("option");
				    		el.textContent = "--Choose a District--";
				    		el.value = "";
				    		select.appendChild(el);
				    
							$.each(result, function(k, v) """),format.raw/*130.38*/("""{"""),format.raw/*130.39*/("""
							  	var el = document.createElement("option");
						    	el.textContent = v;
						    	el.value = k;
						    	select.appendChild(el);
							 """),format.raw/*135.9*/("""}"""),format.raw/*135.10*/(""");
		            
			"""),format.raw/*137.4*/("""}"""),format.raw/*137.5*/("""
		"""),format.raw/*138.3*/("""}"""),format.raw/*138.4*/(""");
					   /*  $.ajax("""),format.raw/*139.20*/("""{"""),format.raw/*139.21*/("""
					        type : 'GET',
					        url : '"""),_display_(Seq[Any](/*141.22*/routes/*141.28*/.DistrictFunctions.getDistByDiv(2))),format.raw/*141.62*/("""',
					        data : """),format.raw/*142.21*/("""{"""),format.raw/*142.22*/("""
					            id: idToGet
					        """),format.raw/*144.14*/("""}"""),format.raw/*144.15*/(""",
					        success : function(data) """),format.raw/*145.39*/("""{"""),format.raw/*145.40*/("""
					            alert("SHAON"+data);
					        """),format.raw/*147.14*/("""}"""),format.raw/*147.15*/("""
					    """),format.raw/*148.10*/("""}"""),format.raw/*148.11*/("""); */
	return false;
	  					
		"""),format.raw/*151.3*/("""}"""),format.raw/*151.4*/(""");
              
              </script>
   """)))})),format.raw/*154.5*/("""
                       
""")))})),format.raw/*156.2*/("""

"""))}
    }
    
    def render(studentForm:Form[dummymodels.DummyStudent]): play.api.templates.Html = apply(studentForm)
    
    def f:((Form[dummymodels.DummyStudent]) => play.api.templates.Html) = (studentForm) => apply(studentForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:28:06 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/student/create.scala.html
                    HASH: 31abe60239f8078caa8f10be81e9ec22f54873f2
                    MATRIX: 756->1|1165->46|1193->335|1230->337|1260->358|1300->360|1378->402|1393->408|1452->445|1507->465|1553->502|1593->504|1664->539|1759->612|1837->654|2041->837|2091->852|2275->1015|2325->1030|2520->1204|2580->1229|2794->1422|3022->1614|3115->1685|3170->1704|3265->1777|3320->1796|3415->1869|3457->1876|3555->1952|3598->1960|3697->2037|3741->2046|3827->2110|3869->2117|3990->2215|4028->2317|4060->2573|4223->2700|4284->2745|4323->2746|4386->2773|4410->2775|4449->2778|4475->2782|4526->2801|4591->2929|4623->3149|4771->3392|4837->3422|4963->3524|5008->3533|5093->3595|5136->3602|5219->3662|5426->3840|5456->3841|5577->3933|5607->3934|5666->3965|5695->3966|6131->4373|6161->4374|6342->4527|6372->4528|6421->4549|6450->4550|6481->4553|6510->4554|6561->4576|6591->4577|6677->4626|6693->4632|6750->4666|6802->4689|6832->4690|6904->4733|6934->4734|7003->4774|7033->4775|7114->4827|7144->4828|7183->4838|7213->4839|7273->4871|7302->4872|7380->4918|7438->4944
                    LINES: 26->1|46->1|47->11|48->12|48->12|48->12|50->14|50->14|50->14|51->15|51->15|51->15|54->18|54->18|57->21|62->26|64->28|69->33|71->35|76->40|79->43|84->48|93->57|93->57|95->59|95->59|97->61|97->61|99->63|99->63|100->64|100->64|101->65|101->65|102->66|102->66|104->68|105->77|108->80|108->80|108->80|109->81|109->81|109->81|109->81|110->82|114->86|115->94|118->99|121->102|121->102|123->104|123->104|124->105|124->105|131->112|131->112|133->114|133->114|135->116|135->116|149->130|149->130|154->135|154->135|156->137|156->137|157->138|157->138|158->139|158->139|160->141|160->141|160->141|161->142|161->142|163->144|163->144|164->145|164->145|166->147|166->147|167->148|167->148|170->151|170->151|173->154|175->156
                    -- GENERATED --
                */
            