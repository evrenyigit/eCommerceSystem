package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void enter(User user, String eMail , String password);
	void enterWGoogle(String eMail);

}
