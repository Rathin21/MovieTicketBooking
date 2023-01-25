package com.example.BookMyShow.Service;

import com.example.BookMyShow.dto.BookTicketRequestDto;
import com.example.BookMyShow.dto.ResponseDto.TicketResponseDto;

public interface TicketService {
    
    TicketResponseDto getTicket(int id);

    TicketResponseDto bookTicket(BookTicketRequestDto bookTicketRequestDto);
}
