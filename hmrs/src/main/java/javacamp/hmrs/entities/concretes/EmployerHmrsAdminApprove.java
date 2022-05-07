package javacamp.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "EmployerHmrsAdminApproves")
public class EmployerHmrsAdminApprove extends Approve {

	@Id
	@Column(name = "ApproveId")
	private int approveId;

	@Column(name = "ApprovedHmrsUserId")
	private int approvedHmrsUserId;

}
