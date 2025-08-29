package in.pwskills.akash.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pwskills.akash.entity.Book;

@RestController
@RequestMapping("/v1/api/book")
public class BookRestController {
	
	/*
	 *  METHOD : GET
	 *  PATH   : /showA
	 *  R.T    : ResponseEntity<String>
	 *  INPUT  : no input
	 */
	
	@GetMapping("/showA")
	public ResponseEntity<String> showMsg1(){
		//return new ResponseEntity<String>("WELCOME",HttpStatus.OK);
		return ResponseEntity.ok("WELCOME TO FIRST CALL TYPE - GET");
	}
	
	/*
	 *  METHOD : GET
	 *  PATH   : /showB
	 *  R.T    : ResponseEntity<String>
	 *  INPUT  : {id}/{name}
	 */
	
	@GetMapping("/showB/{id}/{name}")
	public ResponseEntity<String> showMsg2(
			@PathVariable Integer id,
			@PathVariable String name
		)
		{
	 
		return ResponseEntity.ok("WELCOME TO FIRST CALL TYPE - GET ==> " +id + "-" +name);
	}
	

	/*
	 *  METHOD : GET
	 *  PATH   : /showC
	 *  R.T    : ResponseEntity<Book>
	 *  INPUT  : {id}
	 */
	
	@GetMapping("/showC/{id}")
	public ResponseEntity<Book> showMsg3(
			@PathVariable Integer id	
		) {
		return ResponseEntity.ok(new Book(id,"ABC","RAJ",500.0));
		}
	
	
}
