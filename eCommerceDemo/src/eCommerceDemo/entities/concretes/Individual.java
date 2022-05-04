package eCommerceDemo.entities.concretes;

import eCommerceDemo.entities.abstracts.Entity;

public class Individual extends User implements Entity {

	private int id;
	private int userId;
	private String firstName;
	private String lastName;
	private String nationalityId;
	

	public Individual() {
		super();
	}

	public Individual(int id, int userId, String firstName, String lastName, String nationalityId) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
