package com.hanghae99.airbnbclonebe.repository;

import com.hanghae99.airbnbclonebe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
