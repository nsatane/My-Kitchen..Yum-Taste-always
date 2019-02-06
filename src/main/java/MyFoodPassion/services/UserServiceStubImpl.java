package MyFoodPassion.services;


import MyFoodPassion.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**@Service
public class UserServiceStubImpl implements UserService {
    @Override
    public boolean authenticate(String username, String password) {
        // Provide a sample password check: username == password
        return Objects.equals(username, password);
    }}

   /** @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findByUserName(String userName) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }
}**/