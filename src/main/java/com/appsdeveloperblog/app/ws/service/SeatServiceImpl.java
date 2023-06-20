package com.appsdeveloperblog.app.ws.service;

import java.util.List;

import com.appsdeveloperblog.app.ws.dao.SeatDAO;
import com.appsdeveloperblog.app.ws.model.Seats;

import jakarta.inject.Inject;
import jakarta.ws.rs.InternalServerErrorException;

public class SeatServiceImpl implements SeatService{
    @Inject
    SeatDAO seatDAO = new SeatDAO();

    @Override
    public void bookingSeat(Seats seats){
        try{
            seatDAO.bookingSeat(seats);
        }
        catch(Exception e){
            throw new InternalServerErrorException(e.getMessage());
        }
    }

    @Override
    public List<Seats> getAllSeats(){
        return seatDAO.getAllSeats();
    }
}
