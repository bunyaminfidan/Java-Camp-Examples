package absractAndInterfaceCoffeeDemo.Abstract;

import absractAndInterfaceCoffeeDemo.Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("Veritabanưna eklendi : " + customer.getFirstName());

	}

}
