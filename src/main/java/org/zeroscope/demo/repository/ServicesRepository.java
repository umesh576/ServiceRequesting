package org.zeroscope.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zeroscope.demo.entity.Services;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long> {
  List<Services> findByServiceName(String serviceName);

  // Or if you want to find all services
  List<Services> findAll();

  // Or if you want to search by name containing text
  List<Services> findByServiceNameContaining(String name);
}
