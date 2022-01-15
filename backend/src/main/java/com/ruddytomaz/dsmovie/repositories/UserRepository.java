package com.ruddytomaz.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruddytomaz.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
