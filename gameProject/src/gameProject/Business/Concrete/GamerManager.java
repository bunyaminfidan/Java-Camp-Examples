package gameProject.Business.Concrete;

import gameProject.Business.Abstract.GamerService;
import gameProject.Business.Abstract.PersonCheckService;
import gameProject.DataAccess.Abstract.GamerDao;
import gameProject.Entities.Concrete.Gamer;

public class GamerManager implements GamerService {
	GamerDao gamerDao;
	PersonCheckService checkService;

	public GamerManager(GamerDao gamerDao, PersonCheckService checkService) {

		this.gamerDao = gamerDao;
		this.checkService = checkService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if (checkService.checkIfRealPerson(gamer)) {
			gamerDao.add(gamer);
		} else {
			System.out.println("Kullanýcý bilgileri hatalý : " + gamer.getFirstName());
		}

	}

	@Override
	public void update(Gamer gamer) {
		
		if (checkService.checkIfRealPerson(gamer)) {
			gamerDao.update(gamer);
		} else {
			System.out.println("Kullanýcý bilgileri hatalý : " + gamer.getFirstName());
		}
		

	}

	@Override
	public void delete(Gamer gamer) {
		gamerDao.delete(gamer);

	}

}
