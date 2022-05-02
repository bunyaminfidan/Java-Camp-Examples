package demoAbstractAndInterface2.Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import demoAbstractAndInterface2.Abstract.PersonCheckService;
import demoAbstractAndInterface2.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		boolean result = true;

		try {

			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(new Locale("tr")),
					customer.getLastName().toUpperCase(new Locale("tr")), customer.getDateOfBirth().getYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}

}
