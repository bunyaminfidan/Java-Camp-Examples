package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.IndividualService;
import eCommerceDemo.core.utilities.log.LogService;
import eCommerceDemo.core.utilities.messages.IndividualAspectMessages;
import eCommerceDemo.core.utilities.messages.UserAspectMessages;
import eCommerceDemo.core.utilities.toolKits.PrintlnShortcut;
import eCommerceDemo.core.utilities.validatorr.FirstNameAndLastNameCheck;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.Individual;
import eCommerceDemo.entities.concretes.User;

public class IndividualUserManager extends BaseUserManager implements IndividualService {

	public IndividualUserManager(UserDao userDao, LogService logService) {
		super(userDao, logService);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Individual individual) {

		if (!FirstNameAndLastNameCheck.firstNameCheck(individual.getFirstName())) {
			PrintlnShortcut.printlnShortcut(IndividualAspectMessages.FirstNameLength);
			return;
		} else if (!FirstNameAndLastNameCheck.lastNameCheck(individual.getLastName())) {
			PrintlnShortcut.printlnShortcut(IndividualAspectMessages.LastNameLength);
			return;
		}
		super.add(individual);

	}

	@Override
	public void update(Individual individual) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Individual individual) {
		// TODO Auto-generated method stub

	}

}
