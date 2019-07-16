package blog.valerioemanuele.dozer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.dozer.DozerBeanMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestFemaleToMaleConversion {

	@Test
	void test() {
		Map<String, List<Contact>> contact = new LinkedHashMap<>();
        List<Contact> listOfContacts = new ArrayList<>();
        Contact contactObj = new Contact();
        contactObj.setEmail("lala@gmail.com");
        contactObj.setPostcode("1233355");
        contactObj.setStreet("street");

        listOfContacts.add(contactObj);

        contact.put("2131323213", listOfContacts);
        Female femaleObj = new Female();
        femaleObj.setName("Elisabeth");
        femaleObj.setSurname("Chesny");
        femaleObj.setContacts(contact);

        DozerBeanMapper objectMapper = new DozerBeanMapper();
        objectMapper.setMappingFiles(Arrays.asList("dozer-mapping.xml"));
        Male maleObj = objectMapper.map(femaleObj, Male.class);
      
        Assert.assertEquals("lala@gmail.com", maleObj.getContacts().get("2131323213").get(0).getEmail());
	}

}
