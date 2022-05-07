
package javacamp.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "JobPositions")
public class JobPosition {

	@Id
	@GeneratedValue
	@Column(name = "Id")
	private int id;

	@Column(name = "Name")
	private String name;

}
