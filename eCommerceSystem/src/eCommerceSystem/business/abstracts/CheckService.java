package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.concretes.User;

public interface CheckService {
	boolean checkPassword(User user);
	boolean checkEMail(User user);
	boolean checkName(User user);
	boolean checkLastName(User user);
	boolean checkUserAdd(User user);
	boolean checkUserEnter(User user,String email, String password);
	boolean checkGoogle(String eMail);
}
