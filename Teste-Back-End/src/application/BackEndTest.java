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
        
        customer.setCustomerName("Adaão");
        customer.setCnpjCpf("33333344466");
        customer.setIsActive(1);
        customer.setVlTotal(2345.43);
        
        customerDao.add(customer);
        
        
          
    }
    
}
