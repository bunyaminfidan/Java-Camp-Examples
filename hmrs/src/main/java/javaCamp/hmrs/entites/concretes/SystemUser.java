package javaCamp.hmrs.entites.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "systemUsers")
@PrimaryKeyJoinColumn(name = "id")
public class SystemUser extends User {

	@Column(name = "firstName", nullable = false )
	private String firstName;

	@Column(name = "lastName", nullable = false)
	private String lastName;

	@Column(name = "nationalityId", nullable = false)
	private String nationalityId;

	@Column(name = "dateOfBirth", nullable = false)
	private Date dateOfBirth;

}
