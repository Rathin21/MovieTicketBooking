package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookMyShow.Model.ShowSeatsEntity;

public interface ShowSeatsRepository extends JpaRepository<ShowSeatsEntity,Integer>{
    
}
