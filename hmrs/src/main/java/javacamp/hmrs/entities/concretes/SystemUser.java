package javacamp.hmrs.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//import lombok.EqualsAndHashCode;
//@EqualsAndHashCode(callSuper=false)
@Entity
@Data
@Table(name = "SystemUsers")
public class SystemUser extends User {

	@Id
	@Column(name = "UserId")
	private int userId;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "LastName")
	private String lastName;

	@Column(name = "NationalityId")
	private String nationalityId;

	@Column(name = "DateOfBirth")
	private Date dateOfBirth;

}
