package gameProject.Business.Abstract;

import gameProject.Entities.Concrete.Campaign;

public interface CampaignService {

	void add(Campaign campaign);

	void update(Campaign campaign);

	void delete(Campaign campaign);
}
