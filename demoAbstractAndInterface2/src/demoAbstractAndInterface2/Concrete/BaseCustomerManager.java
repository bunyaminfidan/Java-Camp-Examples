package demoAbstractAndInterface2.Concrete;

import demoAbstractAndInterface2.Abstract.CustomerService;
import demoAbstractAndInterface2.Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : "+ customer.getFirstName() + " "+ customer.getLastName());
		
	}

}
