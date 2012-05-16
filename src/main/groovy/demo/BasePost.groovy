package demo

import javax.persistence.MappedSuperclass
import javax.persistence.Id
import javax.persistence.GeneratedValue

/**
 * @author  berinle
 */
@MappedSuperclass
abstract class BasePost {
    @Id @GeneratedValue Long id
}
