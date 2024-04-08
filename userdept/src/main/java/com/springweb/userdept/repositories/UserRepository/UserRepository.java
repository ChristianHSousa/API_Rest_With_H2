package com.springweb.userdept.repositories.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springweb.userdept.entities.User.User;

public interface UserRepository extends JpaRepository<User, Long> {

    
}
