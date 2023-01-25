package com.example.BookMyShow.dto.ResponseDto;

import java.util.List;

import com.example.BookMyShow.dto.TicketDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseDto {
    
    int id;

    String name;

    String mobNo;

    //Optional
    List<TicketDto> tickets;
}
