package com.example.BookMyShow.Controller;


import com.example.BookMyShow.Service.implementation.TicketServiceImpl;
import com.example.BookMyShow.dto.BookTicketRequestDto;
import com.example.BookMyShow.dto.ResponseDto.TicketResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("ticket")
public class TickerController {
    
    @Autowired
    TicketServiceImpl ticketService;

    @GetMapping("get/{id}")
    public TicketResponseDto getTicketById(@PathVariable Integer id){

        return ticketService.getTicket(id);
    }

    @PostMapping("/add")
    public TicketResponseDto addTicket(@RequestBody() BookTicketRequestDto bookTicketRequestDto){


        return ticketService.bookTicket(bookTicketRequestDto);

    }
}