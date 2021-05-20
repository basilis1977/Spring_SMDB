package gr.SMDB.app.Service;

import gr.SMDB.app.Domain.People;
import gr.SMDB.app.Repository.PeopleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PeopleServiceImpl extends AbstractServiceImpl<People> implements PeopleService {
	private final PeopleRepository peopleRepository;

	@Override
	public JpaRepository<People, Long> getRepository() {
		return peopleRepository;
	}

	@Override
	public People findByName(String name) {
		return peopleRepository.findByName(name);
	}

}
