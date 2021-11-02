package com.laioffer.staybooking.repository;

import com.laioffer.staybooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//this folder is similar to DAO in the first project

//interface只提要求，不做具体的实现 vs class
@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
