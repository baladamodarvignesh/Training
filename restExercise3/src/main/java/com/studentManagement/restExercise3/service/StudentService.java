/**
 * 
 */
package com.studentManagement.restExercise3.service;

import java.util.List;

import com.studentManagement.restExercise3.bean.Student;

/**
 * @author balavign
 *
 */
public interface StudentService {
	
	public List<Student> getAllStudents();
	public Student getStudentByRegisterNumber(int registerNumber);
	public String saveStudent(List<Student> data);
	public String updateStudent(int registerNumber,Student data);
	public String deleteStudent(int registerNumber);

}
