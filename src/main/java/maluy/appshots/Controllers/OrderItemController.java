package maluy.appshots.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import maluy.appshots.Model.OrderItem;
import maluy.appshots.NotFoundException.OrderItemNotFoundException;
import maluy.appshots.Repository.OrderItemRepository;

@RestController
public class OrderItemController {
    
    OrderItemRepository repo;

    public OrderItemController(OrderItemRepository repo) {
        this.repo = repo;
    }

    // GET ALL ORDER ITEMS
    // http://127.0.0.1:8080/orderitems
    @GetMapping("/orderitems")
    public List<OrderItem> getOrderItems(){
        return repo.findAll();
    }

    // GET ONE PRODUCT
    // http://127.0.0.1:8080/orderitem/1
    @GetMapping("/orderitem/{id}")
    public OrderItem getOrderItemById(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(()-> new OrderItemNotFoundException(id));
    }

    // CREATE ENDPOINTS
    // http://127.0.0.1:8080/orderitem/new
    @PostMapping("/orderitem/new")
    public String addOrderItem(@RequestBody OrderItem newOrderItem){
        repo.save(newOrderItem);
        return "A new order item is added. Yey!";
    }

    // DELETE ENDPOINTS
    // http://127.0.0.1:8080/product/delete/1
    @DeleteMapping("/orderitem/delete/{id}")
    public String deleteOrderItem(@PathVariable Long id){
        repo.deleteById(id);
        return "A orderitem is deleted!";
    }
}