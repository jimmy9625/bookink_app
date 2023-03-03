package com.co.booking.inteactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.booking.userinterfaces.FormHotelInfo.ROOMS;

public class SelectRoomsAndGuest implements Interaction {

    private String number;
    private String adults;
    private String children;
    private String ageChildren;

    private SelectRoomsAndGuest(String number, String adults) {
        this.adults = adults;
        this.number = number;

    }

    public SelectRoomsAndGuest(String number, String adults, String children, String ageChildren) {
        this.number = number;
        this.adults = adults;
        this.children = children;
        this.ageChildren = ageChildren;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(ROOMS),
                CounterSelector.whit(number, "rooms"),
                CounterSelector.whit(adults, "adults"));


    }

    public static SelectRoomsAndGuest OnlyAdults(String number, String adults) {
        return new SelectRoomsAndGuest(number, adults);
    }
}
