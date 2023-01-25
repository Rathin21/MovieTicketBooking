package com.example.BookMyShow.Controller;


import com.example.BookMyShow.Service.implementation.TheatreServiceImpl;
import com.example.BookMyShow.dto.EntryDto.TheatreEntryDto;
import com.example.BookMyShow.dto.ResponseDto.TheatreResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("theater")
public class TheatreController {
    
    @Autowired
    TheatreServiceImpl theaterService;


    @PostMapping("add")
    public TheatreResponseDto addTheater(@RequestBody() TheatreEntryDto theaterEntryDto){

        return theaterService.addTheater(theaterEntryDto);

    }
}
