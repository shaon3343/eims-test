// @SOURCE:/home/shaon/workspace/EIMS/conf/routes
// @HASH:acb112f2676bff8b90364b081a6febc1b3d69ea4
// @DATE:Sat Apr 04 02:02:40 BDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:161
// @LINE:160
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:151
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:130
// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:120
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
class ReverseTQManagement {
    

// @LINE:99
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teacher-qualifications/edit")
}
                                                

// @LINE:100
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teacher-qualifications/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:96
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teacher-qualifications/list")
}
                                                

// @LINE:97
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teacher-qualifications/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:98
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teacher-qualifications/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:130
// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
class ReverseTeacherCourseManagement {
    

// @LINE:130
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teacher-course/edit")
}
                                                

// @LINE:126
def insert(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teacher-course/create")
}
                                                

// @LINE:125
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teacher-course/create")
}
                                                

// @LINE:127
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teacher-course/list")
}
                                                

// @LINE:128
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teacher-course/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:129
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teacher-course/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:124
def createWithTeacher(teacherId:String = "1"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teacher-course/create-with-teacher" + queryString(List(if(teacherId == "1") None else Some(implicitly[QueryStringBindable[String]].unbind("teacherId", teacherId)))))
}
                                                
    
}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseFacultyManagement {
    

// @LINE:26
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "faculty/edit")
}
                                                

// @LINE:27
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "faculty/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:21
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "faculty/create")
}
                                                

// @LINE:23
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "faculty/list")
}
                                                

// @LINE:24
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "faculty/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:22
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "faculty/create")
}
                                                

// @LINE:25
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "faculty/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:120
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
class ReverseCourseManagement {
    

// @LINE:119
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "course/edit")
}
                                                

// @LINE:120
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "course/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:114
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "course/create")
}
                                                

// @LINE:116
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "course/list")
}
                                                

// @LINE:117
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "course/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:115
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "course/create")
}
                                                

// @LINE:118
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "course/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
class ReverseSectionSemesterManagement {
    

// @LINE:64
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "section-or-semester/edit")
}
                                                

// @LINE:65
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "section-or-semester/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:59
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "section-or-semester/create")
}
                                                

// @LINE:61
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "section-or-semester/list")
}
                                                

// @LINE:62
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "section-or-semester/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:60
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "section-or-semester/create")
}
                                                

// @LINE:63
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "section-or-semester/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
class ReverseCategoryManagement {
    

// @LINE:83
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "category/edit")
}
                                                

// @LINE:84
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "category/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:78
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "category/create")
}
                                                

// @LINE:80
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "category/list")
}
                                                

// @LINE:81
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "category/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:79
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "category/create")
}
                                                

// @LINE:82
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "category/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseEmployeeManagement {
    

// @LINE:74
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/edit")
}
                                                

// @LINE:75
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "employee/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:69
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "employee/create")
}
                                                

// @LINE:71
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "employee/list")
}
                                                

// @LINE:72
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "employee/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:70
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/create")
}
                                                

// @LINE:73
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "employee/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:151
class ReverseStudentCourseManagement {
    

// @LINE:157
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "student-course/edit")
}
                                                

// @LINE:151
def createWithStudent(studentId:String = "1"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "student-course/create-with-student" + queryString(List(if(studentId == "1") None else Some(implicitly[QueryStringBindable[String]].unbind("studentId", studentId)))))
}
                                                

// @LINE:153
def insert(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "student-course/create")
}
                                                

// @LINE:152
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "student-course/create")
}
                                                

// @LINE:154
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "student-course/list")
}
                                                

// @LINE:155
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "student-course/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:156
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "student-course/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:104
// @LINE:103
class ReverseDesignationManagement {
    

// @LINE:108
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "designation/edit")
}
                                                

// @LINE:109
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "designation/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:103
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "designation/create")
}
                                                

// @LINE:105
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "designation/list")
}
                                                

// @LINE:106
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "designation/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:104
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "designation/create")
}
                                                

// @LINE:107
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "designation/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
class ReverseClassYearManagement {
    

// @LINE:55
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "class-or-year/edit")
}
                                                

// @LINE:56
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "class-or-year/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:50
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "class-or-year/create")
}
                                                

// @LINE:52
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "class-or-year/list")
}
                                                

// @LINE:53
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "class-or-year/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:51
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "class-or-year/create")
}
                                                

// @LINE:54
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "class-or-year/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
class ReverseDepartmentManagement {
    

// @LINE:36
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "department/edit")
}
                                                

// @LINE:37
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "department/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:31
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "department/create")
}
                                                

