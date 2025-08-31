package in.pwskills.akash.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="stdtab")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sid")
	private Integer stdId;
	
	@Column(name="sname")
	//@NotNull(message ="name can't be null")
	//@NotEmpty(message ="name can't be null")
	@NotBlank(message="name can't be blank")
	@Size(min = 2,max = 15, message = "Name must be b/w 2-15 chars only")
	@Pattern(regexp ="[A-Za-z]{2,15}", message = "Character a-z and A-Z are permitted")
	private String stdName;
	
	@Column(name="sgen")
	@NotBlank(message="std gender can't be blank")
	private String stdGen;
	
	@Column(name="scourse")
	@NotBlank(message="course can't be blank")
	private String stdCourse;
	
	@Column(name="saddr")
	@NotBlank(message="address can't be blank")
	@Size(min = 2, max = 50)
	@Pattern(regexp="[A-Za-z#/\\.\\-1-9]{2,50}",message ="INVALID ADDRESS DETAILS")
	private String stdAddr;
}
