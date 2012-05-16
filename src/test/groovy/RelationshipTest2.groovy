import org.hibernate.Session
import demo.HousePost
import demo.PostImage
import demo.RoomPost
/**
 * @author  berinle
 */
class RelationshipTest2 {
    static void main(String[] args){

        Session s = HibernateUtil.sessionFactory.openSession()
        s.beginTransaction()

        def housePost = new HousePost(name: "house_post")
        housePost.images << new PostImage(size: 10)

        def roomPost = new RoomPost(name: "room_post")
        roomPost.images << new PostImage(size:  5)

        s.save(housePost)
        s.save(roomPost)

        //assert there 2 post images
        assert s.createCriteria(PostImage.class).list().size() == 2

        s.transaction.commit()

        s.beginTransaction()

        def housePostList = s.createCriteria(HousePost.class).list()
        assert housePostList.size() == 1

        s.delete(housePostList[0])

        assert s.createCriteria(HousePost.class).list().size() == 0
        assert s.createCriteria(PostImage.class).list().size() == 1

        s.transaction.commit()
    }
}
