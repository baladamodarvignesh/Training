/**
 * 
 */
package com.userManagement.bean;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 

/**
 * @author balavign
 *
 */
//@XmlRootElement(name = "user") 
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String profession;

	public User(){} 
	
	/**
	 * @param id
	 * @param name
	 * @param profession
	 */
	public User(int id, String name, String profession) {
		
		this.id = id;
		this.name = name;
		this.profession = profession;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
//	@XmlElement
	public void setId(int id) {
		this.id = id;
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
//	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * @param profession the profession to set
	 */
//	@XmlElement
	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((profession == null) ? 0 : profession.hashCode());
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
		User other = (User) obj;
		if (id != other.id)
			return false;

		return true;
	}

}
