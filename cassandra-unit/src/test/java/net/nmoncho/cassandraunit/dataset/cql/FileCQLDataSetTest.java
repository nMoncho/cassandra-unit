package net.nmoncho.cassandraunit.dataset.cql;

import net.nmoncho.cassandraunit.dataset.AbstractFileDataSetTest;
import net.nmoncho.cassandraunit.dataset.CQLDataSet;
import net.nmoncho.cassandraunit.dataset.ParseException;
import org.junit.Test;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * 
 * @author Jeremy Sevellec
 * 
 */
public class FileCQLDataSetTest extends AbstractFileDataSetTest {

	@Override
	public String getDataSetClasspathRessource() {
		return "/cql/simple.cql";
	}

	@Test
	public void shouldGetACQLDataSet() {

		CQLDataSet dataSet = new FileCQLDataSet(super.targetDataSetPathFileName);
		assertThat(dataSet, notNullValue());
	}

	@Test
	public void shouldNotGetACQLDataSetBecauseNull() {
		try {
			CQLDataSet dataSet = new FileCQLDataSet(null);
			fail();
		} catch (ParseException e) {
			/* nothing to do, it what we want */
		}
	}

	@Test
	public void shouldNotGetACQLDataSetBecauseOfFileNotFound() {
		try {
			CQLDataSet dataSet = new FileCQLDataSet("/notfound.cql");
			fail();
		} catch (ParseException e) {
			/* nothing to do, it what we want */
		}
	}

}