// @LINE:33
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "department/list")
}
                                                

// @LINE:34
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "department/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:32
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "department/create")
}
                                                

// @LINE:35
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "department/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseUniversityManagement {
    

// @LINE:17
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "university/edit")
}
                                                

// @LINE:18
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "university/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:12
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "university/create")
}
                                                

// @LINE:14
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "university/list")
}
                                                

// @LINE:15
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "university/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:13
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "university/create")
}
                                                

// @LINE:16
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "university/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
class ReverseDegreeManagement {
    

// @LINE:46
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "degree/edit")
}
                                                

// @LINE:47
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "degree/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:41
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "degree/create")
}
                                                

// @LINE:43
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "degree/list")
}
                                                

// @LINE:44
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "degree/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:42
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "degree/create")
}
                                                

// @LINE:45
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "degree/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
class ReverseStudentManagement {
    

// @LINE:139
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "student/edit")
}
                                                

// @LINE:140
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "student/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:134
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "student/create")
}
                                                

// @LINE:136
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "student/list")
}
                                                

// @LINE:137
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "student/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:135
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "student/create")
}
                                                

// @LINE:138
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "student/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:161
// @LINE:160
class ReverseDistrictFunctions {
    

// @LINE:160
def getDistByDiv(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "div/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:161
def javascriptRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "javascriptRoutes")
}
                                                
    
}
                          

// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
class ReverseParentManagement {
    

// @LINE:147
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "parent/edit")
}
                                                

// @LINE:148
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "parent/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:144
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "parent/list")
}
                                                

// @LINE:145
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "parent/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:146
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "parent/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
class ReverseTeacherManagement {
    

// @LINE:92
def update(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "teacher/edit")
}
                                                

// @LINE:93
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teacher/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:89
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teacher/list")
}
                                                

// @LINE:90
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teacher/show/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:91
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "teacher/edit/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          
}
                  


// @LINE:161
// @LINE:160
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:151
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:130
// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:120
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
class ReverseTQManagement {
    

// @LINE:99
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TQManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher-qualifications/edit"})
      }
   """
)
                        

// @LINE:100
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TQManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher-qualifications/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:96
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TQManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher-qualifications/list"})
      }
   """
)
                        

// @LINE:97
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TQManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher-qualifications/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:98
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TQManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher-qualifications/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:130
// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
class ReverseTeacherCourseManagement {
    

// @LINE:130
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TeacherCourseManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher-course/edit"})
      }
   """
)
                        

// @LINE:126
def insert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TeacherCourseManagement.insert",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher-course/create"})
      }
   """
)
                        

// @LINE:125
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TeacherCourseManagement.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher-course/create"})
      }
   """
)
                        

// @LINE:127
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TeacherCourseManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher-course/list"})
      }
   """
)
                        

// @LINE:128
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TeacherCourseManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher-course/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:129
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TeacherCourseManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher-course/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:124
def createWithTeacher : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TeacherCourseManagement.createWithTeacher",
   """
      function(teacherId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher-course/create-with-teacher" + _qS([(teacherId == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("teacherId", teacherId))])})
      }
   """
)
                        
    
}
              

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseFacultyManagement {
    

// @LINE:26
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FacultyManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "faculty/edit"})
      }
   """
)
                        

// @LINE:27
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FacultyManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "faculty/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:21
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FacultyManagement.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "faculty/create"})
      }
   """
)
                        

// @LINE:23
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FacultyManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "faculty/list"})
      }
   """
)
                        

// @LINE:24
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FacultyManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "faculty/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:22
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FacultyManagement.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "faculty/create"})
      }
   """
)
                        

// @LINE:25
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FacultyManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "faculty/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:120
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
class ReverseCourseManagement {
    

// @LINE:119
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CourseManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "course/edit"})
      }
   """
)
                        

// @LINE:120
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CourseManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:114
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CourseManagement.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/create"})
      }
   """
)
                        

// @LINE:116
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CourseManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/list"})
      }
   """
)
                        

// @LINE:117
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CourseManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:115
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CourseManagement.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "course/create"})
      }
   """
)
                        

// @LINE:118
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CourseManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
class ReverseSectionSemesterManagement {
    

// @LINE:64
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SectionSemesterManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "section-or-semester/edit"})
      }
   """
)
                        

// @LINE:65
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SectionSemesterManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "section-or-semester/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:59
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SectionSemesterManagement.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "section-or-semester/create"})
      }
   """
)
                        

