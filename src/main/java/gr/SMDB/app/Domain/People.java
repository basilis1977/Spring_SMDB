package gr.SMDB.app.Domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "PEOPLE")
@SequenceGenerator(name = "idGenerator", sequenceName = "PEOPLE_SEQ", initialValue = 1, allocationSize = 1)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class People extends BaseEntity{

	@NotNull
	@Column(length = 20, nullable = false)
	private String firstname;

	@NotNull
	@Column(length = 30, nullable = false)
	private String lastname;

	@NotNull
	@Column(length = 20, nullable = false)
	private String type;

	@JsonIgnore
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="ENTRY",joinColumns = {@JoinColumn(name="People_id")},inverseJoinColumns = {@JoinColumn(name="Movie_id")})
	private Set<Movie> MOVIES = new HashSet<>();


}
