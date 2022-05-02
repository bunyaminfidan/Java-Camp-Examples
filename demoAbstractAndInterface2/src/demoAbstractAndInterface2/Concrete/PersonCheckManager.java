package demoAbstractAndInterface2.Concrete;

import demoAbstractAndInterface2.Abstract.PersonCheckService;
import demoAbstractAndInterface2.Entities.Customer;

public class PersonCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		System.out.println("checkIfRealPerson true");
		return true;

	}

}
