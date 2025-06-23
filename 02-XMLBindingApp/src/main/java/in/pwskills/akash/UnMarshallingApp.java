package in.pwskills.akash;

import java.io.File;

import in.pwskills.akash.bean.Person;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class UnMarshallingApp {
	public static void main(String[] args) throws JAXBException {
		
		//Read XML data and convert to object
		JAXBContext context = JAXBContext.newInstance(Person.class);
		
		Unmarshaller unmarshaller= context.createUnmarshaller();
		
		Person person = (Person) unmarshaller.unmarshal(new File("person.xml"));
		System.out.println(person);
		
		
	}
}
