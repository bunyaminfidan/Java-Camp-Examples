package javaCamp.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javaCamp.hmrs.business.abstracts.UserService;
import javaCamp.hmrs.dataAccess.abstracts.UserDao;
import javaCamp.hmrs.entites.concretes.User;

@Service
public class UserManager  implements UserService{
	
	
	UserDao userDao;
	

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}

}
