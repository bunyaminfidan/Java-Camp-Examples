package eCommerceDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.utilities.log.LogService;
import eCommerceDemo.core.utilities.messages.UserAspectMessages;
import eCommerceDemo.core.utilities.toolKits.PrintlnShortcut;
import eCommerceDemo.core.utilities.validatorr.EmailCheck;
import eCommerceDemo.core.utilities.validatorr.PasswordCheck;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.Individual;
import eCommerceDemo.entities.concretes.User;

public class BaseUserManager implements UserService {
	List<String> registeredEmailAdresesList = new ArrayList<String>();

	UserDao userDao;
	LogService logService;

	public BaseUserManager(UserDao userDao, LogService logService) {
		super();
		this.userDao = userDao;
		this.logService = logService;

	}

	@Override
	public void add(User user) {

		registeredEmailAdresesList.add("bunyaminfidan@gmail.com");

		if (!PasswordCheck.passwordCheck(user.getPassword())) {
			PrintlnShortcut.printlnShortcut(UserAspectMessages.PasswordLength);
			return;
		} else if (EmailCheck.emailNotEmpty(user.getEmail())) {
			PrintlnShortcut.printlnShortcut(UserAspectMessages.EmailNotEmpty);
			return;
		} else if (!EmailCheck.emailTypeQuery(user.getEmail())) {
			PrintlnShortcut.printlnShortcut(UserAspectMessages.EmailTypeQuery);
			return;
		} else if (EmailCheck.ifRegisteredEmailAddresses(user.getEmail(), registeredEmailAdresesList)) {
			PrintlnShortcut.printlnShortcut(UserAspectMessages.RegisteredEmailAddresses);
			return;
		} else {
			this.registeredEmailAdresesList.add(user.getEmail());
			PrintlnShortcut.printlnShortcut(UserAspectMessages.SuccessToBusiness);
			userDao.add(user);
			logService.log(UserAspectMessages.AddToSuccess + ". Size gönderilen mailde ki doðrulama linkine týklayýnýz.");

		}

	}

	@Override
	public void update(User user) {
		registeredEmailAdresesList.add("bunyaminfidan@gmail.com");

		if (!PasswordCheck.passwordCheck(user.getPassword())) {
			PrintlnShortcut.printlnShortcut(UserAspectMessages.PasswordLength);
			return;
		} else if (EmailCheck.emailNotEmpty(user.getEmail())) {
			PrintlnShortcut.printlnShortcut(UserAspectMessages.EmailNotEmpty);
			return;
		} else if (!EmailCheck.emailTypeQuery(user.getEmail())) {
			PrintlnShortcut.printlnShortcut(UserAspectMessages.EmailTypeQuery);
			return;
		} else if (EmailCheck.ifRegisteredEmailAddresses(user.getEmail(), registeredEmailAdresesList)) {
			PrintlnShortcut.printlnShortcut(UserAspectMessages.RegisteredEmailAddresses);
			return;
		} else {
			this.registeredEmailAdresesList.add(user.getEmail());
			PrintlnShortcut.printlnShortcut(UserAspectMessages.SuccessToBusiness);
			userDao.update(user);
		}

	}

	@Override
	public void delete(User user) {
		PrintlnShortcut.printlnShortcut(UserAspectMessages.SuccessToBusiness);
		userDao.delete(user);


	}

	@Override
	public void verify(User user) {
		PrintlnShortcut.printlnShortcut(UserAspectMessages.SuccessToBusiness);
		userDao.verify(user);

		
	}

}
