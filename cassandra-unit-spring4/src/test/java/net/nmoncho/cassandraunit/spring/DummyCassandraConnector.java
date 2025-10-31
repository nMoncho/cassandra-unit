package net.nmoncho.cassandraunit.spring;

import com.datastax.oss.driver.api.core.CqlSession;
import net.nmoncho.cassandraunit.utils.EmbeddedCassandraServerHelper;

/**
 * @author Gaëtan Le Brun
 */
public class DummyCassandraConnector {

    private static int instancesCounter;
    private CqlSession session;

    public DummyCassandraConnector() {
        instancesCounter++;
    }

    public static void resetInstancesCounter() {
        instancesCounter = 0;
    }

    public static int getInstancesCounter() {
        return instancesCounter;
    }


    public CqlSession getSession() {
        return EmbeddedCassandraServerHelper.getSession();
    }
}
