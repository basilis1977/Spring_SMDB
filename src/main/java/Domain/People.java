package Domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import Transfer.KeyValue;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


//@formatter:off
/*@NamedNativeQuery(name = "Customer.mostExpensiveProductPurchases",
		query =	"SELECT C.FIRSTNAME || ' ' || C.LASTNAME as fullname, COUNT(*) as purchases " +
				"FROM ORDERS O, ORDER_ITEMS OI, CUSTOMERS C " +
				"WHERE OI.ORDER_ID = O.ID " +
				"AND O.CUSTOMER_ID = C.ID " +
				"AND OI.PRODUCT_ID = (SELECT TOP 1 ID FROM PRODUCTS ORDER BY PRICE DESC) " +
				"GROUP BY O.CUSTOMER_ID " +
				"ORDER BY purchases, c.lastname, c.firstname",
		resultSetMapping = "customerMostExpensiveProductPurchases")
@SqlResultSetMappings({
	@SqlResultSetMapping(name="customerMostExpensiveProductPurchases",
			classes = @ConstructorResult(
							targetClass = KeyValue.class,
							columns = {
										@ColumnResult(name="fullname", type = String.class),
										@ColumnResult(name="purchases", type = BigDecimal.class)
							}
			)
	)
})

//@formatter:on
*/
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "PEOPLE")
@SequenceGenerator(name = "idGenerator", sequenceName = "CUSTOMERS_SEQ", initialValue = 1, allocationSize = 1)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class People extends BaseEntity {

	@NotNull
	@Column(length = 20, nullable = false)
	private String firstname;

	@NotNull
	@Column(length = 30, nullable = false)
	private String lastname;

	@NotNull
	@Column(length = 20, nullable = false)
	private String type;
}
