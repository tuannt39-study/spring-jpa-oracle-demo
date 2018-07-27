package vn.its.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.its.domain.User;
import vn.its.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public User addUser(User user) {
        return this.userRepository.save(user);
    }

    public Optional<User> getUserById(int id) {
        return this.userRepository.findById(id);
    }

    public User updateUser(User user) {
        return this.userRepository.save(user);
    }

    public void deleteUserById(int id) {
        this.userRepository.deleteById(id);
    }

    public void deleteAllUsers() {
        this.userRepository.deleteAll();
    }
}
