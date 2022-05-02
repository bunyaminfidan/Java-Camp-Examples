import java.sql.Date;

import Adapter.MernisCheckManager;
import gameProject.Business.Abstract.CampaignService;
import gameProject.Business.Abstract.GameService;
import gameProject.Business.Abstract.GamerService;
import gameProject.Business.Concrete.CampaignManager;
import gameProject.Business.Concrete.GameManager;
import gameProject.Business.Concrete.GamerManager;
import gameProject.DataAccess.Abstract.CampaignDao;
import gameProject.DataAccess.Abstract.GameDao;
import gameProject.DataAccess.Concrete.CampaignHibernate;
import gameProject.DataAccess.Concrete.GameDaoHibernate;
import gameProject.DataAccess.Concrete.GamerDaoHibernate;
import gameProject.Entities.Concrete.Campaign;
import gameProject.Entities.Concrete.Game;
import gameProject.Entities.Concrete.Gamer;

public class Main {

	public static void main(String[] args) {

		Gamer bunyamin = new Gamer();
		bunyamin.setId(1);
		bunyamin.setFirstName("Bünyamin");
		bunyamin.setLastName("FÝDAN");
		bunyamin.setNationalityId("32270047904");
		bunyamin.setDateofBirth(new Date(1994, 02, 15));

		Game pubg = new Game();
		pubg.setId(1);
		pubg.setName("PUBG");
		pubg.setDetail("Savaþ oyunu");
		pubg.setReleaseYear(new Date(2018, 01, 01));
		pubg.setUnitPrice(200);

		Campaign summerCampaign = new Campaign();
		summerCampaign.setId(1);
		summerCampaign.setName("Yaz Kampanyasý");
		summerCampaign.setRate(20);
		summerCampaign.setExpriyDate(new Date(2022, 12, 12));

		CampaignService campaignService = new CampaignManager(new CampaignHibernate());
		campaignService.add(summerCampaign);

		GamerService gamerService = new GamerManager(new GamerDaoHibernate(), new MernisCheckManager());
		gamerService.add(bunyamin);

		GameService gameService = new GameManager(new GameDaoHibernate());
		// gameService.buy(bunyamin, pubg);
		gameService.buyCampaign(bunyamin, pubg, summerCampaign);

	}

}
