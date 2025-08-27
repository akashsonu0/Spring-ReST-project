package in.pwskills.akash.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pwskills.akash.bean.Employee;

import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("v1/api/employee")
public class EmployeeRestController {
	
	/*
	 * R.T    : R
	 * PATH   : /save
	 * INPUT  : Employee @RequestBody
	 * METHOD : POST
	 */
	
	@PostMapping("/save")
	public ResponseEntity <String> saveObject(
			@RequestBody Employee employee) {
		
		String body = employee.toString();
		//CREATED : resource got created at the producer side, to indicate to the consumer we send this status code
		return new ResponseEntity<>(body,HttpStatus.CREATED);
	}
	

}
