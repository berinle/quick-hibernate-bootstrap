package demo

import javax.persistence.MappedSuperclass
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.OneToMany
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.Inheritance
import javax.persistence.InheritanceType

/**
 * @author  berinle
 */
//@MappedSuperclass
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
class BasePost {
    @Id @GeneratedValue Long id

    @OneToMany(cascade= CascadeType.ALL)
    List<PostImage> images = []
}
