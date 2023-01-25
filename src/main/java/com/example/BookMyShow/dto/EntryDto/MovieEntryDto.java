package com.example.BookMyShow.dto.EntryDto;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MovieEntryDto {
    
    String name;

    LocalDate releaseDate;
}
