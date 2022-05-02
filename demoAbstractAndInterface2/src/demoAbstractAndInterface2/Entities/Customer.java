package demoAbstractAndInterface2.Entities;

import java.sql.Date;

import demoAbstractAndInterface2.Abstract.Entity;

public class Customer implements Entity {
	private int id;
	private String NationalityId;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;

	public Customer() {
		super();
	}

	public Customer(int id, String nationalityId, String firstName, String lastName, Date dateOfBirth) {
		super();
		this.id = id;
		NationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
