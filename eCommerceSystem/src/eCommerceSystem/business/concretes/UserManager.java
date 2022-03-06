package eCommerceSystem.business.concretes;

import eCommerceSystem.business.abstracts.CheckService;
import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.core.GoogleService;
import eCommerceSystem.dataAccess.abstracts.ProductDao;
import eCommerceSystem.entities.concretes.User;

public class UserManager implements UserService {
	
	private CheckService checkService;
	private ProductDao productDao;
	private GoogleService googleService;
	
	public UserManager(CheckService checkService,ProductDao productDao,GoogleService googleService) {
		super();
		this.checkService = checkService;
		this.productDao = productDao;
		this.googleService = googleService;
	}

	@Override
	public void add(User user) {
		if(checkService.checkUserAdd(user)) {
			System.out.println("Email has been sent to verify " + user.geteMail());
			this.productDao.add(user);
		}
		else {
			System.out.println("Information of user does not match");
		}
		
	}

	@Override
	public void enter(User user , String eMail , String password) {
		if(checkService.checkUserEnter(user, eMail, password)) {
			this.productDao.enter(user, eMail, password);
		}
		else {
			System.out.println("Wrong informations. Try again.");
		}
		
	}

	@Override
	public void enterWGoogle(String eMail) {
		if(checkService.checkGoogle(eMail)) {
			this.googleService.LoginwGoogle(eMail);
		}
		else {
			System.out.println("Wrong google mail address.");
		}
		
		
	}

}
