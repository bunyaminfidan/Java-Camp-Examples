package eCommerceDemo.entities.concretes;

import eCommerceDemo.entities.abstracts.Entity;

public class Corporate extends User implements Entity {

	private int id;
	private int userId;
	private String companyName;
	private int taxNumber;

	public Corporate() {
		super();
	}

	public Corporate(int id, int userId, String companyName, int taxNumber) {
		super();
		this.id = id;
		this.userId = userId;
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(int taxNumber) {
		this.taxNumber = taxNumber;
	}

}
