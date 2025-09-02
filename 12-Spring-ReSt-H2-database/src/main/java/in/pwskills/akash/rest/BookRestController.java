package in.pwskills.akash.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pwskills.akash.model.Book;
import in.pwskills.akash.repo.IBookRepo;
@RestController
@RequestMapping("v1/api/book")
public class BookRestController {

	@Autowired
	private IBookRepo repo;
	
	/*
	 * METHOD : POST
	 * PATH   : /save
	 * INPUT  : Book(@RequestBody)
	 * OUTPUT : R>E<String>
	 */
	
	@PostMapping("/save")
	public ResponseEntity<String> saveBook(
		@RequestBody Book book
		){
		Book obj = repo.save(book);
		String body = "Book "+"'"+obj.getBid()+"'"+" created";
		return new ResponseEntity<>(body,HttpStatus.CREATED);
	}
}
