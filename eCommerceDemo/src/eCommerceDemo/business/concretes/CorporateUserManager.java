package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.CorporateService;
import eCommerceDemo.core.utilities.log.LogService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.Corporate;

public class CorporateUserManager extends BaseUserManager implements CorporateService {



	public CorporateUserManager(UserDao userDao, LogService logService) {
		super(userDao, logService);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Corporate corporate) {

		super.add(corporate);

	}

	@Override
	public void update(Corporate corporate) {
	super.update(corporate);
		
	}

	@Override
	public void delete(Corporate corporate) {
		super.delete(corporate);
		
	}

}
