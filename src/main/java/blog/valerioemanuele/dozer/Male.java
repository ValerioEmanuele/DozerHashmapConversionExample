package blog.valerioemanuele.dozer;

import java.util.List;
import java.util.Map;

public class Male {
	private String name;
    private String surname;

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

	public Map<String, List<Contact>> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, List<Contact>> contacts) {
		this.contacts = contacts;
	}
}
