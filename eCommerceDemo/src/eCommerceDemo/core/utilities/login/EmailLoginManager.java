package eCommerceDemo.core.utilities.login;

import eCommerceDemo.core.utilities.messages.UserAspectMessages;
import eCommerceDemo.core.utilities.toolKits.PrintlnShortcut;
import eCommerceDemo.core.utilities.validatorr.EmailCheck;
import eCommerceDemo.core.utilities.validatorr.PasswordCheck;

public class EmailLoginManager implements LoginService {

	LoginDao loginDao;

	public EmailLoginManager(LoginDao loginDao) {
		super();
		this.loginDao = loginDao;
	}

	String email = "bunyaminfidan11@gmail.com";
	String password = "123456";

	@Override
	public void login(String email, String password) {

		if (!EmailCheck.emailNotEmpty(email)) {

			PrintlnShortcut.printlnShortcut(UserAspectMessages.EmailNotEmpty);
			return;

		} else if (!EmailCheck.emailTypeQuery(email)) {
			PrintlnShortcut.printlnShortcut(UserAspectMessages.EmailTypeQuery);
			return;
		} else if (!PasswordCheck.passwordCheck(password)) {
			PrintlnShortcut.printlnShortcut(UserAspectMessages.PasswordLength);
			return;
		} else if (!EmailCheck.sameEmail(this.email, email)) {
			PrintlnShortcut.printlnShortcut(UserAspectMessages.WrongEmail);
			return;
		} else if (!PasswordCheck.samePassword(this.password, password)) {
			PrintlnShortcut.printlnShortcut(UserAspectMessages.WrongPassword);
			return;
		} else {
			PrintlnShortcut.printlnShortcut(UserAspectMessages.SuccessToBusiness);
			loginDao.login(email, password);

		}

	}

}
