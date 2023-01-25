package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookMyShow.Model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{
    
}
