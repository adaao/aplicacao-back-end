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
    
    public static Connection getConnetion(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        }catch(SQLException ex){
            System.out.println("SQLExeption: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return null;
        }catch(Exception e){
            System.out.println("Conexão não estabelecida.");
            return null;
        }
    }
}
