package javaCamp.hmrs.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import javaCamp.hmrs.business.abstracts.SystemUserService;
import javaCamp.hmrs.dataAccess.abstracts.SystemUserDao;
import javaCamp.hmrs.dataAccess.abstracts.UserDao;
import javaCamp.hmrs.entites.concretes.SystemUser;
import javaCamp.hmrs.entites.concretes.User;

@Service
public class SystemUserManager implements SystemUserService {

	@Autowired
	SystemUserDao systemUserDao;

	public SystemUserManager(SystemUserDao systemUserDao) {
		super();
		this.systemUserDao = systemUserDao;
	}

	@Override
	public List<SystemUser> getAllSystemUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
