package javacamp.hmrs.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "JobSeekerMernisApproves")
public class JobSeekerMernisApprove extends Approve {
	
	@Id
	@Column(name ="ApprovedId")
	private int approvedId;
	
	

}
