package gr.SMDB.app.Service;

import gr.SMDB.app.Domain.People;

public interface PeopleService extends BaseService<People, Long> {
	People findByName(String name);

}
