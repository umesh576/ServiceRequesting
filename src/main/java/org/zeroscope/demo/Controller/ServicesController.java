package org.zeroscope.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class ServicesController {

  @RequestMapping("/services")
  @GetMapping("/add")
  public String addServices() {
    return "umehs joshi is services";
  }
}
