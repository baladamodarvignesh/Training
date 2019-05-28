/**
 * 
 */
package com.studentManagement.restExercise3.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author balavign
 *
 */
@Document(collection = "ProfileInfo")
public class Student {
	@Id
	private String id;
	@Indexed(unique = true)
	private int registerNumber;
	private String name;
	private String department;
	/**
	 * @return the registerNumber
	 */
	
	public Student() {}
	


	/**
	 * @param id
	 * @param registerNumber
	 * @param name
	 * @param department
	 */
	public Student(String id, int registerNumber, String name, String department) {
		this.id = id;
		this.registerNumber = registerNumber;
		this.name = name;
		this.department = department;
	}






	public int getRegisterNumber() {
		return registerNumber;
	}
	/**
	 * @param registerNumber the registerNumber to set
	 */
	
	public void setRegisterNumber(int registerNumber) {
		this.registerNumber = registerNumber;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}



	@Override
	public String toString()
	{
		StringBuilder sb= new StringBuilder();
		sb.append("{");
		sb.append("RegisterNumber: ");
		sb.append(this.registerNumber);
		sb.append(",");
		sb.append("Name: ");
		sb.append(this.name);
		sb.append(",");
		sb.append("Department: ");
		sb.append(this.department);
		sb.append("}");
		return "";
		
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + registerNumber;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (registerNumber != other.registerNumber)
			return false;
		return true;
	}
	
}
