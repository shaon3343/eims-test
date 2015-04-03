# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table job_category (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  constraint pk_job_category primary key (id))
;

create table ClassYear (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  degree_id                 bigint,
  constraint pk_ClassYear primary key (id))
;

create table course (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  code                      varchar(255),
  credit                    varchar(255),
  constraint pk_course primary key (id))
;

create table degree (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  dept_id                   bigint,
  constraint pk_degree primary key (id))
;

create table department (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  faculty_id                bigint,
  constraint pk_department primary key (id))
;

create table designation (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  constraint pk_designation primary key (id))
;

create table DISTRICT (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  division_id               bigint,
  constraint pk_DISTRICT primary key (id))
;

create table DIVISION (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  constraint pk_DIVISION primary key (id))
;

create table employee (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  date_of_birth             datetime,
  gender                    tinyint(1) default 0,
  category_id               bigint,
  joining_date              datetime,
  employee_type             varchar(255),
  fathers_name              varchar(255),
  mothers_name              varchar(255),
  present_address           varchar(255),
  permanent_address         varchar(255),
  place_of_birth            varchar(255),
  nat_id_no                 varchar(255),
  birth_cert_no             varchar(255),
  tin                       varchar(255),
  nationality               varchar(255),
  religion                  varchar(255),
  blood_group               varchar(255),
  marital_stat              varchar(255),
  spouse_name               varchar(255),
  no_of_child               varchar(255),
  constraint pk_employee primary key (id))
;

create table faculty (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  univ_id                   bigint,
  constraint pk_faculty primary key (id))
;

create table parent (
  pid                       bigint auto_increment not null,
  name                      varchar(255),
  email                     varchar(255),
  fathers_name              varchar(255),
  father_profession         varchar(255),
  work_address              varchar(255),
  national_id               varchar(255),
  father_telephone          varchar(255),
  father_mobile             varchar(255),
  father_fax                varchar(255),
  father_email              varchar(255),
  father_edu_qual           varchar(255),
  mothers_name              varchar(255),
  mother_profession         varchar(255),
  mother_mobile             varchar(255),
  mother_mail               varchar(255),
  mothers_edu_qual          varchar(255),
  phone                     varchar(255),
  profession                varchar(255),
  telephone                 varchar(255),
  mobile                    varchar(255),
  fax                       varchar(255),
  guardian_edu              varchar(255),
  relationship              varchar(255),
  degree_name               varchar(255),
  institute_name            varchar(255),
  board                     varchar(255),
  result                    varchar(255),
  passing_year              varchar(255),
  constraint pk_parent primary key (pid))
;

create table section_or_semester (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  code                      varchar(255),
  class_id                  bigint,
  constraint pk_section_or_semester primary key (id))
;

create table student (
  sid                       bigint auto_increment not null,
  name                      varchar(255),
  date_of_birth             datetime,
  gender                    tinyint(1) default 0,
  parent_id                 bigint,
  department_id             bigint,
  degree_id                 bigint,
  class_id                  bigint,
  section_id                bigint,
  place_of_birth            varchar(255),
  marital_status            varchar(255),
  citizen                   varchar(255),
  present_address           varchar(255),
  divisionId                bigint,
  district                  varchar(255),
  permanent_address         varchar(255),
  mobile                    varchar(255),
  email                     varchar(255),
  constraint pk_student primary key (sid))
;

create table student_to_courses (
  id                        bigint auto_increment not null,
  student_id                bigint,
  course_id                 bigint,
  constraint pk_student_to_courses primary key (id))
;

create table Teacher (
  tid                       bigint auto_increment not null,
  name                      varchar(255),
  department_id             bigint,
  designation_id            bigint,
  employee_id               bigint,
  constraint pk_Teacher primary key (tid))
;

create table teachers_to_courses (
  id                        bigint auto_increment not null,
  teacher_id                bigint,
  course_id                 bigint,
  constraint pk_teachers_to_courses primary key (id))
;

create table teachers_qualifications (
  id                        bigint auto_increment not null,
  sscsession                varchar(255),
  sscresult                 varchar(255),
  sscschool                 varchar(255),
  hscsession                varchar(255),
  hscresult                 varchar(255),
  hsccollage                varchar(255),
  hons_session              varchar(255),
  hons_result               varchar(255),
  hons_univ                 varchar(255),
  ms_session                varchar(255),
  ms_result                 varchar(255),
  ms_univ                   varchar(255),
  phdyear                   varchar(255),
  phdtopics                 varchar(255),
  phduniv                   varchar(255),
  employee_id               bigint,
  constraint pk_teachers_qualifications primary key (id))
