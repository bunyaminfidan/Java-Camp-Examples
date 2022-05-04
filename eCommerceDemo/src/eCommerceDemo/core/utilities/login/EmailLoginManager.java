package eCommerceDemo.core.utilities.login;

public class EmailLoginManager implements LoginService {
	
	LoginDao loginDao;
	

	public EmailLoginManager(LoginDao loginDao) {
		super();
		this.loginDao = loginDao;
	}


	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub

	}

}
