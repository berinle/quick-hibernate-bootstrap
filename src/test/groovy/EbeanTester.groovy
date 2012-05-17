import com.avaje.ebean.Ebean
import com.avaje.ebean.SqlRow
/**
 * @author berinle
 */
class EbeanTester {
    static void main(String[] a){
        String sql = "select count(*) as count from dual"
        SqlRow row = Ebean.createSqlQuery(sql).findUnique()
        def integer = row.getInteger("count")
        println("got $integer")
    }
}
