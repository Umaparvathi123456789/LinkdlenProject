package com.uma.linkdlen.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uma.linkdlen.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	Optional<User> findById(Long id);

	void deleteById(Long id);


}
