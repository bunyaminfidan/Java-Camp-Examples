package gameProject.Business.Concrete;

import gameProject.Business.Abstract.CampaignService;
import gameProject.DataAccess.Abstract.CampaignDao;
import gameProject.Entities.Concrete.Campaign;

public class CampaignManager implements CampaignService {

	CampaignDao campaignDao;

	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		this.campaignDao.add(campaign);

	}

	@Override
	public void update(Campaign campaign) {
		this.campaignDao.update(campaign);

	}

	@Override
	public void delete(Campaign campaign) {
		this.campaignDao.delete(campaign);

	}

}
