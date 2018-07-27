package vn.its.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.its.domain.User;
import vn.its.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return this.userService.addUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return this.userService.updateUser(user);
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable int id) {
        return this.userService.getUserById(id);
    }

    @DeleteMapping("/delete/all")
    public void deleteAllUsers() {
        this.userService.deleteAllUsers();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id) {
        this.userService.deleteUserById(id);
    }
}
