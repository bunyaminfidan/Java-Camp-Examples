package eCommerceDemo.core.utilities.login;

import eCommerceDemo.core.utilities.messages.UserAspectMessages;
import eCommerceDemo.core.utilities.toolKits.PrintlnShortcut;

public class HibernateEmailLogin implements LoginDao {

	@Override
	public void login(String email, String password) {
	
	PrintlnShortcut.printlnShortcut(UserAspectMessages.SuccessLogin);	
	}

}
