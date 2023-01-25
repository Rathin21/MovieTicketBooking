package com.example.BookMyShow.dto.EntryDto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.example.BookMyShow.dto.ResponseDto.MovieResponseDto;
import com.example.BookMyShow.dto.ResponseDto.TheatreResponseDto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class ShowEntryDto {
    
    @NonNull
    LocalDate showDate;

    @NonNull
    LocalTime showTime;

    @NonNull
    MovieResponseDto movieResponseDto;

    @NonNull
    TheatreResponseDto theatreResponseDto;
}
