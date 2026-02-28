package pe.castillo.user.service.impl;

import org.springframework.stereotype.Service;
import pe.castillo.user.model.User;
import pe.castillo.user.service.IUserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private List<User> users;

    public UserServiceImpl(){

        this.users = new ArrayList<>();
        User user1 = new User(1,"Deilymar","Castillo",959385263);
        User user2 = new User(2,"Rodrigo","Pajares",987654321);

        this.users.addAll(Arrays.asList(user1,user2));
    }

    @Override
    public User createUser(User user) {
        this.users.add(user);
        return user;
    }

    @Override
    public List<User> findAll() {
        return this.users;
    }

    @Override
    public User findById(int user_id) {
        for(User usr : this.users){
            if(usr.getUser_id() == user_id){
                return usr;
            }
        }
    return null;
    }
}
