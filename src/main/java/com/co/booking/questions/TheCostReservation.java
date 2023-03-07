package com.co.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.booking.userinterfaces.PaymenPage.COST;

public class TheCostReservation implements Question<String> {




    @Override
    public String answeredBy(Actor actor) {
        return COST.resolveFor(actor).getText();

    }


    public static TheCostReservation inTheWeb()
    {
        return new TheCostReservation();
    }
}
