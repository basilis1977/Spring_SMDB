package gr.SMDB.app.Controller;

import gr.SMDB.app.Domain.*;
import gr.SMDB.app.Service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/people")
public class PeopleController  {
	private final PeopleService peopleService;


	@GetMapping("/all")
	public List<People> getAll(){
		return peopleService.findAll();
	}
}
