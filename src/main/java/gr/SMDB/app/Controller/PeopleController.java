package gr.SMDB.app.Controller;

import gr.SMDB.app.Domain.*;
import gr.SMDB.app.Service.*;
import gr.SMDB.app.Transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/people")
public class PeopleController extends AbstractController<People> {
	private final PeopleService peopleService;

	@Override
	public BaseService<People, Long> getBaseService() {
		return peopleService;
	}

	@GetMapping(params = {"LastName"})
	public ResponseEntity<ApiResponse<People>> findByName(@RequestParam(name="LastName")String name){
		return ResponseEntity.ok(ApiResponse.<People>builder().data(peopleService.findByName(name)).build());
	}
}
