package com.example.BookMyShow.dto;
import java.util.Set;
import com.enums.SeatType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookTicketRequestDto {
    
    int id; // user id
    int showId;
    SeatType seatType;
    Set<String> requestedSeats;
}
