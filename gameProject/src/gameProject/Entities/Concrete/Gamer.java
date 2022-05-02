package gameProject.Entities.Concrete;

import java.sql.Date;

import gameProject.Entities.Abstract.Entity;

public class Gamer implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private Date dateofBirth;
	
	
	public Gamer() {
		super();
	}
	
	public Gamer(int id, String firstName, String lastName, String nationalityId, Date dateofBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateofBirth = dateofBirth;
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
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public Date getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}



}
