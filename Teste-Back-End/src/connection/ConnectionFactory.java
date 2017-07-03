package connection;

import java.sql.*;

/**
 *
 * @author adaao
 */
public class ConnectionFactory {
    
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=dbBackEndTest";
    private static final String USER = "sa";
    private static final String PASS = "123456";
    
    public static Connection getConnetion() throws ClassNotFoundException{
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
}
