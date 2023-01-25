package com.example.BookMyShow.Service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enums.SeatType;
import com.enums.TheatreType;
import com.example.BookMyShow.Model.TheatreEntity;
import com.example.BookMyShow.Model.TheatreSeatEntity;
import com.example.BookMyShow.Repository.TheatreRepository;
import com.example.BookMyShow.Repository.TheatreSeatsRepository;
import com.example.BookMyShow.Service.TheatreService;
import com.example.BookMyShow.converter.TheatreConverter;
import com.example.BookMyShow.dto.EntryDto.TheatreEntryDto;
import com.example.BookMyShow.dto.ResponseDto.TheatreResponseDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TheatreServiceImpl implements TheatreService{

    @Autowired
    TheatreRepository theaterRepository;

    @Autowired
    TheatreSeatsRepository theaterSeatsRepository;

    @Override
    public TheatreResponseDto addTheater(TheatreEntryDto theaterEntryDto) {

        TheatreEntity theaterEntity = TheatreConverter.convertDtoToEntity(theaterEntryDto);


        //create the Seats
        List<TheatreSeatEntity> seats = createTheaterSeats();


        theaterEntity.setSeats(seats);
        //I need to set the theaterId for all these seats

        theaterEntity.setShows(null);

        for(TheatreSeatEntity theaterSeatsEntity:seats){
            theaterSeatsEntity.setTheatre(theaterEntity);
        }
        theaterEntity.setType(TheatreType.SINGLE);

        log.info("The theater entity is "+ theaterEntity);

        theaterEntity = theaterRepository.save(theaterEntity);
        theaterSeatsRepository.saveAll(seats);

        TheatreResponseDto theaterResponseDto = TheatreConverter.convertEntityToDto(theaterEntity);


        return theaterResponseDto;

    }

    List<TheatreSeatEntity> createTheaterSeats(){


        List<TheatreSeatEntity> seats = new ArrayList<>();

        seats.add(getTheaterSeat("1A",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1B",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1C",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1D",100,SeatType.CLASSIC));
        seats.add(getTheaterSeat("1E",100,SeatType.CLASSIC));

        seats.add(getTheaterSeat("2A",100,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2B",100,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2C",100,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2D",100,SeatType.PREMIUM));
        seats.add(getTheaterSeat("2E",100,SeatType.PREMIUM));


        

        return seats;
        //Add in this TheaterSeatEntity type

    }

    TheatreSeatEntity getTheaterSeat(String seatName, int rate, SeatType seatType){

        return TheatreSeatEntity.builder().seatNumber(seatName).rate(rate).seatType(seatType).build();
    }

    //Seperate function will be create...


    @Override
    public TheatreResponseDto getTheater(int id) {

        TheatreEntity theaterEntity = theaterRepository.findById(id).get();

        TheatreResponseDto theaterResponseDto = TheatreConverter.convertEntityToDto(theaterEntity);

        return theaterResponseDto;
    }
    
}
