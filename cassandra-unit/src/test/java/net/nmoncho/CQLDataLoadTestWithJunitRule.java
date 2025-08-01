package net.nmoncho;

import com.datastax.oss.driver.api.core.cql.ResultSet;

import net.nmoncho.CassandraCQLUnit;

import net.nmoncho.dataset.cql.ClassPathCQLDataSet;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 
 * @author Jeremy Sevellec
 *
 */
public class CQLDataLoadTestWithJunitRule {

    @Rule
    public CassandraCQLUnit cassandraCQLUnit = new CassandraCQLUnit(new ClassPathCQLDataSet("cql/simple.cql", "mykeyspace"));

    @Test
	public void testCQLDataAreInPlace() throws Exception {
        test();
	}

    @Test
    public void sameTestToMakeSureMultipleTestsAreFine() throws Exception {
        test();
    }

    private void test() {
        ResultSet result = cassandraCQLUnit.session.execute("select * from testCQLTable WHERE id=1690e8da-5bf8-49e8-9583-4dff8a570737");

        String val = result.iterator().next().getString("value");
        assertEquals("Cql loaded string",val);
    }
}
