package pe.castillo.user.service;

import pe.castillo.user.model.User;

import java.util.List;

public interface IUserService {

    User createUser(User user);

    List<User> findAll();

    User findById(int user_id);

}
