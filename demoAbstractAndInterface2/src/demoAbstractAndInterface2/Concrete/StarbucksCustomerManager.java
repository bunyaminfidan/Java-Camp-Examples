package demoAbstractAndInterface2.Concrete;

import demoAbstractAndInterface2.Abstract.PersonCheckService;
import demoAbstractAndInterface2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	PersonCheckService checkService;

	public StarbucksCustomerManager(PersonCheckService checkService) {
		super();
		this.checkService = checkService;
	}

	@Override
	public void add(Customer customer) {

		if (this.checkService.checkIfRealPerson(customer)) {
			super.add(customer);
		} else {
			System.out.println("Kimlik bilgileri yanlýþ, müþteri eklenemedi.");
		}

	}

}
