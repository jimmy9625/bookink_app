package com.co.booking.tasks;

import com.co.booking.inteactions.CloseAuth;
import com.co.booking.inteactions.EnterDestiantion;
import com.co.booking.inteactions.SelectDateReservation;
import com.co.booking.inteactions.SelectRoomsAndGuest;
import com.co.booking.models.BookingInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SerachHotel implements Task {

    private BookingInfo infoHotel;

    private SerachHotel(BookingInfo infoHotel) {
        this.infoHotel = infoHotel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CloseAuth.window(),
                EnterDestiantion.toFind(infoHotel.getLocation()),
                SelectDateReservation.to(infoHotel.getCheckIn(), infoHotel.getCheckout()),
                SelectRoomsAndGuest.OnlyAdults("4", "5"));

    }


    public static SerachHotel whit(BookingInfo infoHotel) {
        return new SerachHotel(infoHotel);
    }
}
