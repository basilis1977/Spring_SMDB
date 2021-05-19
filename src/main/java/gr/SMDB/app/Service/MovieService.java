package gr.SMDB.app.Service;

import gr.SMDB.app.Domain.*;
import gr.SMDB.app.Transfer.KeyValue;

import java.util.List;

public interface MovieService extends BaseService<Movie, Long> {
	Movie findByName(String name);

}
