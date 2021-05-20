package gr.SMDB.app.Service;

import gr.SMDB.app.Domain.*;

public interface MovieService extends BaseService<Movie, Long> {
	Movie findByName(String name);

}
