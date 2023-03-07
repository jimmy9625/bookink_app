package com.co.booking.inteactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.booking.userinterfaces.FormHotelInfo.*;


public class EnterDestiantion implements Interaction {

    private String location;


    public EnterDestiantion(String location) {
        this.location = location;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(DESTINATION),
                Enter.theValue(location).into(DESTINATION_INPUT));

        actor.attemptsTo(Click.on(CITY));

    }

    public static EnterDestiantion toFind(String location) {
        return new EnterDestiantion(location);
    }
}
