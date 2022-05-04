package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.Corporate;

public interface CorporateService extends UserService {

	public void add(Corporate corporate);
	
	public void update(Corporate corporate);
	
	public void delete(Corporate corporate);

}
