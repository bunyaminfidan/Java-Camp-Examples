package javacamp.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "JobSeekerEmailApproves")
public class JobSeekerEmailApprove extends Approve {

	@Id
	@Column(name = "ApprovedId")
	private int approvedId;

}
