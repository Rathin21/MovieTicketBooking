package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookMyShow.Model.ShowEntity;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer>{
    
}
