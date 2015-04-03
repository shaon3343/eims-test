// @SOURCE:/home/shaon/workspace/EIMS/conf/routes
// @HASH:acb112f2676bff8b90364b081a6febc1b3d69ea4
// @DATE:Sat Apr 04 02:02:40 BDT 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:12
private[this] lazy val controllers_UniversityManagement_create2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("university/create"))))
        

// @LINE:13
private[this] lazy val controllers_UniversityManagement_save3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("university/create"))))
        

// @LINE:14
private[this] lazy val controllers_UniversityManagement_list4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("university/list"))))
        

// @LINE:15
private[this] lazy val controllers_UniversityManagement_show5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("university/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:16
private[this] lazy val controllers_UniversityManagement_edit6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("university/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_UniversityManagement_update7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("university/edit"))))
        

// @LINE:18
private[this] lazy val controllers_UniversityManagement_delete8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("university/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:21
private[this] lazy val controllers_FacultyManagement_create9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("faculty/create"))))
        

// @LINE:22
private[this] lazy val controllers_FacultyManagement_save10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("faculty/create"))))
        

// @LINE:23
private[this] lazy val controllers_FacultyManagement_list11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("faculty/list"))))
        

// @LINE:24
private[this] lazy val controllers_FacultyManagement_show12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("faculty/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:25
private[this] lazy val controllers_FacultyManagement_edit13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("faculty/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_FacultyManagement_update14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("faculty/edit"))))
        

// @LINE:27
private[this] lazy val controllers_FacultyManagement_delete15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("faculty/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:31
private[this] lazy val controllers_DepartmentManagement_create16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("department/create"))))
        

// @LINE:32
private[this] lazy val controllers_DepartmentManagement_save17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("department/create"))))
        

// @LINE:33
private[this] lazy val controllers_DepartmentManagement_list18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("department/list"))))
        

// @LINE:34
private[this] lazy val controllers_DepartmentManagement_show19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("department/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:35
private[this] lazy val controllers_DepartmentManagement_edit20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("department/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:36
private[this] lazy val controllers_DepartmentManagement_update21 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("department/edit"))))
        

// @LINE:37
private[this] lazy val controllers_DepartmentManagement_delete22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("department/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:41
private[this] lazy val controllers_DegreeManagement_create23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("degree/create"))))
        

// @LINE:42
private[this] lazy val controllers_DegreeManagement_save24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("degree/create"))))
        

// @LINE:43
private[this] lazy val controllers_DegreeManagement_list25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("degree/list"))))
        

// @LINE:44
private[this] lazy val controllers_DegreeManagement_show26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("degree/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:45
private[this] lazy val controllers_DegreeManagement_edit27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("degree/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:46
private[this] lazy val controllers_DegreeManagement_update28 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("degree/edit"))))
        

// @LINE:47
private[this] lazy val controllers_DegreeManagement_delete29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("degree/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:50
private[this] lazy val controllers_ClassYearManagement_create30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("class-or-year/create"))))
        

// @LINE:51
private[this] lazy val controllers_ClassYearManagement_save31 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("class-or-year/create"))))
        

// @LINE:52
private[this] lazy val controllers_ClassYearManagement_list32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("class-or-year/list"))))
        

// @LINE:53
private[this] lazy val controllers_ClassYearManagement_show33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("class-or-year/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:54
private[this] lazy val controllers_ClassYearManagement_edit34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("class-or-year/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:55
private[this] lazy val controllers_ClassYearManagement_update35 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("class-or-year/edit"))))
        

// @LINE:56
private[this] lazy val controllers_ClassYearManagement_delete36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("class-or-year/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:59
private[this] lazy val controllers_SectionSemesterManagement_create37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("section-or-semester/create"))))
        

// @LINE:60
private[this] lazy val controllers_SectionSemesterManagement_save38 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("section-or-semester/create"))))
        

// @LINE:61
private[this] lazy val controllers_SectionSemesterManagement_list39 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("section-or-semester/list"))))
        

// @LINE:62
private[this] lazy val controllers_SectionSemesterManagement_show40 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("section-or-semester/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:63
private[this] lazy val controllers_SectionSemesterManagement_edit41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("section-or-semester/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:64
private[this] lazy val controllers_SectionSemesterManagement_update42 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("section-or-semester/edit"))))
        

// @LINE:65
private[this] lazy val controllers_SectionSemesterManagement_delete43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("section-or-semester/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:69
private[this] lazy val controllers_EmployeeManagement_create44 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/create"))))
        

// @LINE:70
private[this] lazy val controllers_EmployeeManagement_save45 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/create"))))
        

// @LINE:71
private[this] lazy val controllers_EmployeeManagement_list46 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/list"))))
        

// @LINE:72
private[this] lazy val controllers_EmployeeManagement_show47 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:73
private[this] lazy val controllers_EmployeeManagement_edit48 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:74
private[this] lazy val controllers_EmployeeManagement_update49 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/edit"))))
        

// @LINE:75
private[this] lazy val controllers_EmployeeManagement_delete50 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:78
private[this] lazy val controllers_CategoryManagement_create51 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("category/create"))))
        

// @LINE:79
private[this] lazy val controllers_CategoryManagement_save52 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("category/create"))))
        

// @LINE:80
private[this] lazy val controllers_CategoryManagement_list53 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("category/list"))))
        

// @LINE:81
private[this] lazy val controllers_CategoryManagement_show54 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("category/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:82
private[this] lazy val controllers_CategoryManagement_edit55 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("category/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:83
private[this] lazy val controllers_CategoryManagement_update56 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("category/edit"))))
        

