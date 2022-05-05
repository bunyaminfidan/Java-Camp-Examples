package eCommerceDemo.core.utilities.validatorr;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {

	public static boolean emailNotEmpty(String email) {

		if (email != "") {
			return true;
		}else {
			return false;
		}
		

	}

	public static boolean emailTypeQuery(String email) {
		Pattern validEmailAdressRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);

		Matcher matcher = validEmailAdressRegex.matcher(email);
		return matcher.find();

	}

	public static boolean ifRegisteredEmailAddresses(String email, List<String> emailList) {

		boolean isRegistered = emailList.contains(email);

		if (isRegistered) {
			return true;
		} else {
			return false;
		}

	}
	
	public static boolean sameEmail(String registeredEmail, String enteredEmail) {

		if (registeredEmail == enteredEmail) {

			return true;
		}

		return false;
	}
	


}
