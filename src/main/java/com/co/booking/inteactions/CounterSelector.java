package com.co.booking.inteactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.TextContent;

import static com.co.booking.userinterfaces.FormHotelInfo.VALUE;

public class CounterSelector implements Interaction {

    private String number;
    private String place;

    public CounterSelector(String number, String place) {
        this.number = number;
        this.place = place;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        int value = Integer.parseInt(TextContent.of(VALUE.of(place)).viewedBy(actor).asString());


    }

    public static CounterSelector whit(String number, String name) {
        return new CounterSelector(number, name);
    }
}
