/**
 * 
 */
package com.studentManagement.restExercise3.controller;

import java.util.List;

import javax.validation.ReportAsSingleViolation;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentManagement.restExercise3.bean.Student;
import com.studentManagement.restExercise3.service.StudentService;

/**
 * @author balavign
 *
 */
@RestController
@RequestMapping(value = "/Student")
public class StudentController {

	public static final String SUCCESS = "OPERATION SUCCESS";
	public static final String FAILED = "OPERATION FAILED";

	@Autowired
	StudentService service;

	@GetMapping(value = "/all")
	public List<Student> getStudentList() {

		return service.getAllStudents();

	}

	@GetMapping(value = "/specific/{id}")
	public Student getStudentById(@PathVariable(value = "id") int registerNumber) {
		return service.getStudentByRegisterNumber(registerNumber);

	}

	@PostMapping("/create")
	public String createStudentDocument(@RequestBody List<Student> studentList) {
		String s = service.saveStudent(studentList);
		if (s.equals("S")) {
			return SUCCESS;
		} else {
			return FAILED;
		}
	}
	@PutMapping("/update/{id}")
	public String updateStudent(@PathVariable(value= "id")int registerNumber,@RequestBody Student u)
	{
		String s = service.updateStudent(registerNumber, u);
		if (s.equals("S")) {
			return SUCCESS;
		} else {
			return FAILED;
		}
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudentById(@PathVariable(value="id")int registerNumber)
	{
		String s=service.deleteStudent(registerNumber);
		if (s.equals("S")) {
			return SUCCESS;
		} else {
			return FAILED;
		}
	}
	
	

}