// @LINE:61
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SectionSemesterManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "section-or-semester/list"})
      }
   """
)
                        

// @LINE:62
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SectionSemesterManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "section-or-semester/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:60
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SectionSemesterManagement.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "section-or-semester/create"})
      }
   """
)
                        

// @LINE:63
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SectionSemesterManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "section-or-semester/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
class ReverseCategoryManagement {
    

// @LINE:83
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoryManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "category/edit"})
      }
   """
)
                        

// @LINE:84
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoryManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:78
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoryManagement.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/create"})
      }
   """
)
                        

// @LINE:80
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoryManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/list"})
      }
   """
)
                        

// @LINE:81
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoryManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:79
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoryManagement.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "category/create"})
      }
   """
)
                        

// @LINE:82
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.CategoryManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseEmployeeManagement {
    

// @LINE:74
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployeeManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/edit"})
      }
   """
)
                        

// @LINE:75
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployeeManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:69
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployeeManagement.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/create"})
      }
   """
)
                        

// @LINE:71
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployeeManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/list"})
      }
   """
)
                        

// @LINE:72
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployeeManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:70
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployeeManagement.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/create"})
      }
   """
)
                        

// @LINE:73
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployeeManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:151
class ReverseStudentCourseManagement {
    

// @LINE:157
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentCourseManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "student-course/edit"})
      }
   """
)
                        

// @LINE:151
def createWithStudent : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentCourseManagement.createWithStudent",
   """
      function(studentId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student-course/create-with-student" + _qS([(studentId == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("studentId", studentId))])})
      }
   """
)
                        

// @LINE:153
def insert : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentCourseManagement.insert",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "student-course/create"})
      }
   """
)
                        

// @LINE:152
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentCourseManagement.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student-course/create"})
      }
   """
)
                        

// @LINE:154
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentCourseManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student-course/list"})
      }
   """
)
                        

// @LINE:155
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentCourseManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student-course/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:156
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentCourseManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student-course/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:104
// @LINE:103
class ReverseDesignationManagement {
    

// @LINE:108
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DesignationManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "designation/edit"})
      }
   """
)
                        

// @LINE:109
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DesignationManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "designation/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:103
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DesignationManagement.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "designation/create"})
      }
   """
)
                        

// @LINE:105
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DesignationManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "designation/list"})
      }
   """
)
                        

// @LINE:106
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DesignationManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "designation/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:104
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DesignationManagement.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "designation/create"})
      }
   """
)
                        

// @LINE:107
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DesignationManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "designation/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
class ReverseClassYearManagement {
    

// @LINE:55
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClassYearManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "class-or-year/edit"})
      }
   """
)
                        

// @LINE:56
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClassYearManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "class-or-year/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:50
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClassYearManagement.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "class-or-year/create"})
      }
   """
)
                        

// @LINE:52
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClassYearManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "class-or-year/list"})
      }
   """
)
                        

// @LINE:53
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClassYearManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "class-or-year/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:51
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClassYearManagement.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "class-or-year/create"})
      }
   """
)
                        

// @LINE:54
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClassYearManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "class-or-year/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
class ReverseDepartmentManagement {
    

// @LINE:36
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DepartmentManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "department/edit"})
      }
   """
)
                        

// @LINE:37
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DepartmentManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "department/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:31
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DepartmentManagement.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "department/create"})
      }
   """
)
                        

// @LINE:33
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DepartmentManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "department/list"})
      }
   """
)
                        

// @LINE:34
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DepartmentManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "department/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:32
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DepartmentManagement.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "department/create"})
      }
   """
)
                        

// @LINE:35
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DepartmentManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "department/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseUniversityManagement {
    

// @LINE:17
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UniversityManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "university/edit"})
      }
   """
)
                        

// @LINE:18
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UniversityManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "university/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:12
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UniversityManagement.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "university/create"})
      }
   """
)
                        

// @LINE:14
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UniversityManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "university/list"})
      }
   """
)
                        

// @LINE:15
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UniversityManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "university/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:13
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UniversityManagement.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "university/create"})
      }
   """
)
                        

// @LINE:16
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.UniversityManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "university/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
class ReverseDegreeManagement {
    

// @LINE:46
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DegreeManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "degree/edit"})
      }
   """
)
                        

// @LINE:47
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DegreeManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "degree/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:41
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DegreeManagement.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "degree/create"})
      }
   """
)
                        

// @LINE:43
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DegreeManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "degree/list"})
      }
   """
)
                        

// @LINE:44
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DegreeManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "degree/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:42
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DegreeManagement.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "degree/create"})
      }
   """
)
                        

