package absractAndInterfaceCoffeeDemo.Concrete;

import absractAndInterfaceCoffeeDemo.Abstract.CustomerService;
import absractAndInterfaceCoffeeDemo.Abstract.PersonCheckService;
import absractAndInterfaceCoffeeDemo.Entities.Customer;

public class PersonCheckManager  implements  PersonCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
		
	}



}
