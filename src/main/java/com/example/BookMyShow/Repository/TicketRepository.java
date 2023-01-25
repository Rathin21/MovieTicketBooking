package com.example.BookMyShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookMyShow.Model.TicketEntity;

public interface TicketRepository extends JpaRepository<TicketEntity,Integer> {
    
}
