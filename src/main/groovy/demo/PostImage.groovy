package demo

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.GeneratedValue

/**
 * @author  berinle
 */
@Entity
@Table(name="post_image")
class PostImage {

    @Id @GeneratedValue Long id
    int size

//    @ManyToOne
//    BasePost post
}
