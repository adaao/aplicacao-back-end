package application;

import java.util.ArrayList;
import model.bean.Customer;
import model.dao.CustomerDAO;

/**
 *
 * @author adaao
 */
public class BackEndTest{
    
    private CustomerDAO customerDAO;
    private ArrayList<Customer> customers;
    
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
        
        //Faz os inserts
        generateCustomers();
        
        //Guarda a média do campo vl_total para os itens que o valor é maior
        //que 560 e o campo id_customer esta entre 1500 e 2700
        avgVlTotal = customerDAO.getAvgVlTotal();
        
        //Guarda em customers os registros usados para o calculo da média
        customers = customerDAO.getUsedCustomers();
        
        System.out.printf("Média dos valores maiores que 560: %.2f\n\n", avgVlTotal);
        System.out.println("Registros utilizados para o calculo: ");
        for(Customer customer : customers){
            System.out.println("-------------------------------------------------------------------------------");
            System.out.print(customer.getCustomerId());
            System.out.print(" ");
            System.out.print(customer.getCustomerName());
            System.out.print(" ");
            System.out.print(customer.getCnpjCpf());
            System.out.print(" ");
            System.out.print(customer.getIsActive());
            System.out.print(" ");
            System.out.printf("%.2f", customer.getVlTotal());
            System.out.println();
            System.out.println();
            
        }
    }
    
}
