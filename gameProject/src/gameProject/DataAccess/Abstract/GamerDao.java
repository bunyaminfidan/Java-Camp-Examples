package gameProject.DataAccess.Abstract;

import gameProject.Entities.Concrete.Gamer;

public interface GamerDao {
	void add (Gamer gamer);
	
	void update (Gamer gamer);
	
	void delete (Gamer gamer);

}
