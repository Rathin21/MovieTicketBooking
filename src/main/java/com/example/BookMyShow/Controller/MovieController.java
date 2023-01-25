package com.example.BookMyShow.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookMyShow.Service.implementation.MovieServiceImpl;
import com.example.BookMyShow.dto.EntryDto.MovieEntryDto;
import com.example.BookMyShow.dto.ResponseDto.MovieNameAndIdObject;
import com.example.BookMyShow.dto.ResponseDto.MovieResponseDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("movie")
public class MovieController {
    
    @Autowired
    MovieServiceImpl movieService;


    @PostMapping("/add")
    public MovieResponseDto addMovie(@RequestBody() MovieEntryDto movieEntryDto){

        MovieResponseDto movieResponseDto = movieService.addMovie(movieEntryDto);

        log.info("The movieResponseDto is ",movieResponseDto);
        return movieResponseDto;

    }

    @GetMapping("/get/{id}")
    public MovieNameAndIdObject getNameAndId(@PathVariable Integer id){

        MovieNameAndIdObject movieNameAndIdObject = movieService.getNameAndId(id);

        return movieNameAndIdObject;
    }
}
