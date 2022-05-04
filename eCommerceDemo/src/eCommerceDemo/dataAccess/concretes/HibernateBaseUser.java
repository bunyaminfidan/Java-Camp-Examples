package eCommerceDemo.dataAccess.concretes;

import eCommerceDemo.core.utilities.messages.UserAspectMessages;
import eCommerceDemo.core.utilities.toolKits.PrintlnShortcut;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateBaseUser implements UserDao {

	@Override
	public void add(User user) {

		PrintlnShortcut.printlnShortcut(UserAspectMessages.AddToSuccess);

	}

	@Override
	public void delete(User user) {
		PrintlnShortcut.printlnShortcut(UserAspectMessages.UpdateToSuccess);

	}

	@Override
	public void update(User user) {

		PrintlnShortcut.printlnShortcut(UserAspectMessages.DeleteToSuccess);

	}

	@Override
	public void verify(User user) {
		PrintlnShortcut.printlnShortcut(UserAspectMessages.SuccessVerify);

	}

}
