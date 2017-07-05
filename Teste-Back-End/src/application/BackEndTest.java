package application;

import model.bean.Customer;
import model.dao.CustomerDAO;

/**
 *
 * @author adaao
 */
public class BackEndTest{
    
    private CustomerDAO customerDAO;

    public BackEndTest() throws ClassNotFoundException{
        customerDAO = new CustomerDAO();
    }    
        
    private void generateCustomers(){
        for(int i=0; i<3000; i++){
            //Gera os customers e chama o método que realiza os inserts
            customerDAO.add(CustomerFactory.getCustomer());
        }
    }
    
    public void start(){
        
        double avgVlTotal = 0;
        
        generateCustomers();
        
        avgVlTotal = customerDAO.getAvgVlTotal();
        
        System.out.printf(" %.2f\n", avgVlTotal);
        
    }
    
}
