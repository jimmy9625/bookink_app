package com.co.booking.tasks;

import com.co.booking.inteactions.CounterSelector;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.booking.userinterfaces.FormHotelInfo.ROOMS;

public class SelectRoomsAndGuest implements Interaction {

    private int rooms;
    private int adults;


    private SelectRoomsAndGuest(int rooms, int adults) {
        this.adults = adults;
        this.rooms = rooms;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(ROOMS),
                CounterSelector.whit(rooms, "rooms"),
                CounterSelector.whit(adults, "adults"));


    }

    public static SelectRoomsAndGuest whit(int number, int adults) {
        return new SelectRoomsAndGuest(number, adults);
    }
}
