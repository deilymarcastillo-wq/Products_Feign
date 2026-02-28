package pe.castillo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.castillo.user.model.User;
import pe.castillo.user.service.IUserService;

import java.util.List;
//server.port=8081
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private IUserService usrService;

    @GetMapping
    public List<User> listOfUsers(){
        return usrService.findAll();
    }
    @GetMapping("/{user_id}")
    public User findUser(@PathVariable int user_id){
        return usrService.findById(user_id);
    }
    @PostMapping
    public User createUser(@RequestBody User user){
        return usrService.createUser(user);
    }

}
