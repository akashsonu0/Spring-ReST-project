package in.pwskills.akash.bean;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private String firstName;
	private String lastName;
	private String emailId;
	private Date dob;

	//HAS-A order:: multiple
	private List<Order> orders;
	
	//HAS-A account
	private Account account;
}
