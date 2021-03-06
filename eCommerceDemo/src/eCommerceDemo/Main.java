package eCommerceDemo;

import eCommerceDemo.business.abstracts.IndividualService;
import eCommerceDemo.business.concretes.CorporateUserManager;
import eCommerceDemo.business.concretes.IndividualUserManager;
import eCommerceDemo.core.utilities.log.EmailLogManager;
import eCommerceDemo.core.utilities.login.EmailLoginManager;
import eCommerceDemo.core.utilities.login.GoogleLoginManagerAdapter;
import eCommerceDemo.core.utilities.login.HibernateEmailLogin;
import eCommerceDemo.core.utilities.login.LoginService;
import eCommerceDemo.core.utilities.toolKits.PrintlnShortcut;
import eCommerceDemo.dataAccess.concretes.HibernateBaseUser;
import eCommerceDemo.entities.concretes.Corporate;
import eCommerceDemo.entities.concretes.Individual;

public class Main {

	public static void main(String[] args) {

		IndividualService individualService = new IndividualUserManager(new HibernateBaseUser(), new EmailLogManager());
		//CorporateService corporateService = new CorporateUserManager(new HibernateBaseUser(), new EmailLogManager());
		
		LoginService loginService = new EmailLoginManager(new HibernateEmailLogin());
		LoginService googleLoginService = new GoogleLoginManagerAdapter();
		
		
		
		Individual bunyamin = new Individual();

		bunyamin.setId(1);
		bunyamin.setUserId(1);
		bunyamin.setFirstName("Bunyamin");
		bunyamin.setLastName("F?DAN");
		bunyamin.setEmail("bunyaminfidan11@gmail.com");
		bunyamin.setNationalityId("11111111111");
		bunyamin.setPassword("123456");
		
		individualService.add(bunyamin);
		individualService.verify(bunyamin);
		
		//Mail ile giri?
		loginService.login(bunyamin.getEmail(), bunyamin.getPassword());
		
		//D?? servis ile giri? 
		googleLoginService.login(bunyamin.getEmail(), bunyamin.getPassword());
		
		

//		Corporate buketinMarketi = new Corporate();
//		buketinMarketi.setId(1);
//		buketinMarketi.setUserId(1);
//		buketinMarketi.setEmail("buketinmarketi@gmail.com");
//		buketinMarketi.setPassword("123456");
//		buketinMarketi.setTaxNumber(1234567);
//		corporateService.add(buketinMarketi);
//		corporateService.verify(buketinMarketi);

	}

}
