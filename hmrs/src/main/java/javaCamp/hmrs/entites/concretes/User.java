package javaCamp.hmrs.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="id", nullable = false)
	private int id;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="password", nullable = false)
	private String password;

}
