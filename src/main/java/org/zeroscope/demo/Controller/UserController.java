package org.zeroscope.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class UserController {

  @GetMapping("/")
  public String getAllUser() {
    return "Welcome to User Service!";
  }

  @GetMapping("/user/{id}")
  public String getUserById(@PathVariable String id) {
    return "User ID: " + id;
  }
}
