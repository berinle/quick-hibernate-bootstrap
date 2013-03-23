import spock.lang.Specification

/**
 * @author berinle
 */
class IdGeneratorSpec extends Specification {

    def "verify uuid generator works as expected"(){
        given: "a department is created"
        def session = HibernateUtil.sessionFactory.currentSession
        def dept = new Department(name: "Human Resources")

        when: "it is saved"
        session.beginTransaction()
        String id = session.save(dept)
        session.getTransaction().commit()

        then: "it should be assigned a uuid of length 32"
        id.length() == 32


    }

}
