/**
 * 
 */
package ishaq.framework.springmvc5.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ishaq.framework.springmvc5.domain.Mentee;
import ishaq.framework.springmvc5.services.MenteeService;

/**
 * @author nsa
 *
 */
@RestController
@RequestMapping(MenteeController.BASE_URL)
public class MenteeController {

	public static final String BASE_URL = "/webapi/v1/mentees";
	// Service Wrapper over Spring Data Repository
	// Web Logic is Implemented 
	private final MenteeService menteeService;

	public MenteeController(MenteeService menteeService) {
		super();
		this.menteeService = menteeService;
	}
	
	
	@GetMapping
	List<Mentee> getAllMentees(){
		return menteeService.findAllMentees();
	}
	
	@GetMapping("/{id}")
	Mentee getMenteeById(@PathVariable Long id) {
		return menteeService.findMenteeById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	//Binding jackson json to the object
	//Marshalling
	//Unmarshalling
	public Mentee saveMentee(@RequestBody Mentee mentee) {
		return menteeService.saveMentee(mentee);
	}
}
