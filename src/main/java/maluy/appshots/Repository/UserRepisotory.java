package maluy.appshots.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import maluy.appshots.Model.User;

public interface UserRepisotory extends JpaRepository <User, Long>{

}