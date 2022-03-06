package eCommerceSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSystem.dataAccess.abstracts.ProductDao;
import eCommerceSystem.entities.concretes.User;

public class HibernateProductDao implements ProductDao{
	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		System.out.println("User has been registered with HibernatProductDao : " + user.geteMail());
	}

	@Override
	public void enter(User user, String eMail, String password) {
		System.out.println("User has been entered successfully.");
		
	}

	/*@Override
	public List<User> userList() {
		
		return users;
		
	}*/

}
