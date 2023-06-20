package com.appsdeveloperblog.app.ws.dao;

import java.util.List;

import com.appsdeveloperblog.app.ws.model.Seats;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SeatDAO implements PanacheRepositoryBase<Seats, Long>{
    public SeatDAO(){

    }

    public void bookingSeat(Seats seats){
        try{
            persistAndFlush(seats);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public List<Seats> getAllSeats(){
        try{
            return listAll();
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        
    }
}
