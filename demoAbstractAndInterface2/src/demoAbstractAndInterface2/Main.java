package demoAbstractAndInterface2;

import java.sql.Date;

import demoAbstractAndInterface2.Adapters.MernisServiceAdapter;
import demoAbstractAndInterface2.Concrete.BaseCustomerManager;
import demoAbstractAndInterface2.Concrete.NeroCustomerManager;
import demoAbstractAndInterface2.Concrete.StarbucksCustomerManager;
import demoAbstractAndInterface2.Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		Customer bunyamin = new Customer();
		Customer buket = new Customer();
		

		
		bunyamin.setId(1);
		bunyamin.setFirstName("Bünyamin");
		bunyamin.setLastName("FÝDAN");
		bunyamin.setNationalityId("1111111111");
		bunyamin.setDateOfBirth(new Date(1990, 05, 15));

		baseCustomerManager.add(bunyamin);

	}

}
