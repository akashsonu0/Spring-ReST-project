package in.pwskills.akash.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pwskills.akash.request.PassengerInfo;
import in.pwskills.akash.response.Ticket;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/v1/api/railway")
public class ERailResource {
	
	/*
	 * METHOD : POST
	 * R.T    : /createTicket
	 * INPUT  : PassengerDetails(@RequestBody)
	 * OUTPUT : Ticket(JSON)
	 */
	
	@PostMapping("/createTicket")
	public ResponseEntity<Ticket> bookTicket(
			@RequestBody PassengerInfo pinfo
			) 
	{
		
		//Creating a ticket object
		Ticket body = new Ticket();
		
		//Setting the ticket object data
		body.setTicketId("TA02899");
		body.setTicketStatus("CONFIRMED");
		body.setJourneyDate(pinfo.getJourneyDate());
		body.setPassengerName(pinfo.getFirstName() + " " + pinfo.getLastName());
		body.setTrainNumber(pinfo.getTrainNumber());
		body.setTicketPrice(350.00);
		body.setFrom(pinfo.getFrom());
		body.setTo(pinfo.getTo());
		
		try {
			//sleeping for 30sec
			Thread.sleep(30000);
		} catch (Exception e) {		}

		return new ResponseEntity<Ticket>(body,HttpStatus.CREATED);
	}
	

}
