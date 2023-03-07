package com.co.booking.inteactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.booking.userinterfaces.FormHotelInfo.BUTTON_SELECT_DATES;

public class SelectDateReservation implements Interaction {

    private String checkIn;
    private String CheckOut;

    public SelectDateReservation(String checkIn, String checkOut) {
        this.checkIn = checkIn;
        this.CheckOut = checkOut;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        boolean find = false;

        actor.attemptsTo(FindDate.whit(checkIn),
                FindDate.whit(CheckOut),
                Click.on(BUTTON_SELECT_DATES));


    }

    public static SelectDateReservation to(String checkIn, String checkOut) {
        return new SelectDateReservation(checkIn, checkOut);
    }
}
