package com.co.booking.inteactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.booking.userinterfaces.FormHotelInfo.*;

public class CounterSelector implements Interaction {

    private String number;
    private String place;

    public CounterSelector(String number, String place) {
        this.number = number;
        this.place = place;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        int numbeResived = Integer.parseInt(number);
        int value= Integer.parseInt(VALUE.of(place).resolveFor(actor).getText());

        System.out.println(numbeResived);


        if (value < numbeResived) {
            for (int i = value;  i< numbeResived; i++) {
                actor.attemptsTo(Click.on(ADD_BUTTON.of(place)));
            }

        } else if (value > numbeResived) {
            for (int i =numbeResived ; i<= value;i++ )
            {
                actor.attemptsTo(Click.on(REMOVE_BUTTON.of(place)));
            }
        }



    }

    public static CounterSelector whit(String number, String name) {
        return new CounterSelector(number, name);
    }
}
