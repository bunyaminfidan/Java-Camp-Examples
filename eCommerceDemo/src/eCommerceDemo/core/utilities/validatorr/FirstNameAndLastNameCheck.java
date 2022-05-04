package eCommerceDemo.core.utilities.validatorr;


public class FirstNameAndLastNameCheck {

	public static boolean firstNameCheck(String firstName) {

		if (firstName.length() > 1) {
			return true;
		} else {
			return false;
		}

	};

	public static boolean lastNameCheck(String lastName ) {

		if (lastName.length() > 1) {
			return true;
		} else {
			return false;
		}

	};
	
	





}
