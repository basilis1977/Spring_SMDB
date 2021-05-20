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
@RequestMapping("/movies")
public class MoviesController extends AbstractController<Movie> {

	private final MovieService movieService;

	@Override
	public BaseService<Movie, Long> getBaseService() {
		return movieService;
	}

	@GetMapping(params={"Title"})
	public ResponseEntity<ApiResponse<Movie>> findByTitle(@RequestParam(name="Title")String title){
		return ResponseEntity.ok(ApiResponse.<Movie>builder().data(movieService.findByName(title)).build());
	}

}
