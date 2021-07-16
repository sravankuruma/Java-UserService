package com.online.market.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.market.resource.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    User findById(int id) ;
}
