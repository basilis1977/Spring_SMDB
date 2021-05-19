package Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "MOVIE")
@SequenceGenerator(name = "idGenerator", sequenceName = "PRODUCTS_SEQ", initialValue = 1, allocationSize = 1)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
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

	@NotNull
	@ManyToMany(fetch = FetchType.EAGER)
	private People people;
}
