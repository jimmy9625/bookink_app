package com.co.booking.tasks;

import com.co.booking.inteactions.CloseAuth;
import com.co.booking.inteactions.EnterDestiantion;
import com.co.booking.inteactions.SelectDateReservation;
import com.co.booking.models.HotelInfoOnlyAdult;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SerachHotel implements Task {

    private HotelInfoOnlyAdult infoHotel;

    private SerachHotel(HotelInfoOnlyAdult infoHotel) {
        this.infoHotel = infoHotel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CloseAuth.window(),
                EnterDestiantion.toFind(infoHotel.getLocation()),
                SelectDateReservation.to(infoHotel.getCheckIn(), infoHotel.getCheckout()));

    }


    public static SerachHotel whit(HotelInfoOnlyAdult infoHotel) {
        return new SerachHotel(infoHotel);
    }
}
