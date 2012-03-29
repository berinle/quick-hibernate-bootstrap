import org.hibernate.cfg.AnnotationConfiguration
import org.hibernate.SessionFactory
/**
 * @author  berinle
 */
class HibernateUtil {

    static SessionFactory sessionFactory

    static {
        sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory()
    }


}
