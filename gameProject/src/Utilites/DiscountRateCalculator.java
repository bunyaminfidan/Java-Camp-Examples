package Utilites;

import gameProject.Entities.Concrete.Campaign;
import gameProject.Entities.Concrete.Game;
import gameProject.Entities.Concrete.Gamer;

public class DiscountRateCalculator {

	public static double discountRateCalculator(Game game, Campaign campaign) {

		double discountPrice = game.getUnitPrice() - (game.getUnitPrice() * campaign.getRate() / 100);

		return discountPrice;

	}

}
