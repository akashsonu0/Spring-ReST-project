package in.pwskills.akash;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import in.pwskills.akash.bean.Account;
import in.pwskills.akash.bean.Order;
import in.pwskills.akash.bean.Person;

public class Java2JsonApp {
  public static void main(String[] args) throws Exception {
	  
	  Order ord1 = new Order(1234,"laptop",true,"good");
	  Order ord2 = new Order(1113,"mobile",false,"good");
	  Order ord3 = new Order(2323,"watch",true,"good");

	  Account account = new Account("123452434","HDFC",new BigDecimal(122344234));
	  
	  Person person = new Person("sachin","tendulkar",
			  "sachin@gmail.com",
			  new Date(),List.of(ord1,ord2,ord3),account);
	  
	  //Use JACKSONAPI and covert java object to JSON
	  ObjectMapper mapper = new ObjectMapper();
	  mapper.enable(SerializationFeature.INDENT_OUTPUT);
	  
	  mapper.writeValue(new File("src/main/resources/person.json"),person);
	  System.out.println("Serialization is completed...");
	  
  }
}
