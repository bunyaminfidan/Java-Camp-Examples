package gameProject.DataAccess.Concrete;

import gameProject.DataAccess.Abstract.GamerDao;
import gameProject.Entities.Concrete.Gamer;

public class GamerDaoHibernate implements GamerDao {

	@Override
	public void add(Gamer gamer) {
	System.out.println("Oyuncu eklendi : "+ gamer.getFirstName() + " "+ gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu bilgiler güncellendi : "+ gamer.getFirstName() + " "+ gamer.getLastName());
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : "+ gamer.getFirstName() + " "+ gamer.getLastName());
		
		
	}

}
