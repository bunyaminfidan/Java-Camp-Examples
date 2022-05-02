package gameProject.DataAccess.Abstract;

import gameProject.Entities.Concrete.Campaign;

public interface CampaignDao {

	void add(Campaign campaign);

	void update(Campaign campaign);

	void delete(Campaign campaign);

}
