package eCommerceDemo.core.utilities.login;

import eCommerceDemo.core.utilities.outSource.GoogleAuthentication;

public class GoogleLoginManagerAdapter implements LoginService {
	
	GoogleAuthentication googleAuthentication = new GoogleAuthentication();



	@Override
	public void login(String email, String password) {

		
		googleAuthentication.authentication(email, password);

	}

}
