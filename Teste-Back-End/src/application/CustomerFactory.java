package application;

import model.bean.Customer;

/**
 *
 * @author adaao
 */
public class CustomerFactory {
    private static String[] firstNameList = {"Raquel", "Neo", "João", "Pedro", "Marcela", "Lindsey", "Trinity", "Arthur", "Sabrina", "Jubiscleibson"};
    private static String[] lastNameList =  {"Nascimento", "Oliveira", "Souza", "Smith", "Einstein", "Tesla", "Lamarino", "Zuckenberg", "Bongiovanni", "Madruga"};
    private static String[] cpfNumberList = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    
    private static int firstNameListLength = firstNameList.length;
    private static int lastNameListLength = lastNameList.length;
    private static int cpfNumberListLength = cpfNumberList.length;
    
    private static String getName(){
        int randA = (int) (Math.random() * firstNameListLength);
        int randB = (int) (Math.random() * lastNameListLength);
    
        return firstNameList[randA] + " " + lastNameList[randB];
    }
    
    private static String getCpf(){
        String cpf = "";
        
        for(int i=0; i<11; i++){
            int randC = (int) (Math.random() * cpfNumberListLength);
            cpf += cpfNumberList[randC];
        }
        
        return cpf;
    }
    
    private static int getIsActive(){
        int isActive;
        double aux;
        
        aux = (Math.random() * 1);
        
        if (aux > 0.5){
            isActive = 1;
        }else{
            isActive = 0;
        }
        
        return isActive;        
    }
    
    private static double getVlTotal(){
       int limit = 1000;
       return Math.random() * limit;
    }
    
    public static Customer getCustomer(){
        Customer customer = new Customer();
        
        customer.setCustomerName(getName());
        customer.setCnpjCpf(getCpf());
        customer.setIsActive(getIsActive());
        customer.setVlTotal(getVlTotal());
        
        return customer;
    }
}
