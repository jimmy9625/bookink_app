package com.co.booking.tasks;

import com.co.booking.inteactions.CloseAuth;
import com.co.booking.inteactions.EnterDestiantion;
import com.co.booking.inteactions.SelectDateReservation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class EnterInitalInformation implements Task {

    private String location;
    private String checkIn;
    private String checkOut;

    public EnterInitalInformation(String location, String checkIn, String checkOut) {
        this.location = location;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(CloseAuth.window(),
                EnterDestiantion.toFind(location),
                SelectDateReservation.to(checkIn, checkOut)
        );

    }

    public static EnterInitalInformation their(String location, String checkIn, String checkOut) {
        return new EnterInitalInformation(location, checkIn, checkOut);
    }
}
