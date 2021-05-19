package gr.SMDB.app.Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "MOVIE")
@SequenceGenerator(name = "idGenerator", sequenceName = "MOVIE_SEQ", initialValue = 1, allocationSize = 1)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
//@EqualsAndHashCode(callSuper = true)
public class Movie extends BaseEntity {

	@NotNull
	@Column(length = 50, nullable = false, unique = true)
	private String title;

	@NotNull
	@Column(length = 50, nullable = false)
	private String description;

	@NotNull
	@Column(length = 4, nullable = false)
	private int year;

	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name="ENTRY",joinColumns = {@JoinColumn(name="Movie_id")},inverseJoinColumns = {@JoinColumn(name="People_id")})
	private Set<People> PEOPLE = new HashSet<>();
}
