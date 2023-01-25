package com.example.BookMyShow.Service;

import com.example.BookMyShow.dto.EntryDto.TheatreEntryDto;
import com.example.BookMyShow.dto.ResponseDto.TheatreResponseDto;

public interface TheatreService {
    
    TheatreResponseDto addTheater(TheatreEntryDto theaterEntryDto);

    TheatreResponseDto getTheater(int id);
}
