package application;

import model.bean.Customer;
import model.dao.CustomerDAO;
/**
 *
 * @author adaao
 */

public class BackEndTest {

    public static void main(String[] args) throws ClassNotFoundException{
        CustomerDAO customerDao = new CustomerDAO();
        
        for (int i=0; i<3000; i++){
            customerDao.add(CustomerFactory.getCustomer());
        }
        
        
        
          
    }
    
}
