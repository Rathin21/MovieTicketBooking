package com.example.BookMyShow.dto;

import com.example.BookMyShow.dto.ResponseDto.ShowResponseDto;
import com.example.BookMyShow.dto.ResponseDto.UserResponseDto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class TicketDto {
    
    int id;

    String alloted_seats;

    double amount;

    ShowResponseDto showDto;

    @NonNull
    UserResponseDto userDto; 
}
