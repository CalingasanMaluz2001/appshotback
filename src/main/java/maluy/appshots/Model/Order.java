package  maluy.appshots.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ordertbl")
public class Order {

    private @Id
    @GeneratedValue Long id;
    private Long userId;
    private double totalAmmount;
    private String status;
    
    Order(){}

    public Order(Long userId, double totalAmmount, String status) {
        this.userId = userId;
        this.totalAmmount = totalAmmount;
        this.status = status;
    }

    // Setters
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setTotalAmmount(double totalAmmount) {
        this.totalAmmount = totalAmmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    // Getters
    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public double getTotalAmmount() {
        return totalAmmount;
    }

    public String getStatus() {
        return status;
    }

}
