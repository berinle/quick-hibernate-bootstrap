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

        list = s.createCriteria(Parent.class).list()
        assert 0 == list.size()

        s.transaction.rollback()
        s.close()


    }
}
