package net.nmoncho.cassandraunit.dataset.cql;

import net.nmoncho.cassandraunit.dataset.CQLDataSet;

import java.io.InputStream;

/**
 * @author Jeremy Sevellec
 */
public class ClassPathCQLDataSet extends AbstractCQLDataSet implements CQLDataSet {

    public ClassPathCQLDataSet(String dataSetLocation) {
        super(dataSetLocation, true, true, null);
    }

    public ClassPathCQLDataSet(String dataSetLocation, boolean keyspaceCreation) {
      super(dataSetLocation, keyspaceCreation, true);
    }

    public ClassPathCQLDataSet(String dataSetLocation, boolean keyspaceCreation, boolean keyspaceDeletion) {
      super(dataSetLocation, keyspaceCreation, keyspaceDeletion);
    }

    public ClassPathCQLDataSet(String dataSetLocation, String keyspaceName) {
      super(dataSetLocation, true, true , keyspaceName);
    }

    public ClassPathCQLDataSet(String dataSetLocation, boolean keyspaceCreation, String keyspaceName) {
      super(dataSetLocation, keyspaceCreation, true, keyspaceName);
    }

    public ClassPathCQLDataSet(String dataSetLocation, boolean keyspaceCreation, boolean keyspaceDeletion, String keyspaceName) {
        super(dataSetLocation, keyspaceCreation, keyspaceDeletion, keyspaceName);
    }

    @Override
    protected InputStream getInputDataSetLocation(String dataSetLocation) {
        return this.getClass().getResourceAsStream("/" + dataSetLocation);
    }
}
