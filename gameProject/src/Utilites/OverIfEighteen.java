package Utilites;

import gameProject.Entities.Concrete.Gamer;

public class OverIfEighteen {

	public static boolean overIfEighteen(Gamer gamer) {

		if (gamer.getDateofBirth().getYear() > 18) {
			return true;
		} else {
			return false;
		}

	}
}
