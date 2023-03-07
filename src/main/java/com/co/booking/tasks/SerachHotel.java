package com.co.booking.tasks;

import com.co.booking.inteactions.FindNameTheHotel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.booking.userinterfaces.FormHotelInfo.*;

public class SerachHotel implements Task {

    private String hotelName;

    public SerachHotel(String hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(APPLY_BUTTON),
                Click.on(SEARCH_BUTTON),
                FindNameTheHotel.like(hotelName),
                Click.on(SELECT_ROOMS),
                Click.on(RESERVE));

    }


    public static SerachHotel whit(String hotelName) {
        return new SerachHotel(hotelName);
    }
}
