package Adapter;

import java.rmi.RemoteException;
import java.util.Locale;

import gameProject.Business.Abstract.PersonCheckService;
import gameProject.Entities.Concrete.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {

		boolean result = true;

		try {
			KPSPublicSoapProxy client = new KPSPublicSoapProxy();
			result = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(new Locale("tr")),
					gamer.getLastName().toUpperCase(new Locale("tr")), gamer.getDateofBirth().getYear());

		} catch (RemoteException e) {

			e.printStackTrace();
		}
		return result;
	}

}
