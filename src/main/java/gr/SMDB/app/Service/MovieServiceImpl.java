package gr.SMDB.app.Service;

import gr.SMDB.app.Domain.*;
import gr.SMDB.app.Repository.MovieRepository;
import gr.SMDB.app.Transfer.KeyValue;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends AbstractServiceImpl<Movie> implements MovieService {
	private final MovieRepository movieRepository;
	private final Set<People> PEOPLE = new HashSet<>();

	@Override
	public JpaRepository<Movie, Long> getRepository() {
		return movieRepository;
	}

	@Override
	public Movie findByName(String name) {
		return movieRepository.findByName(name);
	}


}

