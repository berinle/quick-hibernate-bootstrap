package demo

import javax.persistence.*

/**
 * @author  berinle
 */
@Entity
@Table(name="room_post")
class RoomPost extends BasePost {

    String name

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name="post_images", joinColumns = [@JoinColumn(name="post_id")])
    List<PostImage> images = []
}
