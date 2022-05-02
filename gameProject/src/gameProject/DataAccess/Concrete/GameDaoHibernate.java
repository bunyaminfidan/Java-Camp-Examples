package gameProject.DataAccess.Concrete;

import gameProject.DataAccess.Abstract.GameDao;
import gameProject.Entities.Concrete.Game;
import gameProject.Entities.Concrete.Gamer;

public class GameDaoHibernate implements GameDao {

	@Override
	public void buy(Gamer gamer, Game game) {

		System.out.println("Oyun sat�n al�nd�: " + game.getName() + " Kullan�c�: " + gamer.getFirstName()+ " - "+game.getUnitPrice() + " TL");
	}

	@Override
	public void rent(Gamer gamer, Game game) {
		System.out.println("Oyun kiraland� : " + game.getName() + " Kullan�c�: " + gamer.getFirstName()+ " - "+game.getUnitPrice() + " TL");

	}

}
