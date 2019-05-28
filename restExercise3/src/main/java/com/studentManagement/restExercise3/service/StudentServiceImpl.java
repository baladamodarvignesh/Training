/**
 * 
 */
package com.studentManagement.restExercise3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.studentManagement.restExercise3.bean.Student;
import com.studentManagement.restExercise3.repository.StudentRepository;

/**
 * @author balavign
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentRepository repo;

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> students = repo.findAll();
		return students;
	}

	@Override
	public Student getStudentByRegisterNumber(int registerNumber) {
		// TODO Auto-generated method stub
		List<Student> students = getAllStudents();
		if (students != null)
			for (Student stud : students) {
				if (stud.getRegisterNumber() == registerNumber) {
					return stud;
				}
			}
		return null;
	}

	@Override
	public String saveStudent(List<Student> data) {
		// TODO Auto-generated method stub
		 List<Student> s=repo.saveAll(data);
		if (s != null) {
			return "S";
		} else {
			return "F";
		}

	}

	@Override
	public String updateStudent(int registerNumber, Student data) {
		// TODO Auto-generated method stub
		Student s = repo.save(data);
		if (s != null && StringUtils.hasText(s.getId())) {
			return "S";
		} else {
			return "F";
		}
	}

	@Override
	public String deleteStudent(int registerNumber) {
		// TODO Auto-generated method stub
		List<Student> students = getAllStudents();
		if (students != null) {
			for (Student stud : students) {
				if (stud.getRegisterNumber() == registerNumber) {
					repo.delete(stud);
					return "S";
				}
			}
		}

		return "F";
	}

}
