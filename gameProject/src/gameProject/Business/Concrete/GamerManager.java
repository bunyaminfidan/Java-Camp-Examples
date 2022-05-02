package gameProject.Business.Concrete;

import gameProject.Business.Abstract.GamerService;
import gameProject.DataAccess.Abstract.GamerDao;
import gameProject.Entities.Concrete.Gamer;

public class GamerManager implements GamerService{
	GamerDao gamerDao;

	public GamerManager(GamerDao gamerDao) {
		
		this.gamerDao = gamerDao;
	}

	@Override
	public void add(Gamer gamer) {
		gamerDao.add(gamer);
		
	}

	@Override
	public void update(Gamer gamer) {
		gamerDao.update(gamer);
		
	}

	@Override
	public void delete(Gamer gamer) {
		gamerDao.delete(gamer);
		
	}

	
}
