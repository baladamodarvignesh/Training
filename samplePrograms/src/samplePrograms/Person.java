/**
 * 
 */
package samplePrograms;

/**
 * @author balavign
 *
 */
public class Person {
	
	private String name;
	private Double productRank;
	/**
	 * @param name
	 * @param productRank
	 */
	public Person(String name, Double productRank) {
		this.name = name;
		this.productRank = productRank;
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
	 * @return the productRank
	 */
	public Double getProductRank() {
		return productRank;
	}
	/**
	 * @param productRank the productRank to set
	 */
	public void setProductRank(Double productRank) {
		this.productRank = productRank;
	}

}
