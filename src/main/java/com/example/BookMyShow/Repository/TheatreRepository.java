package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookMyShow.Model.TheatreEntity;

public interface TheatreRepository extends JpaRepository<TheatreEntity,Integer> {
    
}
