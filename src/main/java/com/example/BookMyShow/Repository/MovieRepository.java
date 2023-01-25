package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookMyShow.Model.MovieEntity;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {

    boolean existsByName(String name);
    
}
