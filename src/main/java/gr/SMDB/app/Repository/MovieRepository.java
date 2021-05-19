package gr.SMDB.app.Repository;

import gr.SMDB.app.Domain.Movie;
import gr.SMDB.app.Transfer.KeyValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
	@Query("select o from Movie o where o.title=?1")
	Movie findByName(String name);

}