// @LINE:45
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DegreeManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "degree/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
class ReverseStudentManagement {
    

// @LINE:139
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "student/edit"})
      }
   """
)
                        

// @LINE:140
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:134
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentManagement.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student/create"})
      }
   """
)
                        

// @LINE:136
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student/list"})
      }
   """
)
                        

// @LINE:137
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:135
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentManagement.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "student/create"})
      }
   """
)
                        

// @LINE:138
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.StudentManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "student/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:161
// @LINE:160
class ReverseDistrictFunctions {
    

// @LINE:160
def getDistByDiv : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DistrictFunctions.getDistByDiv",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "div/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:161
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DistrictFunctions.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "javascriptRoutes"})
      }
   """
)
                        
    
}
              

// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
class ReverseParentManagement {
    

// @LINE:147
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParentManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "parent/edit"})
      }
   """
)
                        

// @LINE:148
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParentManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parent/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:144
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParentManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parent/list"})
      }
   """
)
                        

// @LINE:145
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParentManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parent/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:146
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ParentManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "parent/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
class ReverseTeacherManagement {
    

// @LINE:92
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TeacherManagement.update",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher/edit"})
      }
   """
)
                        

// @LINE:93
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TeacherManagement.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:89
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TeacherManagement.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher/list"})
      }
   """
)
                        

// @LINE:90
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TeacherManagement.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher/show/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:91
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TeacherManagement.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "teacher/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:161
// @LINE:160
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:151
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:130
// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:120
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:104
// @LINE:103
// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:100
// @LINE:99
// @LINE:98
// @LINE:97
// @LINE:96
class ReverseTQManagement {
    

// @LINE:99
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TQManagement.update(), HandlerDef(this, "controllers.TQManagement", "update", Seq(), "POST", """""", _prefix + """teacher-qualifications/edit""")
)
                      

// @LINE:100
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TQManagement.delete(id), HandlerDef(this, "controllers.TQManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """teacher-qualifications/delete/$id<[^/]+>""")
)
                      

// @LINE:96
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TQManagement.list(), HandlerDef(this, "controllers.TQManagement", "list", Seq(), "GET", """Teacher Qualifications""", _prefix + """teacher-qualifications/list""")
)
                      

// @LINE:97
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TQManagement.show(id), HandlerDef(this, "controllers.TQManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """teacher-qualifications/show/$id<[^/]+>""")
)
                      

// @LINE:98
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TQManagement.edit(id), HandlerDef(this, "controllers.TQManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """teacher-qualifications/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:130
// @LINE:129
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
class ReverseTeacherCourseManagement {
    

// @LINE:130
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TeacherCourseManagement.update(), HandlerDef(this, "controllers.TeacherCourseManagement", "update", Seq(), "POST", """""", _prefix + """teacher-course/edit""")
)
                      

// @LINE:126
def insert(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TeacherCourseManagement.insert(), HandlerDef(this, "controllers.TeacherCourseManagement", "insert", Seq(), "POST", """""", _prefix + """teacher-course/create""")
)
                      

// @LINE:125
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TeacherCourseManagement.create(), HandlerDef(this, "controllers.TeacherCourseManagement", "create", Seq(), "GET", """""", _prefix + """teacher-course/create""")
)
                      

// @LINE:127
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TeacherCourseManagement.list(), HandlerDef(this, "controllers.TeacherCourseManagement", "list", Seq(), "GET", """""", _prefix + """teacher-course/list""")
)
                      

