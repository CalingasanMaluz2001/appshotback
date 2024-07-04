package  maluy.appshots.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import  maluy.appshots.Model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}