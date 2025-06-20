package in.pwskills.akash;

import java.io.File;

import in.pwskills.akash.bean.Person;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class MarshallingApp {
    public static void main(String[] args) throws JAXBException {
        Person person = new Person();
        person.setId(10);
        person.setEmail("sachin@gmail.com");
        person.setGender("male");
        person.setName("sachin");

        // Create JAXB Context for Person class
        JAXBContext context = JAXBContext.newInstance(Person.class);

        // Create Marshaller
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // optional: for readable XML

        // Marshall the person object to XML file
        marshaller.marshal(person, new File("person.xml"));

        System.out.println("Marshalling completed...");
    }
}
