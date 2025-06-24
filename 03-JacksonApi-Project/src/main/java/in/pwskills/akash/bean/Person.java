package in.pwskills.akash.bean;

import java.util.Date;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder(value = {"orders","firstName","emailId"})
@JsonRootName("person")
public class Person {
	
	@JsonProperty("first_name")
	private String firstName;
	
	@JsonProperty("last_name")
	private String lastName;
	
	private String emailId;
	
	@JsonIgnore
	private Date dob;

	//HAS-A order:: multiple orders
	private List<Order> orders;
	
	//HAS-A account
	private Account account;
}
