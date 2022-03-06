package eCommerceSystem;



import eCommerceSystem.business.abstracts.CheckService;
import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.business.concretes.CheckManager;
import eCommerceSystem.business.concretes.UserManager;
import eCommerceSystem.core.GoogleManager;
import eCommerceSystem.dataAccess.concretes.HibernateProductDao;
import eCommerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User("Evren","Yiðit","evrenyigit20@gmail.com","12131415");
		User user1 = new User("Evren","Yiðit","evrenyigit20@gmail.com","12131415");
		User user2 = new User("Evren","Yiðit","evrenyigit200@gmail.com","12131415");
		
		UserService userManager = new UserManager(new CheckManager(),new HibernateProductDao(),new GoogleManager());
		userManager.add(user);
		userManager.add(user1);
		userManager.enter(user, "evrenyigit20@gmail.com", "12131415");
		userManager.enter(user1, "evrenyigit19@gmail.com", "12131415");
		userManager.enterWGoogle("evrenyigit96@hotmail.com");
		

	}

}
