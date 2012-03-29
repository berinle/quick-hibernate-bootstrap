import javax.persistence.*
import groovy.transform.ToString

@Entity
@Table(name="z_parent")
@ToString
class Parent {
	@Id
	Long id

	String name

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="parent_id")
	List<Child> children

}