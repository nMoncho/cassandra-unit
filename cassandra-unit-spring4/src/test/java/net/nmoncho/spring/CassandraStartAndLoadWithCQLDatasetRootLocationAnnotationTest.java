package net.nmoncho.spring;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;

import net.nmoncho.spring.CassandraDataSet;
import net.nmoncho.spring.CassandraUnitTestExecutionListener;
import net.nmoncho.spring.EmbeddedCassandra;

import net.nmoncho.utils.EmbeddedCassandraServerHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author Olivier Bazoud
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = { "classpath:/default-context.xml" })
@TestExecutionListeners({ CassandraUnitTestExecutionListener.class })
@CassandraDataSet
@EmbeddedCassandra
public class CassandraStartAndLoadWithCQLDatasetRootLocationAnnotationTest {

  @Test
  public void should_work() {
    test();
  }

  @Test
  public void should_work_twice() {
    test();
  }

  private void test() {
    CqlSession session = EmbeddedCassandraServerHelper.getSession();
    ResultSet result = session.execute("select * from testCQLTableRootLocation WHERE id=1690e8da-5bf8-49e8-9583-4dff8a570797");
    String val = result.iterator().next().getString("value");
    assertEquals("Root- Cql loaded string", val);
  }

}
