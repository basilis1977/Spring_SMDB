package gr.SMDB.app.Bootstrap;

import gr.SMDB.app.Base.AbstractLogEntity;
import gr.SMDB.app.Domain.*;
import gr.SMDB.app.Service.MovieService;
import gr.SMDB.app.Service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;



@Component
@Profile("Normal")
@RequiredArgsConstructor
public class NormalRunner extends AbstractLogEntity implements CommandLineRunner {
	private final MovieService movieService;
	private final PeopleService peopleService;

	@Override
	public void run(String... args) {

		while(true){}
	}
}
