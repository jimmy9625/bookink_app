package com.co.booking.inteactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.booking.userinterfaces.AuthUserInterface.CLOSE_AUTH;

public class CloseAuth implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(Click.on(CLOSE_AUTH));
    }

    public static  CloseAuth window()
    {
        return new CloseAuth();
    }
}
