package in.pwskills.akash;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.pwskills.akash.bean.Person;

public class SerializationApp 
{
    public static void main( String[] args ) throws JAXBException
    {
    	Person person = new Person();
    	person.setName("sachin");
    	person.setId(10);
    	person.setEmail("sachin@gmail.com");
    	person.setGender("male");
    	
    	
    	//serialize the Object 
    	JAXBContext context = JAXBContext.newInstance(Person.class);
    	Marshaller marshaller = context.createMarshaller();
    	marshaller.marshal(context, new File("person.xml"));
    	System.out.println("*******Marshalling compileted*******.......");
    	
    }
}
