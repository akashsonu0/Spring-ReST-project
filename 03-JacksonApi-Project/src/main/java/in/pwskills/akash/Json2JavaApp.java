package in.pwskills.akash;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.pwskills.akash.bean.Person;

public class Json2JavaApp {
  public static void main(String[] args) throws Exception {
	  
	 //Use JACKSONAPI and convert java to JSON 
	  ObjectMapper mapper = new ObjectMapper();
	  
	  Person person = mapper.readValue(new File("src/main/resources/person.json"), Person.class);
	  System.out.println(person);
	  System.out.println("Deserialization is completed...");
	  
  }
}
