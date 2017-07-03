package application;

import connection.ConnectionFactory;
import java.sql.*;
/**
 *
 * @author adaao
 */

public class BackEndTest {

    public static void main(String[] args){
        System.out.println("Rodando!");
        try(Connection conn = ConnectionFactory.getConnetion();){
            System.out.println("Conexão estabelecida");
        }catch(ClassNotFoundException | SQLException e){
                throw new RuntimeException(e);
        }
          
    }
    
}
