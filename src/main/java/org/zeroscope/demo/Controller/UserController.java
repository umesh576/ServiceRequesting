package org.zeroscope.demo.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zeroscope.demo.entity.User;
import org.zeroscope.demo.repository.UserRepository;

@RestController
@RequestMapping("/service")
public class UserController {

  @Autowired
  private UserRepository userRepository;

  // Get all users
  @GetMapping("/users")
  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  // Get user by ID
  @GetMapping("/user/{id}")
  public User getUserById(@PathVariable Long id) {
    Optional<User> user = userRepository.findById(id);
    return user.orElse(null); // Returns null if not found
  }

  // Create new user
  @PostMapping("/user")
  public User createUser(@RequestBody User user) {
    return userRepository.save(user);
  }

  // Update user
  @PutMapping("/user/{id}")
  public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
    User user = userRepository.findById(id).orElseThrow();
    user.setName(userDetails.getName());
    user.setEmail(userDetails.getEmail());
    user.setAge(userDetails.getAge());
    return userRepository.save(user);
  }

  // Delete user
  @DeleteMapping("/user/{id}")
  public String deleteUser(@PathVariable Long id) {
    userRepository.deleteById(id);
    return "User deleted successfully";
  }

  // Find users by name
  @GetMapping("/users/name/{name}")
  public List<User> getUsersByName(@PathVariable String name) {
    return userRepository.findByName(name);
  }
}
