import org.hibernate.Session
/**
 * @author  berinle
 */
class RelationshipTest {
    static void main(String[] args){

        Session s = HibernateUtil.sessionFactory.openSession()
        s.beginTransaction()

        println "do some useful work!"

        def list = s.createCriteria(Parent.class).list()
        assert 1 == list.size()

        s.delete(list.get(0))

        //work around is "on delete cascade" is turned on in the database
//        s.createQuery("delete from Parent where id = :id").setParameter("id", 1L).executeUpdate()

        list = s.createCriteria(Parent.class).list()
        assert 0 == list.size()

        s.transaction.rollback()
        s.close()


    }
}
