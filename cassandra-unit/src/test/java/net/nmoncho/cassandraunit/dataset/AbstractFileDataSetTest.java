package net.nmoncho.cassandraunit.dataset;

import net.nmoncho.cassandraunit.utils.FileTmpHelper;
import org.junit.Before;

public abstract class AbstractFileDataSetTest {

	protected String targetDataSetPathFileName = null;

	@Before
	public void before() throws Exception {

		targetDataSetPathFileName = FileTmpHelper.copyClassPathDataSetToTmpDirectory(this.getClass(),
				getDataSetClasspathRessource());
	}

	public abstract String getDataSetClasspathRessource();

}
