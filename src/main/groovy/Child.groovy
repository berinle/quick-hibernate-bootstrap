import javax.persistence.*
import groovy.transform.ToString

@Entity
@Table(name="z_child")
@ToString
class Child {
	@Id
	Long id

	String name

}