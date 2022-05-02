package absractAndInterfaceCoffeeDemo.Concrete;

import absractAndInterfaceCoffeeDemo.Abstract.BaseCustomerManager;
import absractAndInterfaceCoffeeDemo.Abstract.PersonCheckService;
import absractAndInterfaceCoffeeDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements PersonCheckService {

	PersonCheckService checkService;

	public StarbucksCustomerManager(PersonCheckService checkService) {

		this.checkService = checkService;
	}

	@Override
	public void add(Customer customer) {
		if (this.checkService.checkIfRealPerson(customer)) {
			System.out.println("Baþarýlý : " + customer.getFirstName());
			super.add(customer);
		} else {
			System.out.println("Kullanýcý doðrulanamadý : " + customer.getFirstName());
		}

	}

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}



}
