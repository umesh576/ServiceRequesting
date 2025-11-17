package org.zeroscope.demo.Controller;

import org.springframework.web.bind.annotation.RequestBody;

// package org.zeroscope.demo.models.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/service")
public class UserController {

    @PostMapping
    
    
  public User createUser(@RequestBody User) {}
}
