package  maluy.appshots.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import  maluy.appshots.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}