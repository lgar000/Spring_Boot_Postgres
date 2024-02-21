package com.ada.Spring_Boot_Postgres.data.repository;

import com.ada.Spring_Boot_Postgres.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
