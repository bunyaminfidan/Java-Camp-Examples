package gameProject.Business.Abstract;

import gameProject.Entities.Concrete.Gamer;

public interface PersonCheckService {
	
	boolean checkIfRealPerson(Gamer gamer);

}
