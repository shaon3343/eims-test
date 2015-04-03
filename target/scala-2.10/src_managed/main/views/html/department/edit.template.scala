
package views.html.department

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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.admission.Department],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(deptForm: Form[models.admission.Department]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Edit Department")/*4.25*/{_display_(Seq[Any](format.raw/*4.26*/("""
  <h2>Update the Department having ID """),_display_(Seq[Any](/*5.40*/deptForm/*5.48*/.get.id)),format.raw/*5.55*/("""</h2><br/><br/>
  
  """),_display_(Seq[Any](/*7.4*/form(routes.DepartmentManagement.update())/*7.46*/ {_display_(Seq[Any](format.raw/*7.48*/("""
  	  <input type="hidden" name="id" value="""),_display_(Seq[Any](/*8.44*/deptForm/*8.52*/.get.id)),format.raw/*8.59*/(""" >
  	  
      """),_display_(Seq[Any](/*10.8*/inputText(deptForm("name"), '_label->"Department Name"))),format.raw/*10.63*/("""</tr>
	  <input type="submit" value="Update">
  """)))})),format.raw/*12.4*/("""
""")))})))}
    }
    
    def render(deptForm:Form[models.admission.Department]): play.api.templates.Html = apply(deptForm)
    
    def f:((Form[models.admission.Department]) => play.api.templates.Html) = (deptForm) => apply(deptForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 04 02:02:43 BDT 2015
                    SOURCE: /home/shaon/workspace/EIMS/app/views/department/edit.scala.html
                    HASH: 9c916c8ecf2c0a49d97cdbc4700748ac171ce8b7
                    MATRIX: 760->1|898->46|925->64|961->66|992->89|1030->90|1105->130|1121->138|1149->145|1205->167|1255->209|1294->211|1373->255|1389->263|1417->270|1468->286|1545->341|1625->390
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|40->12
                    -- GENERATED --
                */
            