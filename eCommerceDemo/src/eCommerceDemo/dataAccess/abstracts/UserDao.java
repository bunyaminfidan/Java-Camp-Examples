package eCommerceDemo.dataAccess.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {
	
	void add(User user);

	void delete(User user);

	void update(User user);
	void verify(User user);

}
