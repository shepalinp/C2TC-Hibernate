package com.cg.jpacrud.service;

import com.cg.jpacrud.Dao.StudentDaolmp1;
import com.cg.jpacrud.entities.Student;

public class StudentServicelmp1 implements StudentService {
	
private com.cg.jpacrud.Dao.StudentDao dao;

public StudentServicelmp1() 
 
{
	
dao = new StudentDaolmp1();

}

@Override
public void addStudent(Student student) {
	dao.beginTransaction();
	dao.addStudent(student);
	dao.commiTransaction();
	
}

@Override
public void removeStudent(Student student) {
	dao.beginTransaction();
	dao.removeStudent(student);
	dao.commiTransaction();
	
}

@Override
public void updateStudent(Student student) {
	dao.beginTransaction();
	dao.updateStudent(student);
	dao.commiTransaction();
	
}

@Override
public Student findStudentById(int id) {
	// no need of transaction,as its an read operation
	Student student=dao.getStudentById(id);
	return student;
}
}


/*
create database demo;
use demo;
create table student(
studentId INT NOT NULL,
 name VARCHAR(45) NOT NULL,
 PRIMARY KEY (studentId)
);
select * from student;
insert into student values(20,"Disha"); 
*/
