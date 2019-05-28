/**
 * 
 */
package samplePrograms;

import java.io.Serializable;

/**
 * @author balavign
 *
 */
public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	
	public Student(Builder builder)
	{
		this.id=builder.id;
		this.name=builder.name;
	}
	
	public static class Builder{
		private int id;
		private String name;
		/**
		 * @return the id
		 */
		public static Builder init()
		{
			return new Builder();
		}
		public int getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public Builder setId(int id) {
			this.id = id;
			return this;
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
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Student build()
		{
			return new Student(this);
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(this.getId());
			builder.append(";");
			builder.append(this.getName());
			builder.append(",");
			return builder.toString();
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
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
			Builder other = (Builder) obj;
			if (id != other.id)
				return false;
			
			return true;
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.id);
		builder.append(";");
		builder.append(this.name);
		builder.append(",");
		return builder.toString();
	}

}