// @LINE:84
private[this] lazy val controllers_CategoryManagement_delete57 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("category/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:89
private[this] lazy val controllers_TeacherManagement_list58 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher/list"))))
        

// @LINE:90
private[this] lazy val controllers_TeacherManagement_show59 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:91
private[this] lazy val controllers_TeacherManagement_edit60 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:92
private[this] lazy val controllers_TeacherManagement_update61 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher/edit"))))
        

// @LINE:93
private[this] lazy val controllers_TeacherManagement_delete62 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:96
private[this] lazy val controllers_TQManagement_list63 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher-qualifications/list"))))
        

// @LINE:97
private[this] lazy val controllers_TQManagement_show64 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher-qualifications/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:98
private[this] lazy val controllers_TQManagement_edit65 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher-qualifications/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:99
private[this] lazy val controllers_TQManagement_update66 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher-qualifications/edit"))))
        

// @LINE:100
private[this] lazy val controllers_TQManagement_delete67 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher-qualifications/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:103
private[this] lazy val controllers_DesignationManagement_create68 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("designation/create"))))
        

// @LINE:104
private[this] lazy val controllers_DesignationManagement_save69 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("designation/create"))))
        

// @LINE:105
private[this] lazy val controllers_DesignationManagement_list70 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("designation/list"))))
        

// @LINE:106
private[this] lazy val controllers_DesignationManagement_show71 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("designation/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:107
private[this] lazy val controllers_DesignationManagement_edit72 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("designation/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:108
private[this] lazy val controllers_DesignationManagement_update73 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("designation/edit"))))
        

// @LINE:109
private[this] lazy val controllers_DesignationManagement_delete74 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("designation/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:114
private[this] lazy val controllers_CourseManagement_create75 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/create"))))
        

// @LINE:115
private[this] lazy val controllers_CourseManagement_save76 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/create"))))
        

// @LINE:116
private[this] lazy val controllers_CourseManagement_list77 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/list"))))
        

// @LINE:117
private[this] lazy val controllers_CourseManagement_show78 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:118
private[this] lazy val controllers_CourseManagement_edit79 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:119
private[this] lazy val controllers_CourseManagement_update80 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/edit"))))
        

// @LINE:120
private[this] lazy val controllers_CourseManagement_delete81 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("course/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:124
private[this] lazy val controllers_TeacherCourseManagement_createWithTeacher82 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher-course/create-with-teacher"))))
        

// @LINE:125
private[this] lazy val controllers_TeacherCourseManagement_create83 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher-course/create"))))
        

// @LINE:126
private[this] lazy val controllers_TeacherCourseManagement_insert84 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher-course/create"))))
        

// @LINE:127
private[this] lazy val controllers_TeacherCourseManagement_list85 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher-course/list"))))
        

// @LINE:128
private[this] lazy val controllers_TeacherCourseManagement_show86 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher-course/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:129
private[this] lazy val controllers_TeacherCourseManagement_edit87 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher-course/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:130
private[this] lazy val controllers_TeacherCourseManagement_update88 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("teacher-course/edit"))))
        

// @LINE:134
private[this] lazy val controllers_StudentManagement_create89 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student/create"))))
        

// @LINE:135
private[this] lazy val controllers_StudentManagement_save90 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student/create"))))
        

// @LINE:136
private[this] lazy val controllers_StudentManagement_list91 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student/list"))))
        

// @LINE:137
private[this] lazy val controllers_StudentManagement_show92 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:138
private[this] lazy val controllers_StudentManagement_edit93 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:139
private[this] lazy val controllers_StudentManagement_update94 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student/edit"))))
        

// @LINE:140
private[this] lazy val controllers_StudentManagement_delete95 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:144
private[this] lazy val controllers_ParentManagement_list96 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parent/list"))))
        

// @LINE:145
private[this] lazy val controllers_ParentManagement_show97 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parent/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:146
private[this] lazy val controllers_ParentManagement_edit98 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parent/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:147
private[this] lazy val controllers_ParentManagement_update99 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parent/edit"))))
        

// @LINE:148
private[this] lazy val controllers_ParentManagement_delete100 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("parent/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:151
private[this] lazy val controllers_StudentCourseManagement_createWithStudent101 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student-course/create-with-student"))))
        

// @LINE:152
private[this] lazy val controllers_StudentCourseManagement_create102 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student-course/create"))))
        

// @LINE:153
private[this] lazy val controllers_StudentCourseManagement_insert103 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student-course/create"))))
        

// @LINE:154
private[this] lazy val controllers_StudentCourseManagement_list104 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student-course/list"))))
        

// @LINE:155
private[this] lazy val controllers_StudentCourseManagement_show105 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student-course/show/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:156
private[this] lazy val controllers_StudentCourseManagement_edit106 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student-course/edit/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:157
private[this] lazy val controllers_StudentCourseManagement_update107 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("student-course/edit"))))
        

