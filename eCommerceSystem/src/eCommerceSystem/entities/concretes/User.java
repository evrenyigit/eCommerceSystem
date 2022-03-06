package eCommerceSystem.entities.concretes;

import eCommerceSystem.entities.abstracts.Entity;

public class User implements Entity{
	private String name;
	private String lastName;
	private String eMail;
	private String password;
	
	public User() {
		
	}

	public User(String name, String lastName, String eMail, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
