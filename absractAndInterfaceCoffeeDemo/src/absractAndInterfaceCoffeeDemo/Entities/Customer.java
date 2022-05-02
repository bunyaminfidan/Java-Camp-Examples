package absractAndInterfaceCoffeeDemo.Entities;

import java.sql.Date;

import absractAndInterfaceCoffeeDemo.Abstract.Entity;

public class Customer implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private String NationalityId;
	private Date dateOfBirth;

	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, String nationalityId, Date dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		NationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
