package com.appsdeveloperblog.app.ws.service;

import java.util.List;

import com.appsdeveloperblog.app.ws.model.Seats;

public interface SeatService {
    public void bookingSeat(Seats seats);

    public List<Seats> getAllSeats();
}
