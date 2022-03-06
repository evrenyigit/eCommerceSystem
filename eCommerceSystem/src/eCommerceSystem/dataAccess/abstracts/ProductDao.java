package eCommerceSystem.dataAccess.abstracts;

import java.util.List;

import eCommerceSystem.entities.concretes.User;

public interface ProductDao {
	void add(User user);
	void enter(User user, String eMail, String password);
	//List<User> userList();
}
