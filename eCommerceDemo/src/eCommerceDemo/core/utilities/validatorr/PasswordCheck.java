package eCommerceDemo.core.utilities.validatorr;


public class PasswordCheck {
	public static boolean passwordCheck(String password ) {

		if (password.length() > 5) {
			return true;
		} else {
			return false;
		}

	};

}
