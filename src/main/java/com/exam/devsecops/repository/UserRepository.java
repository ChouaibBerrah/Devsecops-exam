package com.exam.devsecops.repository;

import com.exam.devsecops.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
