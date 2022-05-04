package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.Individual;

public interface IndividualService extends UserService {

	void add(Individual individual);
	
	void update(Individual individual);
	
	void delete(Individual individual);


}
