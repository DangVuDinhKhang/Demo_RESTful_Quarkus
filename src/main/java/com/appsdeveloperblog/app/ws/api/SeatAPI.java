package com.appsdeveloperblog.app.ws.api;

import java.util.List;

import com.appsdeveloperblog.app.ws.model.Seats;
import com.appsdeveloperblog.app.ws.service.SeatService;
import com.appsdeveloperblog.app.ws.service.SeatServiceImpl;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/seats")
public class SeatAPI {
    SeatService seatService = new SeatServiceImpl();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Seats> getAllSeats() {
        return seatService.getAllSeats();
    }

    @Transactional
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response bookingSeat(Seats seat) {
        seatService.bookingSeat(seat);
        return Response.status(Response.Status.CREATED).entity(seat).build();
    }
}
