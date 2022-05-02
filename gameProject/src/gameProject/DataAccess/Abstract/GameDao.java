package gameProject.DataAccess.Abstract;

import gameProject.Entities.Concrete.Game;
import gameProject.Entities.Concrete.Gamer;

public interface GameDao {

	void buy(Gamer gamer, Game game);
	
	void rent(Gamer gamer, Game game);
}
