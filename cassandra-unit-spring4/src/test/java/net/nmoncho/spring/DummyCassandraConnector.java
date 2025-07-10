package net.nmoncho.spring;

import com.datastax.oss.driver.api.core.CqlSession;
import net.nmoncho.utils.EmbeddedCassandraServerHelper;

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
