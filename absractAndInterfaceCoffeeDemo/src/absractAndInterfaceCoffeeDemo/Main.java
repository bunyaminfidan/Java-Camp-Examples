package absractAndInterfaceCoffeeDemo;

import java.sql.Date;

import absractAndInterfaceCoffeeDemo.Abstract.BaseCustomerManager;
import absractAndInterfaceCoffeeDemo.Abstract.PersonCheckService;
import absractAndInterfaceCoffeeDemo.Concrete.NeroCustomerManager;
import absractAndInterfaceCoffeeDemo.Concrete.PersonCheckManager;
import absractAndInterfaceCoffeeDemo.Concrete.StarbucksCustomerManager;
import absractAndInterfaceCoffeeDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new PersonCheckManager());
		Customer bunyamin = new Customer();
		bunyamin.setId(1);
		bunyamin.setFirstName("Bünyamin");
		bunyamin.setLastName("FÝDAN");
		bunyamin.setDateOfBirth(new Date(1994, 02, 15));
		bunyamin.setNationalityId("32270047904");

		baseCustomerManager.add(bunyamin);

	}

}
