package com.co.booking.inteactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.booking.userinterfaces.FormHotelInfo.*;

public class CounterSelector implements Interaction {

    private int number;
    private String place;

    public CounterSelector(int number, String place) {
        this.number = number;
        this.place = place;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        int value= Integer.parseInt(VALUE.of(place).resolveFor(actor).getText());

        if (value < number) {
            for (int i = value;  i< number; i++) {
                actor.attemptsTo(Click.on(ADD_BUTTON.of(place)));
            }

        } else if (value > number) {
            for (int i =number ; i<= value;i++ )
            {
                actor.attemptsTo(Click.on(REMOVE_BUTTON.of(place)));
            }
        }

    }

    public static CounterSelector whit(int number, String name) {
        return new CounterSelector(number, name);
    }
}
