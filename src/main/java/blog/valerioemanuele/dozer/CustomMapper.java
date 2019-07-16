package blog.valerioemanuele.dozer;

import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.FieldsMappingOptions;

public class CustomMapper extends BeanMappingBuilder {
	@Override
	protected void configure() {
		mapping(Female.class, Male.class).fields("contacts", "contacts", FieldsMappingOptions.hintB(Contact.class));
	}

}
