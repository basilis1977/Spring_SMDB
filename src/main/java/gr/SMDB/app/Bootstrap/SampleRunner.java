package gr.SMDB.app.Bootstrap;

import gr.SMDB.app.Domain.*;
import gr.SMDB.app.Service.*;
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
		People people2 = People.builder().firstname("Tim").lastname("Roth").type("Actor").build();
		People people3 = People.builder().firstname("Michael").lastname("Madsen").type("Actor").build();
		People people4 = People.builder().firstname("Quentin").lastname("Tarantino").type("Director").build();
		People people5 = People.builder().firstname("Quentin").lastname("Tarantino").type("Writer").build();
		People people6 = People.builder().firstname("Mel").lastname("Gibson").type("Actor").build();
		People people7 = People.builder().firstname("Danny").lastname("Glover").type("Actor").build();
		People people8 = People.builder().firstname("Gary").lastname("Busey").type("Actor").build();
		People people9 = People.builder().firstname("Richard").lastname("Donner").type("Director").build();
		People people10 = People.builder().firstname("Shane").lastname("Black").type("Writer").build();
		People people11 = People.builder().firstname("Sylvester").lastname("Stallone").type("Actor").build();
		People people12 = People.builder().firstname("Talia").lastname("Shire").type("Actor").build();
		People people13 = People.builder().firstname("Burt").lastname("Young").type("Actor").build();
		People people14 = People.builder().firstname("John").lastname("Avildsen").type("Director").build();
		People people15 = People.builder().firstname("Sylvester").lastname("Stallone").type("Writer").build();
		People people16 = People.builder().firstname("Liam").lastname("Neeson").type("Actor").build();
		People people17 = People.builder().firstname("Maggie").lastname("Grace").type("Actor").build();
		People people18 = People.builder().firstname("Leland").lastname("Orsen").type("Actor").build();
		People people19 = People.builder().firstname("Pierre").lastname("Morel").type("Director").build();
		People people20 = People.builder().firstname("Luc").lastname("Besson").type("Writer").build();

		Set<People> tempSet = new HashSet<>();
		tempSet.add(people1);
		tempSet.add(people2);
		tempSet.add(people3);
		tempSet.add(people4);
		tempSet.add(people5);
		Movie movie1 = Movie.builder().title("Reservoir Dogs").description("Crime, Drama").year(1992).PEOPLE(tempSet).build();
		movieService.save(movie1);
		tempSet.clear();
		tempSet.add(people6);
		tempSet.add(people7);
		tempSet.add(people8);
		tempSet.add(people9);
		tempSet.add(people10);
		Movie movie2 = Movie.builder().title("Lethal Weapon").description("Action").year(1987).PEOPLE(tempSet).build();
		movieService.save(movie2);
		tempSet.clear();
		tempSet.add(people11);
		tempSet.add(people12);
		tempSet.add(people13);
		tempSet.add(people14);
		tempSet.add(people15);
		Movie movie3 = Movie.builder().title("Rocky").description("Sport").year(1976).PEOPLE(tempSet).build();
		movieService.save(movie3);
		tempSet.clear();
		tempSet.add(people16);
		tempSet.add(people17);
		tempSet.add(people18);
		tempSet.add(people19);
		tempSet.add(people20);
		Movie movie4 = Movie.builder().title("Taken").description("Action, Crime").year(2008).PEOPLE(tempSet).build();
		movieService.save(movie4);

		logger.info("Saving some people and movies");
	}
}
