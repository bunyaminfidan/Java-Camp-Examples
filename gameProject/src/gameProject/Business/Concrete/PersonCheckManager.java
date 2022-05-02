package gameProject.Business.Concrete;


import java.util.Locale;

import gameProject.Business.Abstract.PersonCheckService;
import gameProject.Entities.Concrete.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class PersonCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {

		return true;
	}

}
