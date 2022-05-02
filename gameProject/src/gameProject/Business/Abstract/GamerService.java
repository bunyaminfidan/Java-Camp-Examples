package gameProject.Business.Abstract;

import gameProject.Entities.Concrete.Gamer;

public interface GamerService {
	
	void add(Gamer gamer);
	
	void update(Gamer gamer);
	
	void delete(Gamer gamer);

}
