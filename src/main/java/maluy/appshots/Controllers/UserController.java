package maluy.appshots.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import maluy.appshots.Model.UserModel;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class UserController {
    
    //http:localhost:8080/user
    // @GetMapping("/user")
    // public UserModel getUser(){
    //     return new UserModel(1, "Maluz", "m.calingasangmail.com", "maluy");
    // }

    public String getMethodName(@RequestParam String param){
        return new String();
    }

    @GetMapping("/users")
    public List<UserModel> getUsers(){
        List<UserModel> users = new ArrayList<>();
        users.add(new UserModel(2, "maluy", "maluy@gmail.com", "ewan"));
        users.add(new UserModel(3, "calingasan", "calingasan@gmail.com", "lol"));
        users.add(new UserModel(4, "juan", "juan@gmail.com", "baho"));
        return users;
    }

    // http:localhost:8080/user/maluz
    @GetMapping ("/user/{name}")
    public UserModel getuserFromname(@PathVariable("name")String name){
        return new UserModel (4, "maluz", "maluz@gmail.com", "maluz");
    }
}

