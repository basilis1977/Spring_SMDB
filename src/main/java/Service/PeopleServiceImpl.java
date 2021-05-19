package Service;

import Domain.People;
import Repository.PeopleRepository;
import Transfer.KeyValue;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

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
