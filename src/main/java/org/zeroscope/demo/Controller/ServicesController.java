package org.zeroscope.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.zeroscope.demo.entity.Services;
import org.zeroscope.demo.repository.ServicesRepository;

@RestController
@RequestMapping("/services")
public class ServicesController {

  @Autowired
  private ServicesRepository servicesRepository;

  // @Post("/add")
  @PostMapping("/add")
  public Services createServices(@RequestBody Services services) {
    return servicesRepository.save(services);
  }
}
