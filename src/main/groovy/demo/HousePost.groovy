package demo

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.OneToMany
import javax.persistence.CascadeType
import javax.persistence.JoinTable
import javax.persistence.JoinColumns
import javax.persistence.JoinColumn

/**
 * @author  berinle
 */
@Entity
@Table(name="house_post")
class HousePost extends BasePost {

    String name

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinTable(name="post_images", joinColumns = [@JoinColumn(name="post_id")])
//    List<PostImage> images = []

}
