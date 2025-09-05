package in.pwskills.akash.restcontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pwskills.akash.response.CurrencyResponse;


@RestController
@RequestMapping("/v1/api/currency")
public class CurrencyConvertor {
	
	/*
	 * METHOD : GET
	 * PATH   : /convertFromUSDToINR/from/{from}/to/{to}
	 * INPUT  : @PathVaraible(from,to)
	 * R.T    : ResponseEntity<CurrencyResponse>
	 * PORTNO : 9999
	 */
	
	@GetMapping("/convertFromUSDToINR/from/{from}/to/{to}")
	public ResponseEntity<CurrencyResponse> convertCurrencyData(
			@PathVariable String from,
			@PathVariable String to
			) {
		CurrencyResponse body =new CurrencyResponse();
		body.setCurrencyId(1);
		body.setCurrencyFrom(from);
		body.setCurrencyTo(to);
		body.setCurrencyValue(83);
		
		try {
			//Setting up a delay of some 30 secs
			Thread.sleep(30000);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	    return ResponseEntity.ok(body);
	}
	
	
}