// @LINE:128
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TeacherCourseManagement.show(id), HandlerDef(this, "controllers.TeacherCourseManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """teacher-course/show/$id<[^/]+>""")
)
                      

// @LINE:129
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TeacherCourseManagement.edit(id), HandlerDef(this, "controllers.TeacherCourseManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """teacher-course/edit/$id<[^/]+>""")
)
                      

// @LINE:124
def createWithTeacher(teacherId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TeacherCourseManagement.createWithTeacher(teacherId), HandlerDef(this, "controllers.TeacherCourseManagement", "createWithTeacher", Seq(classOf[String]), "GET", """TeacherCourse , Assign Courses to a teacher""", _prefix + """teacher-course/create-with-teacher""")
)
                      
    
}
                          

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseFacultyManagement {
    

// @LINE:26
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FacultyManagement.update(), HandlerDef(this, "controllers.FacultyManagement", "update", Seq(), "POST", """""", _prefix + """faculty/edit""")
)
                      

// @LINE:27
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FacultyManagement.delete(id), HandlerDef(this, "controllers.FacultyManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """faculty/delete/$id<[^/]+>""")
)
                      

// @LINE:21
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FacultyManagement.create(), HandlerDef(this, "controllers.FacultyManagement", "create", Seq(), "GET", """Faculty""", _prefix + """faculty/create""")
)
                      

// @LINE:23
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FacultyManagement.list(), HandlerDef(this, "controllers.FacultyManagement", "list", Seq(), "GET", """""", _prefix + """faculty/list""")
)
                      

// @LINE:24
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FacultyManagement.show(id), HandlerDef(this, "controllers.FacultyManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """faculty/show/$id<[^/]+>""")
)
                      

// @LINE:22
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FacultyManagement.save(), HandlerDef(this, "controllers.FacultyManagement", "save", Seq(), "POST", """""", _prefix + """faculty/create""")
)
                      

// @LINE:25
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FacultyManagement.edit(id), HandlerDef(this, "controllers.FacultyManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """faculty/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:120
// @LINE:119
// @LINE:118
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
class ReverseCourseManagement {
    

// @LINE:119
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CourseManagement.update(), HandlerDef(this, "controllers.CourseManagement", "update", Seq(), "POST", """""", _prefix + """course/edit""")
)
                      

// @LINE:120
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CourseManagement.delete(id), HandlerDef(this, "controllers.CourseManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """course/delete/$id<[^/]+>""")
)
                      

// @LINE:114
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CourseManagement.create(), HandlerDef(this, "controllers.CourseManagement", "create", Seq(), "GET", """Course""", _prefix + """course/create""")
)
                      

// @LINE:116
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CourseManagement.list(), HandlerDef(this, "controllers.CourseManagement", "list", Seq(), "GET", """""", _prefix + """course/list""")
)
                      

// @LINE:117
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CourseManagement.show(id), HandlerDef(this, "controllers.CourseManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """course/show/$id<[^/]+>""")
)
                      

// @LINE:115
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CourseManagement.save(), HandlerDef(this, "controllers.CourseManagement", "save", Seq(), "POST", """""", _prefix + """course/create""")
)
                      

// @LINE:118
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CourseManagement.edit(id), HandlerDef(this, "controllers.CourseManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """course/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:65
// @LINE:64
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
class ReverseSectionSemesterManagement {
    

// @LINE:64
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SectionSemesterManagement.update(), HandlerDef(this, "controllers.SectionSemesterManagement", "update", Seq(), "POST", """""", _prefix + """section-or-semester/edit""")
)
                      

// @LINE:65
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SectionSemesterManagement.delete(id), HandlerDef(this, "controllers.SectionSemesterManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """section-or-semester/delete/$id<[^/]+>""")
)
                      

// @LINE:59
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SectionSemesterManagement.create(), HandlerDef(this, "controllers.SectionSemesterManagement", "create", Seq(), "GET", """SectionSemester""", _prefix + """section-or-semester/create""")
)
                      

// @LINE:61
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SectionSemesterManagement.list(), HandlerDef(this, "controllers.SectionSemesterManagement", "list", Seq(), "GET", """""", _prefix + """section-or-semester/list""")
)
                      

// @LINE:62
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SectionSemesterManagement.show(id), HandlerDef(this, "controllers.SectionSemesterManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """section-or-semester/show/$id<[^/]+>""")
)
                      

// @LINE:60
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SectionSemesterManagement.save(), HandlerDef(this, "controllers.SectionSemesterManagement", "save", Seq(), "POST", """""", _prefix + """section-or-semester/create""")
)
                      

// @LINE:63
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SectionSemesterManagement.edit(id), HandlerDef(this, "controllers.SectionSemesterManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """section-or-semester/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:80
// @LINE:79
// @LINE:78
class ReverseCategoryManagement {
    

// @LINE:83
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoryManagement.update(), HandlerDef(this, "controllers.CategoryManagement", "update", Seq(), "POST", """""", _prefix + """category/edit""")
)
                      

// @LINE:84
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoryManagement.delete(id), HandlerDef(this, "controllers.CategoryManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """category/delete/$id<[^/]+>""")
)
                      

// @LINE:78
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoryManagement.create(), HandlerDef(this, "controllers.CategoryManagement", "create", Seq(), "GET", """Category""", _prefix + """category/create""")
)
                      

// @LINE:80
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoryManagement.list(), HandlerDef(this, "controllers.CategoryManagement", "list", Seq(), "GET", """""", _prefix + """category/list""")
)
                      

// @LINE:81
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoryManagement.show(id), HandlerDef(this, "controllers.CategoryManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """category/show/$id<[^/]+>""")
)
                      

// @LINE:79
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoryManagement.save(), HandlerDef(this, "controllers.CategoryManagement", "save", Seq(), "POST", """""", _prefix + """category/create""")
)
                      

// @LINE:82
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.CategoryManagement.edit(id), HandlerDef(this, "controllers.CategoryManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """category/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:69
class ReverseEmployeeManagement {
    

// @LINE:74
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployeeManagement.update(), HandlerDef(this, "controllers.EmployeeManagement", "update", Seq(), "POST", """""", _prefix + """employee/edit""")
)
                      

// @LINE:75
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployeeManagement.delete(id), HandlerDef(this, "controllers.EmployeeManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """employee/delete/$id<[^/]+>""")
)
                      

// @LINE:69
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployeeManagement.create(), HandlerDef(this, "controllers.EmployeeManagement", "create", Seq(), "GET", """Employee""", _prefix + """employee/create""")
)
                      

// @LINE:71
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployeeManagement.list(), HandlerDef(this, "controllers.EmployeeManagement", "list", Seq(), "GET", """""", _prefix + """employee/list""")
)
                      

// @LINE:72
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployeeManagement.show(id), HandlerDef(this, "controllers.EmployeeManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """employee/show/$id<[^/]+>""")
)
                      

// @LINE:70
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployeeManagement.save(), HandlerDef(this, "controllers.EmployeeManagement", "save", Seq(), "POST", """""", _prefix + """employee/create""")
)
                      

// @LINE:73
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployeeManagement.edit(id), HandlerDef(this, "controllers.EmployeeManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """employee/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:154
// @LINE:153
// @LINE:152
// @LINE:151
class ReverseStudentCourseManagement {
    

// @LINE:157
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentCourseManagement.update(), HandlerDef(this, "controllers.StudentCourseManagement", "update", Seq(), "POST", """""", _prefix + """student-course/edit""")
)
                      

// @LINE:151
def createWithStudent(studentId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentCourseManagement.createWithStudent(studentId), HandlerDef(this, "controllers.StudentCourseManagement", "createWithStudent", Seq(classOf[String]), "GET", """StudentCourse , Assign Courses to a student""", _prefix + """student-course/create-with-student""")
)
                      

// @LINE:153
def insert(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentCourseManagement.insert(), HandlerDef(this, "controllers.StudentCourseManagement", "insert", Seq(), "POST", """""", _prefix + """student-course/create""")
)
                      

// @LINE:152
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentCourseManagement.create(), HandlerDef(this, "controllers.StudentCourseManagement", "create", Seq(), "GET", """""", _prefix + """student-course/create""")
)
                      

// @LINE:154
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentCourseManagement.list(), HandlerDef(this, "controllers.StudentCourseManagement", "list", Seq(), "GET", """""", _prefix + """student-course/list""")
)
                      

// @LINE:155
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentCourseManagement.show(id), HandlerDef(this, "controllers.StudentCourseManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """student-course/show/$id<[^/]+>""")
)
                      

// @LINE:156
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentCourseManagement.edit(id), HandlerDef(this, "controllers.StudentCourseManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """student-course/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:109
// @LINE:108
// @LINE:107
// @LINE:106
// @LINE:105
// @LINE:104
// @LINE:103
class ReverseDesignationManagement {
    

// @LINE:108
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DesignationManagement.update(), HandlerDef(this, "controllers.DesignationManagement", "update", Seq(), "POST", """""", _prefix + """designation/edit""")
)
                      

// @LINE:109
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DesignationManagement.delete(id), HandlerDef(this, "controllers.DesignationManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """designation/delete/$id<[^/]+>""")
)
                      

// @LINE:103
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DesignationManagement.create(), HandlerDef(this, "controllers.DesignationManagement", "create", Seq(), "GET", """Designation""", _prefix + """designation/create""")
)
                      

// @LINE:105
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DesignationManagement.list(), HandlerDef(this, "controllers.DesignationManagement", "list", Seq(), "GET", """""", _prefix + """designation/list""")
)
                      

// @LINE:106
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DesignationManagement.show(id), HandlerDef(this, "controllers.DesignationManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """designation/show/$id<[^/]+>""")
)
                      

// @LINE:104
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DesignationManagement.save(), HandlerDef(this, "controllers.DesignationManagement", "save", Seq(), "POST", """""", _prefix + """designation/create""")
)
                      

// @LINE:107
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DesignationManagement.edit(id), HandlerDef(this, "controllers.DesignationManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """designation/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:50
class ReverseClassYearManagement {
    

// @LINE:55
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClassYearManagement.update(), HandlerDef(this, "controllers.ClassYearManagement", "update", Seq(), "POST", """""", _prefix + """class-or-year/edit""")
)
                      

// @LINE:56
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClassYearManagement.delete(id), HandlerDef(this, "controllers.ClassYearManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """class-or-year/delete/$id<[^/]+>""")
)
                      

// @LINE:50
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClassYearManagement.create(), HandlerDef(this, "controllers.ClassYearManagement", "create", Seq(), "GET", """Class or Year""", _prefix + """class-or-year/create""")
)
                      

// @LINE:52
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClassYearManagement.list(), HandlerDef(this, "controllers.ClassYearManagement", "list", Seq(), "GET", """""", _prefix + """class-or-year/list""")
)
                      

// @LINE:53
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClassYearManagement.show(id), HandlerDef(this, "controllers.ClassYearManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """class-or-year/show/$id<[^/]+>""")
)
                      

// @LINE:51
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClassYearManagement.save(), HandlerDef(this, "controllers.ClassYearManagement", "save", Seq(), "POST", """""", _prefix + """class-or-year/create""")
)
                      

// @LINE:54
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClassYearManagement.edit(id), HandlerDef(this, "controllers.ClassYearManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """class-or-year/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
class ReverseDepartmentManagement {
    

// @LINE:36
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DepartmentManagement.update(), HandlerDef(this, "controllers.DepartmentManagement", "update", Seq(), "POST", """""", _prefix + """department/edit""")
)
                      

// @LINE:37
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DepartmentManagement.delete(id), HandlerDef(this, "controllers.DepartmentManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """department/delete/$id<[^/]+>""")
)
                      

// @LINE:31
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DepartmentManagement.create(), HandlerDef(this, "controllers.DepartmentManagement", "create", Seq(), "GET", """Department""", _prefix + """department/create""")
)
                      

// @LINE:33
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DepartmentManagement.list(), HandlerDef(this, "controllers.DepartmentManagement", "list", Seq(), "GET", """""", _prefix + """department/list""")
)
                      

// @LINE:34
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DepartmentManagement.show(id), HandlerDef(this, "controllers.DepartmentManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """department/show/$id<[^/]+>""")
)
                      

// @LINE:32
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DepartmentManagement.save(), HandlerDef(this, "controllers.DepartmentManagement", "save", Seq(), "POST", """""", _prefix + """department/create""")
)
                      

// @LINE:35
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DepartmentManagement.edit(id), HandlerDef(this, "controllers.DepartmentManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """department/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseUniversityManagement {
    

// @LINE:17
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UniversityManagement.update(), HandlerDef(this, "controllers.UniversityManagement", "update", Seq(), "POST", """""", _prefix + """university/edit""")
)
                      

// @LINE:18
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UniversityManagement.delete(id), HandlerDef(this, "controllers.UniversityManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """university/delete/$id<[^/]+>""")
)
                      

// @LINE:12
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UniversityManagement.create(), HandlerDef(this, "controllers.UniversityManagement", "create", Seq(), "GET", """University""", _prefix + """university/create""")
)
                      

// @LINE:14
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UniversityManagement.list(), HandlerDef(this, "controllers.UniversityManagement", "list", Seq(), "GET", """""", _prefix + """university/list""")
)
                      

// @LINE:15
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UniversityManagement.show(id), HandlerDef(this, "controllers.UniversityManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """university/show/$id<[^/]+>""")
)
                      

// @LINE:13
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UniversityManagement.save(), HandlerDef(this, "controllers.UniversityManagement", "save", Seq(), "POST", """""", _prefix + """university/create""")
)
                      

// @LINE:16
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.UniversityManagement.edit(id), HandlerDef(this, "controllers.UniversityManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """university/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:42
// @LINE:41
class ReverseDegreeManagement {
    

// @LINE:46
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DegreeManagement.update(), HandlerDef(this, "controllers.DegreeManagement", "update", Seq(), "POST", """""", _prefix + """degree/edit""")
)
                      

// @LINE:47
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DegreeManagement.delete(id), HandlerDef(this, "controllers.DegreeManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """degree/delete/$id<[^/]+>""")
)
                      

// @LINE:41
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DegreeManagement.create(), HandlerDef(this, "controllers.DegreeManagement", "create", Seq(), "GET", """Degree""", _prefix + """degree/create""")
)
                      

// @LINE:43
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DegreeManagement.list(), HandlerDef(this, "controllers.DegreeManagement", "list", Seq(), "GET", """""", _prefix + """degree/list""")
)
                      

// @LINE:44
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DegreeManagement.show(id), HandlerDef(this, "controllers.DegreeManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """degree/show/$id<[^/]+>""")
)
                      

// @LINE:42
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DegreeManagement.save(), HandlerDef(this, "controllers.DegreeManagement", "save", Seq(), "POST", """""", _prefix + """degree/create""")
)
                      

// @LINE:45
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DegreeManagement.edit(id), HandlerDef(this, "controllers.DegreeManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """degree/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:140
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
class ReverseStudentManagement {
    

// @LINE:139
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentManagement.update(), HandlerDef(this, "controllers.StudentManagement", "update", Seq(), "POST", """""", _prefix + """student/edit""")
)
                      

// @LINE:140
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentManagement.delete(id), HandlerDef(this, "controllers.StudentManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """student/delete/$id<[^/]+>""")
)
                      

// @LINE:134
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentManagement.create(), HandlerDef(this, "controllers.StudentManagement", "create", Seq(), "GET", """Student""", _prefix + """student/create""")
)
                      

// @LINE:136
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentManagement.list(), HandlerDef(this, "controllers.StudentManagement", "list", Seq(), "GET", """""", _prefix + """student/list""")
)
                      

// @LINE:137
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentManagement.show(id), HandlerDef(this, "controllers.StudentManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """student/show/$id<[^/]+>""")
)
                      

// @LINE:135
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentManagement.save(), HandlerDef(this, "controllers.StudentManagement", "save", Seq(), "POST", """""", _prefix + """student/create""")
)
                      

// @LINE:138
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.StudentManagement.edit(id), HandlerDef(this, "controllers.StudentManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """student/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:161
// @LINE:160
class ReverseDistrictFunctions {
    

// @LINE:160
def getDistByDiv(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DistrictFunctions.getDistByDiv(id), HandlerDef(this, "controllers.DistrictFunctions", "getDistByDiv", Seq(classOf[Long]), "GET", """##### JAVASCRIPT ROUTES""", _prefix + """div/$id<[^/]+>""")
)
                      

// @LINE:161
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DistrictFunctions.javascriptRoutes(), HandlerDef(this, "controllers.DistrictFunctions", "javascriptRoutes", Seq(), "GET", """""", _prefix + """javascriptRoutes""")
)
                      
    
}
                          

// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
class ReverseParentManagement {
    

// @LINE:147
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ParentManagement.update(), HandlerDef(this, "controllers.ParentManagement", "update", Seq(), "POST", """""", _prefix + """parent/edit""")
)
                      

// @LINE:148
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ParentManagement.delete(id), HandlerDef(this, "controllers.ParentManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """parent/delete/$id<[^/]+>""")
)
                      

// @LINE:144
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ParentManagement.list(), HandlerDef(this, "controllers.ParentManagement", "list", Seq(), "GET", """Parent""", _prefix + """parent/list""")
)
                      

// @LINE:145
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ParentManagement.show(id), HandlerDef(this, "controllers.ParentManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """parent/show/$id<[^/]+>""")
)
                      

// @LINE:146
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ParentManagement.edit(id), HandlerDef(this, "controllers.ParentManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """parent/edit/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:89
class ReverseTeacherManagement {
    

// @LINE:92
def update(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TeacherManagement.update(), HandlerDef(this, "controllers.TeacherManagement", "update", Seq(), "POST", """""", _prefix + """teacher/edit""")
)
                      

// @LINE:93
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TeacherManagement.delete(id), HandlerDef(this, "controllers.TeacherManagement", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """teacher/delete/$id<[^/]+>""")
)
                      

// @LINE:89
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TeacherManagement.list(), HandlerDef(this, "controllers.TeacherManagement", "list", Seq(), "GET", """Teacher
GET		/teacher/create						     controllers.TeacherManagement.create()
POST	/teacher/create						     controllers.TeacherManagement.save()""", _prefix + """teacher/list""")
)
                      

// @LINE:90
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TeacherManagement.show(id), HandlerDef(this, "controllers.TeacherManagement", "show", Seq(classOf[Long]), "GET", """""", _prefix + """teacher/show/$id<[^/]+>""")
)
                      

// @LINE:91
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TeacherManagement.edit(id), HandlerDef(this, "controllers.TeacherManagement", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """teacher/edit/$id<[^/]+>""")
)
                      
    
}
                          
}
                  
      