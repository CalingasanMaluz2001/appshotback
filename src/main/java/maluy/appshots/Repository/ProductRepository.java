package maluy.appshots.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import maluy.appshots.Model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
