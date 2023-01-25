package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookMyShow.Model.TheatreSeatEntity;

public interface TheatreSeatsRepository extends JpaRepository<TheatreSeatEntity,Integer>{
    
}
