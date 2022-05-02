import java.sql.Date;

import gameProject.Business.Abstract.GamerService;
import gameProject.Business.Concrete.GamerManager;
import gameProject.DataAccess.Concrete.GamerDaoHibernate;
import gameProject.Entities.Concrete.Gamer;

public class Main {

	public static void main(String[] args) {
	
		
		Gamer bunyamin = new Gamer();
		bunyamin.setId(1);
		bunyamin.setFirstName("Bünyamin");
		bunyamin.setLastName("FÝDAN");
		bunyamin.setNationalityId("32270047904");
		bunyamin.setDateofBirth(new Date(1994, 02, 15));
		
		
		GamerService gamerService = new GamerManager(new GamerDaoHibernate());
		gamerService.add(bunyamin); 
		
	}

}
