package org.zeroscope.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/services")
public class ServicesController {

  @GetMapping("/add")
  public String addServices() {
    return "Umesh Joshi is services";
  }
}
