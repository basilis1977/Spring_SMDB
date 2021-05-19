package gr.SMDB.app.Bootstrap;

import gr.SMDB.app.Domain.Movie;
import gr.SMDB.app.Domain.People;
import gr.SMDB.app.Service.MovieService;
import gr.SMDB.app.Service.PeopleService;
import lombok.RequiredArgsConstructor;
import gr.SMDB.app.Base.AbstractLogEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


import java.util.HashSet;
import java.util.Set;

@Component
@Profile("samples")
@RequiredArgsConstructor
public class SampleRunner extends AbstractLogEntity implements CommandLineRunner {
	private final MovieService movieService;
	private final PeopleService peopleService;

	@Override
	public void run(String... args) {

		People people1 = People.builder().firstname("Harvey").lastname("Keitel").type("Actor").build();
		peopleService.save(people1);
		People people2 = People.builder().firstname("Tim").lastname("Roth").type("Actor").build();
		peopleService.save(people2);
		People people3 = People.builder().firstname("Michael").lastname("Madsen").type("Actor").build();
		peopleService.save(people3);
		People people4 = People.builder().firstname("Quentin").lastname("Tarantino").type("Director").build();
		peopleService.save(people4);
		People people5 = People.builder().firstname("Quentin").lastname("Tarantino").type("Writer").build();
		peopleService.save(people5);
		People people6 = People.builder().firstname("Mel").lastname("Gibson").type("Actor").build();
		peopleService.save(people6);
		People people7 = People.builder().firstname("Danny").lastname("Glover").type("Actor").build();
		peopleService.save(people7);
		People people8 = People.builder().firstname("Gary").lastname("Busey").type("Actor").build();
		peopleService.save(people8);
		People people9 = People.builder().firstname("Richard").lastname("Donner").type("Director").build();
		peopleService.save(people9);
		People people10 = People.builder().firstname("Shane").lastname("Black").type("Writer").build();
		peopleService.save(people10);
		People people11 = People.builder().firstname("Sylvester").lastname("Stallone").type("Actor").build();
		peopleService.save(people11);
		People people12 = People.builder().firstname("Talia").lastname("Shire").type("Actor").build();
		peopleService.save(people12);
		People people13 = People.builder().firstname("Burt").lastname("Young").type("Actor").build();
		peopleService.save(people13);
		People people14 = People.builder().firstname("John").lastname("Avildsen").type("Director").build();
		peopleService.save(people14);
		People people15 = People.builder().firstname("Sylvester").lastname("Stallone").type("Writer").build();
		peopleService.save(people15);
		People people16 = People.builder().firstname("Julia").lastname("Roberts").type("Actor").build();
		peopleService.save(people16);
		People people17 = People.builder().firstname("Patrick").lastname("Stewart").type("Actor").build();
		peopleService.save(people17);

		Set<People> tempSet = new HashSet<>();
		tempSet.add(peopleService.findById(151L));
		tempSet.add(peopleService.findById(152L));
		tempSet.add(peopleService.findById(153L));
		tempSet.add(peopleService.findById(154L));
		tempSet.add(peopleService.findById(155L));
		Movie movie1 = Movie.builder().title("Reservoir Dogs").description("Crime, Drama").year(1992).PEOPLE(tempSet).build();
		tempSet.clear();
		tempSet.add(peopleService.findById(156L));
		tempSet.add(peopleService.findById(157L));
		tempSet.add(peopleService.findById(158L));
		tempSet.add(peopleService.findById(159L));
		tempSet.add(peopleService.findById(160L));
		Movie movie2 = Movie.builder().title("Lethal Weapon").description("Action").year(1987).PEOPLE(tempSet).build();
		tempSet.clear();
		tempSet.add(peopleService.findById(161L));
		tempSet.add(peopleService.findById(162L));
		tempSet.add(peopleService.findById(163L));
		tempSet.add(peopleService.findById(164L));
		tempSet.add(peopleService.findById(165L));
		Movie movie3 = Movie.builder().title("Rocky").description("Sport").year(1976).PEOPLE(tempSet).build();
		tempSet.clear();
		tempSet.add(peopleService.findById(156L));
		tempSet.add(peopleService.findById(166L));
		tempSet.add(peopleService.findById(167L));
		tempSet.add(peopleService.findById(159L));
		tempSet.add(peopleService.findById(160L));
		Movie movie4 = Movie.builder().title("Conspiracy Theory").description("Action, Mystery").year(1997).PEOPLE(tempSet).build();
		movieService.save(movie1);
		movieService.save(movie2);
		movieService.save(movie3);
		movieService.save(movie4);

		logger.info("Saving some people and movies");
	}
}
