package model.dao;

import connection.ConnectionFactory;
import java.sql.*;
import model.bean.Customer;

/**
 *
 * @author adaao
 */
public class CustomerDAO {
    private Connection connection;
    
    public CustomerDAO() throws ClassNotFoundException{
        this.connection = ConnectionFactory.getConnetion();
    }
    
    public void add(Customer customer){
        String sql = "INSERT INTO tb_customer_account " +
                     "(cpf_cnpj, nm_customer, is_active, vl_total) " + 
                     "VALUES (?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //O id é gerado e incrementado automaticamente pelo banco de dados
            stmt.setString(1, customer.getCnpjCpf());
            stmt.setString(2, customer.getCustomerName());
            stmt.setInt(3, customer.getIsActive());
            stmt.setDouble(4, customer.getVlTotal());
            
            stmt.execute();
            stmt.close();
        }catch(SQLException ex){
            throw new RuntimeException (ex);
        }
    }
    
    
}
