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
                     "(id_customer, cpf_cnpj, nm_customer, is_active, vl_total) " + 
                     "VALUES (?,?,?,?,?)";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setLong(1, customer.getCustomerId());
            stmt.setString(2, customer.getCustomerName());
            stmt.setString(3, customer.getCnpjCpf());
            stmt.setString(4, customer.getIsActive());
            stmt.setDouble(5, customer.getVlTotal());
            
            stmt.execute();
            stmt.close();
        }catch(SQLException ex){
            throw new RuntimeException (ex);
            //System.out.println(ex);
        }
    }
    
    
}
