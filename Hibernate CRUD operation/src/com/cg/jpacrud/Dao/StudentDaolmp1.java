package com.cg.jpacrud.Dao;

import com.cg.jpacrud.entities.Student;
  
public class StudentDaolmp1 implements StudentDao {
  
	public StudentDaolmp1() {
  JPAUtil.getEntitymanager();
}
@Override
public Student getStudentById(int id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void addStudent(Student student) {
	// TODO Auto-generated method stub
	
}
@Override
public void removeStudent(Student student) {
	// TODO Auto-generated method stub
	
}
@Override
public void updateStudent(Student student) {
	// TODO Auto-generated method stub
	
}
@Override
public void commiTransaction() {
	// TODO Auto-generated method stub
	
}
@Override
public void beginTransaction() {
	// TODO Auto-generated method stub
	
}
  
}
