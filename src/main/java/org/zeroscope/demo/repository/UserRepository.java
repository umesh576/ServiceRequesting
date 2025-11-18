package org.zeroscope.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zeroscope.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  // Custom query methods
  List<User> findByName(String name);
  User findByEmail(String email);
  List<User> findByAgeGreaterThan(Integer age);
}
