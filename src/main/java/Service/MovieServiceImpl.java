package Service;

import Domain.Movie;
import Repository.MovieRepository;
import Transfer.KeyValue;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends AbstractServiceImpl<Movie> implements MovieService {
	private final MovieRepository movieRepository;

	@Override
	public JpaRepository<Movie, Long> getRepository() {
		return movieRepository;
	}

	@Override
	public Movie findByName(String name) {
		return movieRepository.findByName(name);
	}

	@Override
	public List<KeyValue<String, Integer>> findProductSaleFrequency() {
		return movieRepository.findProductSaleFrequency();
	}
}
