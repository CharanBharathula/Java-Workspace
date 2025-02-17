package BackendCourse.Assignments.DesignPatterns.Singleton.DBConfig;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPoolImpl implements ConnectionPool {
    private static ConnectionPoolImpl instance;
    private Queue<DatabaseConnection> connectionPool;
    int maxConnections;

    private ConnectionPoolImpl() {
    }

    public static ConnectionPool getInstance( int maxConnections ){
        if( instance == null ){
            instance = new ConnectionPoolImpl();
            instance.maxConnections = maxConnections;
            instance.initializePool();
        }
        return instance;
    }

    public void resetInstance(){
        instance = null;
    }

    @Override
    public void initializePool() {
        connectionPool = new LinkedList<>();
        for( int i = 0; i < maxConnections; i++ ){
            connectionPool.add( new DatabaseConnection() );
        }
    }

    @Override
    public DatabaseConnection getConnection() {
        if( connectionPool.isEmpty() )
            throw new IllegalStateException("No available connections in the pool");
        return connectionPool.poll();
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        connectionPool.add( connection );
    }

    @Override
    public int getAvailableConnectionsCount() {
        return connectionPool.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxConnections;
    }
}
