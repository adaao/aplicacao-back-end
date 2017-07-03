package model.bean;

/**
 *
 * @author adaao
 */
public class Costumer {
    private Long CostumerId;
    private String costumerName;
    private String cnpjCpf;
    private char isActive;
    private double vlTotal;

    public Long getCostumerId() {
        return CostumerId;
    }

    public void setCostumerId(Long CostumerId) {
        this.CostumerId = CostumerId;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getCnpjCpf() {
        return cnpjCpf;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }

    public char getIsActive() {
        return isActive;
    }

    public void setIsActive(char isActive) {
        this.isActive = isActive;
    }
    
    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        this.vlTotal = vlTotal;
    }
    
}
