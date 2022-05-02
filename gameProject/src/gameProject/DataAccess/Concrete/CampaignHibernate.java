package gameProject.DataAccess.Concrete;

import gameProject.DataAccess.Abstract.CampaignDao;
import gameProject.Entities.Concrete.Campaign;

public class CampaignHibernate implements CampaignDao {

	@Override
	public void add(Campaign campaign) {

		System.out.println("Kampanya eklendi : " + campaign.getName());

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi : " + campaign.getName());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silinid : " + campaign.getName());

	}

}
