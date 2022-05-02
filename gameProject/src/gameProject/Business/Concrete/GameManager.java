package gameProject.Business.Concrete;

import Utilites.DiscountRateCalculator;
import Utilites.OverIfEighteen;
import gameProject.Business.Abstract.GameService;
import gameProject.DataAccess.Abstract.CampaignDao;
import gameProject.DataAccess.Abstract.GameDao;
import gameProject.Entities.Concrete.Campaign;
import gameProject.Entities.Concrete.Game;
import gameProject.Entities.Concrete.Gamer;

public class GameManager implements GameService {

	GameDao gameDao;

	public GameManager(GameDao gameDao) {

		this.gameDao = gameDao;
	}

	@Override
	public void buy(Gamer gamer, Game game) {

		if (OverIfEighteen.overIfEighteen(gamer)) {

			this.gameDao.buy(gamer, game);
	
		} else {
			System.out.println("Bu oyun için yaþýnýz uygun deðil.");
		}

	}

	@Override
	public void rent(Gamer gamer, Game game) {
		if (OverIfEighteen.overIfEighteen(gamer)) {

			this.gameDao.rent(gamer, game);

		} else {
			System.out.println("Bu oyun için yaþýnýz uygun deðil.");
		}

	}

	@Override
	public void buyCampaign(Gamer gamer, Game game, Campaign campaign) {
		if (OverIfEighteen.overIfEighteen(gamer)) {

			game.setUnitPrice(DiscountRateCalculator.discountRateCalculator(game, campaign));

			this.gameDao.buy(gamer, game);
			

		} else {
			System.out.println("Bu oyun için yaþýnýz uygun deðil.");
		}

	}

	@Override
	public void rentCampaign(Gamer gamer, Game game, Campaign campaign) {
		if (OverIfEighteen.overIfEighteen(gamer)) {
			DiscountRateCalculator.discountRateCalculator(game, campaign);

			this.gameDao.rent(gamer, game);
		} else {
			System.out.println("Bu oyun için yaþýnýz uygun deðil.");
		}

	}

}
