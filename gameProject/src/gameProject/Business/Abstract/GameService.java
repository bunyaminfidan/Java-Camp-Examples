package gameProject.Business.Abstract;

import gameProject.Entities.Concrete.Campaign;
import gameProject.Entities.Concrete.Game;
import gameProject.Entities.Concrete.Gamer;

public interface GameService {

	void buy(Gamer gamer, Game game);

	void rent(Gamer gamer, Game game);

	void buyCampaign(Gamer gamer, Game game, Campaign campaign);

	void rentCampaign(Gamer gamer, Game game, Campaign campaign);

}