;

create table University (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  email                     varchar(255),
  address                   varchar(255),
  person_details            varchar(255),
  contact_no                varchar(255),
  constraint pk_University primary key (id))
;

alter table ClassYear add constraint fk_ClassYear_degree_1 foreign key (degree_id) references degree (id) on delete restrict on update restrict;
create index ix_ClassYear_degree_1 on ClassYear (degree_id);
alter table degree add constraint fk_degree_department_2 foreign key (dept_id) references department (id) on delete restrict on update restrict;
create index ix_degree_department_2 on degree (dept_id);
alter table department add constraint fk_department_faculty_3 foreign key (faculty_id) references faculty (id) on delete restrict on update restrict;
create index ix_department_faculty_3 on department (faculty_id);
alter table DISTRICT add constraint fk_DISTRICT_division_4 foreign key (division_id) references DIVISION (id) on delete restrict on update restrict;
create index ix_DISTRICT_division_4 on DISTRICT (division_id);
alter table employee add constraint fk_employee_category_5 foreign key (category_id) references job_category (id) on delete restrict on update restrict;
create index ix_employee_category_5 on employee (category_id);
alter table faculty add constraint fk_faculty_university_6 foreign key (univ_id) references University (id) on delete restrict on update restrict;
create index ix_faculty_university_6 on faculty (univ_id);
alter table section_or_semester add constraint fk_section_or_semester_classYear_7 foreign key (class_id) references ClassYear (id) on delete restrict on update restrict;
create index ix_section_or_semester_classYear_7 on section_or_semester (class_id);
alter table student add constraint fk_student_department_8 foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_student_department_8 on student (department_id);
alter table student add constraint fk_student_degree_9 foreign key (degree_id) references degree (id) on delete restrict on update restrict;
create index ix_student_degree_9 on student (degree_id);
alter table student add constraint fk_student_classYear_10 foreign key (class_id) references ClassYear (id) on delete restrict on update restrict;
create index ix_student_classYear_10 on student (class_id);
alter table student add constraint fk_student_sectionSemester_11 foreign key (section_id) references section_or_semester (id) on delete restrict on update restrict;
create index ix_student_sectionSemester_11 on student (section_id);
alter table student add constraint fk_student_division_12 foreign key (divisionId) references DIVISION (id) on delete restrict on update restrict;
create index ix_student_division_12 on student (divisionId);
alter table student_to_courses add constraint fk_student_to_courses_student_13 foreign key (student_id) references student (sid) on delete restrict on update restrict;
create index ix_student_to_courses_student_13 on student_to_courses (student_id);
alter table student_to_courses add constraint fk_student_to_courses_course_14 foreign key (course_id) references course (id) on delete restrict on update restrict;
create index ix_student_to_courses_course_14 on student_to_courses (course_id);
alter table Teacher add constraint fk_Teacher_department_15 foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_Teacher_department_15 on Teacher (department_id);
alter table Teacher add constraint fk_Teacher_designation_16 foreign key (designation_id) references designation (id) on delete restrict on update restrict;
create index ix_Teacher_designation_16 on Teacher (designation_id);
alter table teachers_to_courses add constraint fk_teachers_to_courses_teacher_17 foreign key (teacher_id) references Teacher (tid) on delete restrict on update restrict;
create index ix_teachers_to_courses_teacher_17 on teachers_to_courses (teacher_id);
alter table teachers_to_courses add constraint fk_teachers_to_courses_course_18 foreign key (course_id) references course (id) on delete restrict on update restrict;
create index ix_teachers_to_courses_course_18 on teachers_to_courses (course_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table job_category;

drop table ClassYear;

drop table course;

drop table degree;

drop table department;

drop table designation;

drop table DISTRICT;

drop table DIVISION;

drop table employee;

drop table faculty;

drop table parent;

drop table section_or_semester;

drop table student;

drop table student_to_courses;

drop table Teacher;

drop table teachers_to_courses;

drop table teachers_qualifications;

drop table University;

SET FOREIGN_KEY_CHECKS=1;

