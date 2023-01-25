package com.example.BookMyShow.converter;

import com.example.BookMyShow.Model.UserEntity;
import com.example.BookMyShow.dto.EntryDto.UserEntryDto;
import com.example.BookMyShow.dto.ResponseDto.UserResponseDto;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConverter {
    
    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto){


        return UserEntity.builder().name(userEntryDto.getName()).mobile(userEntryDto.getMobNo()).build();

    }

    public static UserResponseDto convertEntityToDto(UserEntity user){

        return UserResponseDto.builder().id(user.getId()).name(user.getName())
                .mobNo(user.getMobile()).build();

    }
}
