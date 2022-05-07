package javacamp.hmrs.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Approves")
public class Approve {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "UserId")
	private int userId;

	@Column(name = "ApprovalDate")
	private Date approvalDate;

}
