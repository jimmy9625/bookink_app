package com.co.booking.inteactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.co.booking.userinterfaces.FormHotelInfo.NAME_HOTEL;

public class FindNameTheHotel implements Interaction {

    private String name;

    public FindNameTheHotel(String name) {
        this.name = name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean find = false;
        actor.attemptsTo(WaitUntil.the(NAME_HOTEL, WebElementStateMatchers.isEnabled()));
        while (!find) {

            List<WebElementFacade> listName = NAME_HOTEL.resolveAllFor(actor);

            if (listName.get(0).getText().contains(name)) {
                actor.attemptsTo(Click.on(listName.get(0)));
                find = true;
            } else if (listName.get(1).getText().contains(name)) {
                System.out.println("entre");
                actor.attemptsTo(Click.on(listName.get(1)));
                find = true;
            } else {
                actor.attemptsTo(SwipeUp.screen(NAME_HOTEL));
            }

        }

    }


    public static FindNameTheHotel like(String name) {
        return new FindNameTheHotel(name);
    }

}
