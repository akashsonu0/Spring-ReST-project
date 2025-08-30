package in.pwskills.akash.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pwskills.akash.exception.StudentNotFoundException;
import in.pwskills.akash.model.Student;
import in.pwskills.akash.service.IStudentService;

@RestController
@RequestMapping("/v1/api/student")
public class StudentRestController {
	
	@Autowired
	private IStudentService service;
	
	/*
	 * METHOD : POST
	 * PATH   : /create
	 * INPUT  : Student object (@RequestBody)
	 * R.T    : ResponseEntity<String>
	 */
	
	@PostMapping("/create")
	public ResponseEntity<String> createStudent(
			@RequestBody Student student
			)
	{
		Integer id = service.saveStudent(student);
		
		//body = Student '1' created
		String body = "STUDENT '"+id+"' CRETAED";
		
		return new ResponseEntity<String>(body, HttpStatus.CREATED);
	}
	
	/*
	 * METHOD : GET
	 * PATH   : /all
	 * INPUT  : No input
	 * R.T    : ResponseEntity<List<Student>>
	 */
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStuden() {
		
		List<Student> body = service.getAllStudents();
		
		return  ResponseEntity.ok(body);
	}
	

	/*
	 * METHOD : GET
	 * PATH   : /find/{id}
	 * INPUT  : id -> @PathVariable 
	 * R.T    : ResponseEntity<Student>
	 */
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Student> getOneStudent(
			@PathVariable Integer id	
			)
	{
		ResponseEntity<Student> response = null;
		try {
			Student s = service.getOneStudent(id);
			response = ResponseEntity.ok(s);
		}catch(StudentNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	
	/*
	 * METHOD : DELETE
	 * PATH   : /remove/{id}
	 * INPUT  : id -> @PathVariable
	 * R.T    : ResponseEntity<String>
	 */
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteStudent(
			@PathVariable Integer id	
			)
	{
		ResponseEntity<String> response = null;
		try {
			 service.deleteStudent(id);
			response = ResponseEntity.ok("STUDENT '"+id+"' REMOVED");
		}catch(StudentNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	
	/*
	 * METHOD : PUT
	 * PATH   : /modify
	 * INPUT  : Student -> @RequestBody
	 * R.T    : ResponseEntity<String>
	 */
	
	@PutMapping("/modify")
	public ResponseEntity<String> updateStudent(
			@RequestBody Student student	
			)
	{
		ResponseEntity<String> response = null;
		try {
			 service.updateStudent(student);
			response = ResponseEntity.ok("STUDENT '"+student.getStdId()+"' UPDATED");
		}catch(StudentNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	

}
