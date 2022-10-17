package com.gmessiasc.SpringWebService.repositories;

import com.gmessiasc.SpringWebService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
