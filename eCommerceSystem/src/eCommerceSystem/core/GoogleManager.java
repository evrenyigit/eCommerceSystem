package eCommerceSystem.core;

import eCommerceSystem.google.GoogleLogger;

public class GoogleManager implements GoogleService{

	@Override
	public void LoginwGoogle(String eMail) {
		GoogleLogger googleLogger = new GoogleLogger();
		googleLogger.login(eMail);
		
	}

}
