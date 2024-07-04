package maluy.appshots.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import maluy.appshots.Model.Order;
import maluy.appshots.NotFoundException.OrderNotFoundException;
import maluy.appshots.Repository.OrderRepository;

@RestController
public class OrderController {
    
    OrderRepository repo;

    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    // GET ALL ORDERS
    // http://127.0.0.1:8080/orders
    @GetMapping("/orders")
    public List<Order> getOrders(){
        return repo.findAll();
    }

    // GET ONE ORDER
    // http://127.0.0.1:8080/order/1
    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(()-> new OrderNotFoundException(id));
    }

    // CREATE ENDPOINTS
    // http://127.0.0.1:8080/order/new
    @PostMapping("/order/new")
    public String addOrder(@RequestBody Order newOrder){
        repo.save(newOrder);
        return "A new order is added. Yey!";
    }

    // DELETE ENDPOINTS
    // http://127.0.0.1:8080/order/delete/1
    @DeleteMapping("/order/delete/{id}")
    public String deleteOrder(@PathVariable Long id){
        repo.deleteById(id);
        return "A order is deleted!";
    }
}