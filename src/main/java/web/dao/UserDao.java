package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser(User user);

    void deleteById(Long id);

    void updateUser(User user);

    User findById(Long id);
}
