package in.pwskills.akash.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/api/product")
public class ProductRestController {
	
	/*
	 * R.T     : ResponseEntity<String>
	 * METHOD  : GET
	 * PATH    : /get -> static path , {pid}/{pname} -> dynamic path
	 * INPUT   : No Input
	 */
	
	@GetMapping("/get/{pid}/{pname}")
	public ResponseEntity<String>getProductDetails
		(
				@PathVariable Integer pid,
				@PathVariable  String pname
			) {
		
		// new ResponseEntity<String>("PID = "+pid + " : "+"PNAME = "+pname,HttpStatus.OK);
		
		String body = "PID = "+pid + " : "+"PNAME = "+pname;
		return ResponseEntity.ok(body);
	}
	
	/*
	 * R.T     : ResponseEntity<String>
	 * METHOD  : find
	 * PATH    : /get -> static path 
	 * INPUT   : @RequestParam (pid,pname)
	 */
	
	@GetMapping("/find")
	public ResponseEntity<String>getProductInfo
		(
				@RequestParam Integer pid,
				@RequestParam String pname
			) {
		
		// new ResponseEntity<String>("PID = "+pid + " : "+"PNAME = "+pname,HttpStatus.OK);
		
		String body = "PID = "+pid + " : "+"PNAME = "+pname;
		return ResponseEntity.ok(body);
	}
	

}

