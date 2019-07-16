package blog.valerioemanuele.dozer;

import java.util.List;
import java.util.Map;

public class Female {
	private String name;
	private String surname;
	private String mobile;
	private String dateOfBirth;

	private Map<String, List<Contact>> contacts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Map<String, List<Contact>> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, List<Contact>> contacts) {
		this.contacts = contacts;
	}
}
