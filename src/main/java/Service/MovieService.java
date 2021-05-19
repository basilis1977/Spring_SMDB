package Service;

import Domain.Movie;
import Transfer.KeyValue;

import java.util.List;

public interface MovieService extends BaseService<Movie, Long> {
	Movie findByName(String name);

	List<KeyValue<String, Integer>> findProductSaleFrequency();
}
