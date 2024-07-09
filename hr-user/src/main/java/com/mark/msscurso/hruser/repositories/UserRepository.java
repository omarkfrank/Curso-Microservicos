package com.mark.msscurso.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mark.msscurso.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
