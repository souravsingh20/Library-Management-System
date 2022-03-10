package com.quinbay.SpringBookUser.bookuser.repository;

import com.quinbay.SpringBookUser.bookuser.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
