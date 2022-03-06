package eCommerceSystem.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import eCommerceSystem.business.abstracts.CheckService;
import eCommerceSystem.dataAccess.abstracts.ProductDao;
import eCommerceSystem.entities.concretes.User;

public class CheckManager implements CheckService{
	List<String> userMails = new ArrayList<String>();
	List<String> passwords = new ArrayList<String>();
	private static final String emailPattern = "^[a-z\\d\\.-]+@[a-z\\d-]+\\.[a-z]{2,8}$";


	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().length()<6) {
			System.out.println("Length of password needs to be more than 5 characters.");
			return false;
		}
		passwords.add(user.getPassword());
		return true;
		
	}

	@Override
	public boolean checkEMail(User user) {
		
		if(user.geteMail().isEmpty()) {
			System.out.println("You need to enter any email address.");
			return false;
		}
		for(String x:userMails) {
			if(user.geteMail()==x) {
			System.out.println("This email address is already registered.");
			return false;
			}
		}
	
		Pattern pattern = Pattern.compile(emailPattern)	;
		if(pattern.matcher(user.geteMail()).matches()){
			userMails.add(user.geteMail());
			return true;
		}
		return false;
	}

	@Override
	public boolean checkName(User user) {
		
		if (user.getName().length()<2) {
			System.out.println("Length of name needs to be more than 2 characters.");
			return false;
		}
		return true;
		
	}

	@Override
	public boolean checkLastName(User user) {
		
		if (user.getLastName().length()<2) {
			System.out.println("Length of last name needs to be more than 2 characters.");
			return false;
		}
		return true;
		
	}

	@Override
	public boolean checkUserAdd(User user) {
		if (checkLastName(user)&checkName(user)&checkEMail(user)&checkPassword(user)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkUserEnter(User user, String email, String password) {
		if(user.geteMail().equals(email)&&user.getPassword().equals(password))
		return true;
	return false;
	}

	@Override
	public boolean checkGoogle(String eMail) {
		
		Pattern pattern = Pattern.compile(emailPattern);
		if(pattern.matcher(eMail).matches()) {
			userMails.add(eMail);
			return true;
		}
		return false;
	}

}