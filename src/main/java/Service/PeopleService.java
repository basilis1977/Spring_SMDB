package Service;

import Domain.People;

public interface PeopleService extends BaseService<People, Long> {
	People findByName(String name);

}