// @LINE:160
private[this] lazy val controllers_DistrictFunctions_getDistByDiv108 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("div/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:161
private[this] lazy val controllers_DistrictFunctions_javascriptRoutes109 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("javascriptRoutes"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """university/create""","""controllers.UniversityManagement.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """university/create""","""controllers.UniversityManagement.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """university/list""","""controllers.UniversityManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """university/show/$id<[^/]+>""","""controllers.UniversityManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """university/edit/$id<[^/]+>""","""controllers.UniversityManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """university/edit""","""controllers.UniversityManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """university/delete/$id<[^/]+>""","""controllers.UniversityManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """faculty/create""","""controllers.FacultyManagement.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """faculty/create""","""controllers.FacultyManagement.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """faculty/list""","""controllers.FacultyManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """faculty/show/$id<[^/]+>""","""controllers.FacultyManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """faculty/edit/$id<[^/]+>""","""controllers.FacultyManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """faculty/edit""","""controllers.FacultyManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """faculty/delete/$id<[^/]+>""","""controllers.FacultyManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """department/create""","""controllers.DepartmentManagement.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """department/create""","""controllers.DepartmentManagement.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """department/list""","""controllers.DepartmentManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """department/show/$id<[^/]+>""","""controllers.DepartmentManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """department/edit/$id<[^/]+>""","""controllers.DepartmentManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """department/edit""","""controllers.DepartmentManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """department/delete/$id<[^/]+>""","""controllers.DepartmentManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """degree/create""","""controllers.DegreeManagement.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """degree/create""","""controllers.DegreeManagement.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """degree/list""","""controllers.DegreeManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """degree/show/$id<[^/]+>""","""controllers.DegreeManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """degree/edit/$id<[^/]+>""","""controllers.DegreeManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """degree/edit""","""controllers.DegreeManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """degree/delete/$id<[^/]+>""","""controllers.DegreeManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """class-or-year/create""","""controllers.ClassYearManagement.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """class-or-year/create""","""controllers.ClassYearManagement.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """class-or-year/list""","""controllers.ClassYearManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """class-or-year/show/$id<[^/]+>""","""controllers.ClassYearManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """class-or-year/edit/$id<[^/]+>""","""controllers.ClassYearManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """class-or-year/edit""","""controllers.ClassYearManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """class-or-year/delete/$id<[^/]+>""","""controllers.ClassYearManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """section-or-semester/create""","""controllers.SectionSemesterManagement.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """section-or-semester/create""","""controllers.SectionSemesterManagement.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """section-or-semester/list""","""controllers.SectionSemesterManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """section-or-semester/show/$id<[^/]+>""","""controllers.SectionSemesterManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """section-or-semester/edit/$id<[^/]+>""","""controllers.SectionSemesterManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """section-or-semester/edit""","""controllers.SectionSemesterManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """section-or-semester/delete/$id<[^/]+>""","""controllers.SectionSemesterManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/create""","""controllers.EmployeeManagement.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/create""","""controllers.EmployeeManagement.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/list""","""controllers.EmployeeManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/show/$id<[^/]+>""","""controllers.EmployeeManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/edit/$id<[^/]+>""","""controllers.EmployeeManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/edit""","""controllers.EmployeeManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/delete/$id<[^/]+>""","""controllers.EmployeeManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """category/create""","""controllers.CategoryManagement.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """category/create""","""controllers.CategoryManagement.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """category/list""","""controllers.CategoryManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """category/show/$id<[^/]+>""","""controllers.CategoryManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """category/edit/$id<[^/]+>""","""controllers.CategoryManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """category/edit""","""controllers.CategoryManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """category/delete/$id<[^/]+>""","""controllers.CategoryManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher/list""","""controllers.TeacherManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher/show/$id<[^/]+>""","""controllers.TeacherManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher/edit/$id<[^/]+>""","""controllers.TeacherManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher/edit""","""controllers.TeacherManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher/delete/$id<[^/]+>""","""controllers.TeacherManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher-qualifications/list""","""controllers.TQManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher-qualifications/show/$id<[^/]+>""","""controllers.TQManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher-qualifications/edit/$id<[^/]+>""","""controllers.TQManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher-qualifications/edit""","""controllers.TQManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher-qualifications/delete/$id<[^/]+>""","""controllers.TQManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """designation/create""","""controllers.DesignationManagement.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """designation/create""","""controllers.DesignationManagement.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """designation/list""","""controllers.DesignationManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """designation/show/$id<[^/]+>""","""controllers.DesignationManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """designation/edit/$id<[^/]+>""","""controllers.DesignationManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """designation/edit""","""controllers.DesignationManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """designation/delete/$id<[^/]+>""","""controllers.DesignationManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/create""","""controllers.CourseManagement.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/create""","""controllers.CourseManagement.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/list""","""controllers.CourseManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/show/$id<[^/]+>""","""controllers.CourseManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/edit/$id<[^/]+>""","""controllers.CourseManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/edit""","""controllers.CourseManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """course/delete/$id<[^/]+>""","""controllers.CourseManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher-course/create-with-teacher""","""controllers.TeacherCourseManagement.createWithTeacher(teacherId:String ?= "1")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher-course/create""","""controllers.TeacherCourseManagement.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher-course/create""","""controllers.TeacherCourseManagement.insert()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher-course/list""","""controllers.TeacherCourseManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher-course/show/$id<[^/]+>""","""controllers.TeacherCourseManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher-course/edit/$id<[^/]+>""","""controllers.TeacherCourseManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """teacher-course/edit""","""controllers.TeacherCourseManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student/create""","""controllers.StudentManagement.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student/create""","""controllers.StudentManagement.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student/list""","""controllers.StudentManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student/show/$id<[^/]+>""","""controllers.StudentManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student/edit/$id<[^/]+>""","""controllers.StudentManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student/edit""","""controllers.StudentManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student/delete/$id<[^/]+>""","""controllers.StudentManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parent/list""","""controllers.ParentManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parent/show/$id<[^/]+>""","""controllers.ParentManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parent/edit/$id<[^/]+>""","""controllers.ParentManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parent/edit""","""controllers.ParentManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """parent/delete/$id<[^/]+>""","""controllers.ParentManagement.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student-course/create-with-student""","""controllers.StudentCourseManagement.createWithStudent(studentId:String ?= "1")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student-course/create""","""controllers.StudentCourseManagement.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student-course/create""","""controllers.StudentCourseManagement.insert()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student-course/list""","""controllers.StudentCourseManagement.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student-course/show/$id<[^/]+>""","""controllers.StudentCourseManagement.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student-course/edit/$id<[^/]+>""","""controllers.StudentCourseManagement.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """student-course/edit""","""controllers.StudentCourseManagement.update()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """div/$id<[^/]+>""","""controllers.DistrictFunctions.getDistByDiv(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """javascriptRoutes""","""controllers.DistrictFunctions.javascriptRoutes""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:12
case controllers_UniversityManagement_create2(params) => {
   call { 
        invokeHandler(controllers.UniversityManagement.create(), HandlerDef(this, "controllers.UniversityManagement", "create", Nil,"GET", """University""", Routes.prefix + """university/create"""))
   }
}
        

// @LINE:13
case controllers_UniversityManagement_save3(params) => {
   call { 
        invokeHandler(controllers.UniversityManagement.save(), HandlerDef(this, "controllers.UniversityManagement", "save", Nil,"POST", """""", Routes.prefix + """university/create"""))
   }
}
        

// @LINE:14
case controllers_UniversityManagement_list4(params) => {
   call { 
        invokeHandler(controllers.UniversityManagement.list(), HandlerDef(this, "controllers.UniversityManagement", "list", Nil,"GET", """""", Routes.prefix + """university/list"""))
   }
}
        

// @LINE:15
case controllers_UniversityManagement_show5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UniversityManagement.show(id), HandlerDef(this, "controllers.UniversityManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """university/show/$id<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_UniversityManagement_edit6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UniversityManagement.edit(id), HandlerDef(this, "controllers.UniversityManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """university/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_UniversityManagement_update7(params) => {
   call { 
        invokeHandler(controllers.UniversityManagement.update(), HandlerDef(this, "controllers.UniversityManagement", "update", Nil,"POST", """""", Routes.prefix + """university/edit"""))
   }
}
        

// @LINE:18
case controllers_UniversityManagement_delete8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.UniversityManagement.delete(id), HandlerDef(this, "controllers.UniversityManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """university/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:21
case controllers_FacultyManagement_create9(params) => {
   call { 
        invokeHandler(controllers.FacultyManagement.create(), HandlerDef(this, "controllers.FacultyManagement", "create", Nil,"GET", """Faculty""", Routes.prefix + """faculty/create"""))
   }
}
        

// @LINE:22
case controllers_FacultyManagement_save10(params) => {
   call { 
        invokeHandler(controllers.FacultyManagement.save(), HandlerDef(this, "controllers.FacultyManagement", "save", Nil,"POST", """""", Routes.prefix + """faculty/create"""))
   }
}
        

// @LINE:23
case controllers_FacultyManagement_list11(params) => {
   call { 
        invokeHandler(controllers.FacultyManagement.list(), HandlerDef(this, "controllers.FacultyManagement", "list", Nil,"GET", """""", Routes.prefix + """faculty/list"""))
   }
}
        

// @LINE:24
case controllers_FacultyManagement_show12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.FacultyManagement.show(id), HandlerDef(this, "controllers.FacultyManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """faculty/show/$id<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_FacultyManagement_edit13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.FacultyManagement.edit(id), HandlerDef(this, "controllers.FacultyManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """faculty/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_FacultyManagement_update14(params) => {
   call { 
        invokeHandler(controllers.FacultyManagement.update(), HandlerDef(this, "controllers.FacultyManagement", "update", Nil,"POST", """""", Routes.prefix + """faculty/edit"""))
   }
}
        

// @LINE:27
case controllers_FacultyManagement_delete15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.FacultyManagement.delete(id), HandlerDef(this, "controllers.FacultyManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """faculty/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:31
case controllers_DepartmentManagement_create16(params) => {
   call { 
        invokeHandler(controllers.DepartmentManagement.create(), HandlerDef(this, "controllers.DepartmentManagement", "create", Nil,"GET", """Department""", Routes.prefix + """department/create"""))
   }
}
        

// @LINE:32
case controllers_DepartmentManagement_save17(params) => {
   call { 
        invokeHandler(controllers.DepartmentManagement.save(), HandlerDef(this, "controllers.DepartmentManagement", "save", Nil,"POST", """""", Routes.prefix + """department/create"""))
   }
}
        

// @LINE:33
case controllers_DepartmentManagement_list18(params) => {
   call { 
        invokeHandler(controllers.DepartmentManagement.list(), HandlerDef(this, "controllers.DepartmentManagement", "list", Nil,"GET", """""", Routes.prefix + """department/list"""))
   }
}
        

// @LINE:34
case controllers_DepartmentManagement_show19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DepartmentManagement.show(id), HandlerDef(this, "controllers.DepartmentManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """department/show/$id<[^/]+>"""))
   }
}
        

// @LINE:35
case controllers_DepartmentManagement_edit20(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DepartmentManagement.edit(id), HandlerDef(this, "controllers.DepartmentManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """department/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:36
case controllers_DepartmentManagement_update21(params) => {
   call { 
        invokeHandler(controllers.DepartmentManagement.update(), HandlerDef(this, "controllers.DepartmentManagement", "update", Nil,"POST", """""", Routes.prefix + """department/edit"""))
   }
}
        

// @LINE:37
case controllers_DepartmentManagement_delete22(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DepartmentManagement.delete(id), HandlerDef(this, "controllers.DepartmentManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """department/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:41
case controllers_DegreeManagement_create23(params) => {
   call { 
        invokeHandler(controllers.DegreeManagement.create(), HandlerDef(this, "controllers.DegreeManagement", "create", Nil,"GET", """Degree""", Routes.prefix + """degree/create"""))
   }
}
        

// @LINE:42
case controllers_DegreeManagement_save24(params) => {
   call { 
        invokeHandler(controllers.DegreeManagement.save(), HandlerDef(this, "controllers.DegreeManagement", "save", Nil,"POST", """""", Routes.prefix + """degree/create"""))
   }
}
        

// @LINE:43
case controllers_DegreeManagement_list25(params) => {
   call { 
        invokeHandler(controllers.DegreeManagement.list(), HandlerDef(this, "controllers.DegreeManagement", "list", Nil,"GET", """""", Routes.prefix + """degree/list"""))
   }
}
        

// @LINE:44
case controllers_DegreeManagement_show26(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DegreeManagement.show(id), HandlerDef(this, "controllers.DegreeManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """degree/show/$id<[^/]+>"""))
   }
}
        

// @LINE:45
case controllers_DegreeManagement_edit27(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DegreeManagement.edit(id), HandlerDef(this, "controllers.DegreeManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """degree/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:46
case controllers_DegreeManagement_update28(params) => {
   call { 
        invokeHandler(controllers.DegreeManagement.update(), HandlerDef(this, "controllers.DegreeManagement", "update", Nil,"POST", """""", Routes.prefix + """degree/edit"""))
   }
}
        

// @LINE:47
case controllers_DegreeManagement_delete29(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DegreeManagement.delete(id), HandlerDef(this, "controllers.DegreeManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """degree/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:50
case controllers_ClassYearManagement_create30(params) => {
   call { 
        invokeHandler(controllers.ClassYearManagement.create(), HandlerDef(this, "controllers.ClassYearManagement", "create", Nil,"GET", """Class or Year""", Routes.prefix + """class-or-year/create"""))
   }
}
        

// @LINE:51
case controllers_ClassYearManagement_save31(params) => {
   call { 
        invokeHandler(controllers.ClassYearManagement.save(), HandlerDef(this, "controllers.ClassYearManagement", "save", Nil,"POST", """""", Routes.prefix + """class-or-year/create"""))
   }
}
        

// @LINE:52
case controllers_ClassYearManagement_list32(params) => {
   call { 
        invokeHandler(controllers.ClassYearManagement.list(), HandlerDef(this, "controllers.ClassYearManagement", "list", Nil,"GET", """""", Routes.prefix + """class-or-year/list"""))
   }
}
        

// @LINE:53
case controllers_ClassYearManagement_show33(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ClassYearManagement.show(id), HandlerDef(this, "controllers.ClassYearManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """class-or-year/show/$id<[^/]+>"""))
   }
}
        

// @LINE:54
case controllers_ClassYearManagement_edit34(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ClassYearManagement.edit(id), HandlerDef(this, "controllers.ClassYearManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """class-or-year/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:55
case controllers_ClassYearManagement_update35(params) => {
   call { 
        invokeHandler(controllers.ClassYearManagement.update(), HandlerDef(this, "controllers.ClassYearManagement", "update", Nil,"POST", """""", Routes.prefix + """class-or-year/edit"""))
   }
}
        

// @LINE:56
case controllers_ClassYearManagement_delete36(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ClassYearManagement.delete(id), HandlerDef(this, "controllers.ClassYearManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """class-or-year/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:59
case controllers_SectionSemesterManagement_create37(params) => {
   call { 
        invokeHandler(controllers.SectionSemesterManagement.create(), HandlerDef(this, "controllers.SectionSemesterManagement", "create", Nil,"GET", """SectionSemester""", Routes.prefix + """section-or-semester/create"""))
   }
}
        

// @LINE:60
case controllers_SectionSemesterManagement_save38(params) => {
   call { 
        invokeHandler(controllers.SectionSemesterManagement.save(), HandlerDef(this, "controllers.SectionSemesterManagement", "save", Nil,"POST", """""", Routes.prefix + """section-or-semester/create"""))
   }
}
        

// @LINE:61
case controllers_SectionSemesterManagement_list39(params) => {
   call { 
        invokeHandler(controllers.SectionSemesterManagement.list(), HandlerDef(this, "controllers.SectionSemesterManagement", "list", Nil,"GET", """""", Routes.prefix + """section-or-semester/list"""))
   }
}
        

// @LINE:62
case controllers_SectionSemesterManagement_show40(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.SectionSemesterManagement.show(id), HandlerDef(this, "controllers.SectionSemesterManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """section-or-semester/show/$id<[^/]+>"""))
   }
}
        

// @LINE:63
case controllers_SectionSemesterManagement_edit41(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.SectionSemesterManagement.edit(id), HandlerDef(this, "controllers.SectionSemesterManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """section-or-semester/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:64
case controllers_SectionSemesterManagement_update42(params) => {
   call { 
        invokeHandler(controllers.SectionSemesterManagement.update(), HandlerDef(this, "controllers.SectionSemesterManagement", "update", Nil,"POST", """""", Routes.prefix + """section-or-semester/edit"""))
   }
}
        

// @LINE:65
case controllers_SectionSemesterManagement_delete43(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.SectionSemesterManagement.delete(id), HandlerDef(this, "controllers.SectionSemesterManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """section-or-semester/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:69
case controllers_EmployeeManagement_create44(params) => {
   call { 
        invokeHandler(controllers.EmployeeManagement.create(), HandlerDef(this, "controllers.EmployeeManagement", "create", Nil,"GET", """Employee""", Routes.prefix + """employee/create"""))
   }
}
        

// @LINE:70
case controllers_EmployeeManagement_save45(params) => {
   call { 
        invokeHandler(controllers.EmployeeManagement.save(), HandlerDef(this, "controllers.EmployeeManagement", "save", Nil,"POST", """""", Routes.prefix + """employee/create"""))
   }
}
        

// @LINE:71
case controllers_EmployeeManagement_list46(params) => {
   call { 
        invokeHandler(controllers.EmployeeManagement.list(), HandlerDef(this, "controllers.EmployeeManagement", "list", Nil,"GET", """""", Routes.prefix + """employee/list"""))
   }
}
        

// @LINE:72
case controllers_EmployeeManagement_show47(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.EmployeeManagement.show(id), HandlerDef(this, "controllers.EmployeeManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """employee/show/$id<[^/]+>"""))
   }
}
        

// @LINE:73
case controllers_EmployeeManagement_edit48(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.EmployeeManagement.edit(id), HandlerDef(this, "controllers.EmployeeManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """employee/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:74
case controllers_EmployeeManagement_update49(params) => {
   call { 
        invokeHandler(controllers.EmployeeManagement.update(), HandlerDef(this, "controllers.EmployeeManagement", "update", Nil,"POST", """""", Routes.prefix + """employee/edit"""))
   }
}
        

// @LINE:75
case controllers_EmployeeManagement_delete50(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.EmployeeManagement.delete(id), HandlerDef(this, "controllers.EmployeeManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """employee/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:78
case controllers_CategoryManagement_create51(params) => {
   call { 
        invokeHandler(controllers.CategoryManagement.create(), HandlerDef(this, "controllers.CategoryManagement", "create", Nil,"GET", """Category""", Routes.prefix + """category/create"""))
   }
}
        

// @LINE:79
case controllers_CategoryManagement_save52(params) => {
   call { 
        invokeHandler(controllers.CategoryManagement.save(), HandlerDef(this, "controllers.CategoryManagement", "save", Nil,"POST", """""", Routes.prefix + """category/create"""))
   }
}
        

// @LINE:80
case controllers_CategoryManagement_list53(params) => {
   call { 
        invokeHandler(controllers.CategoryManagement.list(), HandlerDef(this, "controllers.CategoryManagement", "list", Nil,"GET", """""", Routes.prefix + """category/list"""))
   }
}
        

// @LINE:81
case controllers_CategoryManagement_show54(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.CategoryManagement.show(id), HandlerDef(this, "controllers.CategoryManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """category/show/$id<[^/]+>"""))
   }
}
        

// @LINE:82
case controllers_CategoryManagement_edit55(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.CategoryManagement.edit(id), HandlerDef(this, "controllers.CategoryManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """category/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:83
case controllers_CategoryManagement_update56(params) => {
   call { 
        invokeHandler(controllers.CategoryManagement.update(), HandlerDef(this, "controllers.CategoryManagement", "update", Nil,"POST", """""", Routes.prefix + """category/edit"""))
   }
}
        

// @LINE:84
case controllers_CategoryManagement_delete57(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.CategoryManagement.delete(id), HandlerDef(this, "controllers.CategoryManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """category/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:89
case controllers_TeacherManagement_list58(params) => {
   call { 
        invokeHandler(controllers.TeacherManagement.list(), HandlerDef(this, "controllers.TeacherManagement", "list", Nil,"GET", """Teacher
GET		/teacher/create						     controllers.TeacherManagement.create()
POST	/teacher/create						     controllers.TeacherManagement.save()""", Routes.prefix + """teacher/list"""))
   }
}
        

// @LINE:90
case controllers_TeacherManagement_show59(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.TeacherManagement.show(id), HandlerDef(this, "controllers.TeacherManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """teacher/show/$id<[^/]+>"""))
   }
}
        

// @LINE:91
case controllers_TeacherManagement_edit60(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.TeacherManagement.edit(id), HandlerDef(this, "controllers.TeacherManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """teacher/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:92
case controllers_TeacherManagement_update61(params) => {
   call { 
        invokeHandler(controllers.TeacherManagement.update(), HandlerDef(this, "controllers.TeacherManagement", "update", Nil,"POST", """""", Routes.prefix + """teacher/edit"""))
   }
}
        

// @LINE:93
case controllers_TeacherManagement_delete62(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.TeacherManagement.delete(id), HandlerDef(this, "controllers.TeacherManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """teacher/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:96
case controllers_TQManagement_list63(params) => {
   call { 
        invokeHandler(controllers.TQManagement.list(), HandlerDef(this, "controllers.TQManagement", "list", Nil,"GET", """Teacher Qualifications""", Routes.prefix + """teacher-qualifications/list"""))
   }
}
        

// @LINE:97
case controllers_TQManagement_show64(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.TQManagement.show(id), HandlerDef(this, "controllers.TQManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """teacher-qualifications/show/$id<[^/]+>"""))
   }
}
        

// @LINE:98
case controllers_TQManagement_edit65(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.TQManagement.edit(id), HandlerDef(this, "controllers.TQManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """teacher-qualifications/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:99
case controllers_TQManagement_update66(params) => {
   call { 
        invokeHandler(controllers.TQManagement.update(), HandlerDef(this, "controllers.TQManagement", "update", Nil,"POST", """""", Routes.prefix + """teacher-qualifications/edit"""))
   }
}
        

// @LINE:100
case controllers_TQManagement_delete67(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.TQManagement.delete(id), HandlerDef(this, "controllers.TQManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """teacher-qualifications/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:103
case controllers_DesignationManagement_create68(params) => {
   call { 
        invokeHandler(controllers.DesignationManagement.create(), HandlerDef(this, "controllers.DesignationManagement", "create", Nil,"GET", """Designation""", Routes.prefix + """designation/create"""))
   }
}
        

// @LINE:104
case controllers_DesignationManagement_save69(params) => {
   call { 
        invokeHandler(controllers.DesignationManagement.save(), HandlerDef(this, "controllers.DesignationManagement", "save", Nil,"POST", """""", Routes.prefix + """designation/create"""))
   }
}
        

// @LINE:105
case controllers_DesignationManagement_list70(params) => {
   call { 
        invokeHandler(controllers.DesignationManagement.list(), HandlerDef(this, "controllers.DesignationManagement", "list", Nil,"GET", """""", Routes.prefix + """designation/list"""))
   }
}
        

// @LINE:106
case controllers_DesignationManagement_show71(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DesignationManagement.show(id), HandlerDef(this, "controllers.DesignationManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """designation/show/$id<[^/]+>"""))
   }
}
        

// @LINE:107
case controllers_DesignationManagement_edit72(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DesignationManagement.edit(id), HandlerDef(this, "controllers.DesignationManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """designation/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:108
case controllers_DesignationManagement_update73(params) => {
   call { 
        invokeHandler(controllers.DesignationManagement.update(), HandlerDef(this, "controllers.DesignationManagement", "update", Nil,"POST", """""", Routes.prefix + """designation/edit"""))
   }
}
        

// @LINE:109
case controllers_DesignationManagement_delete74(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DesignationManagement.delete(id), HandlerDef(this, "controllers.DesignationManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """designation/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:114
case controllers_CourseManagement_create75(params) => {
   call { 
        invokeHandler(controllers.CourseManagement.create(), HandlerDef(this, "controllers.CourseManagement", "create", Nil,"GET", """Course""", Routes.prefix + """course/create"""))
   }
}
        

// @LINE:115
case controllers_CourseManagement_save76(params) => {
   call { 
        invokeHandler(controllers.CourseManagement.save(), HandlerDef(this, "controllers.CourseManagement", "save", Nil,"POST", """""", Routes.prefix + """course/create"""))
   }
}
        

// @LINE:116
case controllers_CourseManagement_list77(params) => {
   call { 
        invokeHandler(controllers.CourseManagement.list(), HandlerDef(this, "controllers.CourseManagement", "list", Nil,"GET", """""", Routes.prefix + """course/list"""))
   }
}
        

// @LINE:117
case controllers_CourseManagement_show78(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.CourseManagement.show(id), HandlerDef(this, "controllers.CourseManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/show/$id<[^/]+>"""))
   }
}
        

// @LINE:118
case controllers_CourseManagement_edit79(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.CourseManagement.edit(id), HandlerDef(this, "controllers.CourseManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:119
case controllers_CourseManagement_update80(params) => {
   call { 
        invokeHandler(controllers.CourseManagement.update(), HandlerDef(this, "controllers.CourseManagement", "update", Nil,"POST", """""", Routes.prefix + """course/edit"""))
   }
}
        

// @LINE:120
case controllers_CourseManagement_delete81(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.CourseManagement.delete(id), HandlerDef(this, "controllers.CourseManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """course/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:124
case controllers_TeacherCourseManagement_createWithTeacher82(params) => {
   call(params.fromQuery[String]("teacherId", Some("1"))) { (teacherId) =>
        invokeHandler(controllers.TeacherCourseManagement.createWithTeacher(teacherId), HandlerDef(this, "controllers.TeacherCourseManagement", "createWithTeacher", Seq(classOf[String]),"GET", """TeacherCourse , Assign Courses to a teacher""", Routes.prefix + """teacher-course/create-with-teacher"""))
   }
}
        

// @LINE:125
case controllers_TeacherCourseManagement_create83(params) => {
   call { 
        invokeHandler(controllers.TeacherCourseManagement.create(), HandlerDef(this, "controllers.TeacherCourseManagement", "create", Nil,"GET", """""", Routes.prefix + """teacher-course/create"""))
   }
}
        

// @LINE:126
case controllers_TeacherCourseManagement_insert84(params) => {
   call { 
        invokeHandler(controllers.TeacherCourseManagement.insert(), HandlerDef(this, "controllers.TeacherCourseManagement", "insert", Nil,"POST", """""", Routes.prefix + """teacher-course/create"""))
   }
}
        

// @LINE:127
case controllers_TeacherCourseManagement_list85(params) => {
   call { 
        invokeHandler(controllers.TeacherCourseManagement.list(), HandlerDef(this, "controllers.TeacherCourseManagement", "list", Nil,"GET", """""", Routes.prefix + """teacher-course/list"""))
   }
}
        

// @LINE:128
case controllers_TeacherCourseManagement_show86(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.TeacherCourseManagement.show(id), HandlerDef(this, "controllers.TeacherCourseManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """teacher-course/show/$id<[^/]+>"""))
   }
}
        

// @LINE:129
case controllers_TeacherCourseManagement_edit87(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.TeacherCourseManagement.edit(id), HandlerDef(this, "controllers.TeacherCourseManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """teacher-course/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:130
case controllers_TeacherCourseManagement_update88(params) => {
   call { 
        invokeHandler(controllers.TeacherCourseManagement.update(), HandlerDef(this, "controllers.TeacherCourseManagement", "update", Nil,"POST", """""", Routes.prefix + """teacher-course/edit"""))
   }
}
        

// @LINE:134
case controllers_StudentManagement_create89(params) => {
   call { 
        invokeHandler(controllers.StudentManagement.create(), HandlerDef(this, "controllers.StudentManagement", "create", Nil,"GET", """Student""", Routes.prefix + """student/create"""))
   }
}
        

// @LINE:135
case controllers_StudentManagement_save90(params) => {
   call { 
        invokeHandler(controllers.StudentManagement.save(), HandlerDef(this, "controllers.StudentManagement", "save", Nil,"POST", """""", Routes.prefix + """student/create"""))
   }
}
        

// @LINE:136
case controllers_StudentManagement_list91(params) => {
   call { 
        invokeHandler(controllers.StudentManagement.list(), HandlerDef(this, "controllers.StudentManagement", "list", Nil,"GET", """""", Routes.prefix + """student/list"""))
   }
}
        

// @LINE:137
case controllers_StudentManagement_show92(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.StudentManagement.show(id), HandlerDef(this, "controllers.StudentManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """student/show/$id<[^/]+>"""))
   }
}
        

// @LINE:138
case controllers_StudentManagement_edit93(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.StudentManagement.edit(id), HandlerDef(this, "controllers.StudentManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """student/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:139
case controllers_StudentManagement_update94(params) => {
   call { 
        invokeHandler(controllers.StudentManagement.update(), HandlerDef(this, "controllers.StudentManagement", "update", Nil,"POST", """""", Routes.prefix + """student/edit"""))
   }
}
        

// @LINE:140
case controllers_StudentManagement_delete95(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.StudentManagement.delete(id), HandlerDef(this, "controllers.StudentManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """student/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:144
case controllers_ParentManagement_list96(params) => {
   call { 
        invokeHandler(controllers.ParentManagement.list(), HandlerDef(this, "controllers.ParentManagement", "list", Nil,"GET", """Parent""", Routes.prefix + """parent/list"""))
   }
}
        

// @LINE:145
case controllers_ParentManagement_show97(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ParentManagement.show(id), HandlerDef(this, "controllers.ParentManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """parent/show/$id<[^/]+>"""))
   }
}
        

// @LINE:146
case controllers_ParentManagement_edit98(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ParentManagement.edit(id), HandlerDef(this, "controllers.ParentManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """parent/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:147
case controllers_ParentManagement_update99(params) => {
   call { 
        invokeHandler(controllers.ParentManagement.update(), HandlerDef(this, "controllers.ParentManagement", "update", Nil,"POST", """""", Routes.prefix + """parent/edit"""))
   }
}
        

// @LINE:148
case controllers_ParentManagement_delete100(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ParentManagement.delete(id), HandlerDef(this, "controllers.ParentManagement", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """parent/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:151
case controllers_StudentCourseManagement_createWithStudent101(params) => {
   call(params.fromQuery[String]("studentId", Some("1"))) { (studentId) =>
        invokeHandler(controllers.StudentCourseManagement.createWithStudent(studentId), HandlerDef(this, "controllers.StudentCourseManagement", "createWithStudent", Seq(classOf[String]),"GET", """StudentCourse , Assign Courses to a student""", Routes.prefix + """student-course/create-with-student"""))
   }
}
        

// @LINE:152
case controllers_StudentCourseManagement_create102(params) => {
   call { 
        invokeHandler(controllers.StudentCourseManagement.create(), HandlerDef(this, "controllers.StudentCourseManagement", "create", Nil,"GET", """""", Routes.prefix + """student-course/create"""))
   }
}
        

// @LINE:153
case controllers_StudentCourseManagement_insert103(params) => {
   call { 
        invokeHandler(controllers.StudentCourseManagement.insert(), HandlerDef(this, "controllers.StudentCourseManagement", "insert", Nil,"POST", """""", Routes.prefix + """student-course/create"""))
   }
}
        

// @LINE:154
case controllers_StudentCourseManagement_list104(params) => {
   call { 
        invokeHandler(controllers.StudentCourseManagement.list(), HandlerDef(this, "controllers.StudentCourseManagement", "list", Nil,"GET", """""", Routes.prefix + """student-course/list"""))
   }
}
        

// @LINE:155
case controllers_StudentCourseManagement_show105(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.StudentCourseManagement.show(id), HandlerDef(this, "controllers.StudentCourseManagement", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """student-course/show/$id<[^/]+>"""))
   }
}
        

// @LINE:156
case controllers_StudentCourseManagement_edit106(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.StudentCourseManagement.edit(id), HandlerDef(this, "controllers.StudentCourseManagement", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """student-course/edit/$id<[^/]+>"""))
   }
}
        

// @LINE:157
case controllers_StudentCourseManagement_update107(params) => {
   call { 
        invokeHandler(controllers.StudentCourseManagement.update(), HandlerDef(this, "controllers.StudentCourseManagement", "update", Nil,"POST", """""", Routes.prefix + """student-course/edit"""))
   }
}
        

// @LINE:160
case controllers_DistrictFunctions_getDistByDiv108(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DistrictFunctions.getDistByDiv(id), HandlerDef(this, "controllers.DistrictFunctions", "getDistByDiv", Seq(classOf[Long]),"GET", """##### JAVASCRIPT ROUTES""", Routes.prefix + """div/$id<[^/]+>"""))
   }
}
        

// @LINE:161
case controllers_DistrictFunctions_javascriptRoutes109(params) => {
   call { 
        invokeHandler(controllers.DistrictFunctions.javascriptRoutes, HandlerDef(this, "controllers.DistrictFunctions", "javascriptRoutes", Nil,"GET", """""", Routes.prefix + """javascriptRoutes"""))
   }
}
        
}
    
}
        