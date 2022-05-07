package javacamp.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EmployerUsers")
public class EmployerUser extends User {
	
	@Id
	@Column(name="UserId")
	private int userId;
	
	@Column(name="CompnayName")
	private String companyName;
	
	@Column(name="WebSite")
	private String webSite;

	@Column(name="PhoneNumber")
	private String phoneNumber;
}
