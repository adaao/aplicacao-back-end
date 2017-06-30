package application;

import connection.ConnectionFactory;
import java.sql.*;
/**
 *
 * @author adaao
 */

public class BackEndTest {

    public static void main(String[] args) {
        System.out.println("Rodando!");
        System.out.println("Estabelecendo conexão...");
        Connection conn = ConnectionFactory.getConnetion();
        if (conn != null){
            System.out.println("Conexão estabelecida.");
        }
          
    }
    
}
