package application;

import connection.ConnectionFactory;
import java.sql.*;
import model.bean.Customer;
import model.dao.CustomerDAO;

/**
 *
 * @author adaao
 */

public class BackEndTest {

    public static void main(String[] args) throws ClassNotFoundException{
        Customer customer = new Customer();
        CustomerDAO customerDao = new CustomerDAO();
        
        
        customer.setCostumerId(1L);
        customer.setCustomerName("\'daao\'");
        customer.setCnpjCpf("\'5805089890\'");
        customer.setIsActive("\'y\'");
        customer.setVlTotal(1);
        
        customerDao.add(customer);
        
        
          
    }
    
}
