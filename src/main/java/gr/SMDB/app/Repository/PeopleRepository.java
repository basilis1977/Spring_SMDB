package gr.SMDB.app.Repository;

import gr.SMDB.app.Domain.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {
	@Query("select o from People o where o.lastname=?1")
    People findByName(String name);

}
