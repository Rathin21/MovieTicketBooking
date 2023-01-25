package com.example.BookMyShow.converter;

import com.example.BookMyShow.Model.TheatreEntity;
import com.example.BookMyShow.dto.EntryDto.TheatreEntryDto;
import com.example.BookMyShow.dto.ResponseDto.TheatreResponseDto;

import lombok.experimental.UtilityClass;

@UtilityClass
public class TheatreConverter {
    
    public static TheatreEntity convertDtoToEntity(TheatreEntryDto theatreEntryDto){

        return TheatreEntity.builder().address(theatreEntryDto.getAddress())
                .city(theatreEntryDto.getCity()).name(theatreEntryDto.getName()).build();


    }

    public static TheatreResponseDto convertEntityToDto(TheatreEntity theatreEntity){

        return TheatreResponseDto.builder().id(theatreEntity.getId()).name(theatreEntity.getName())
                .city(theatreEntity.getCity()).address(theatreEntity.getAddress())
                .type(theatreEntity.getType())
                .build();
    }
}
