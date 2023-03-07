package com.co.booking.tasks;

import com.co.booking.inteactions.SwipeUp;
import com.co.booking.models.CreditCard;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.booking.userinterfaces.PaymenPage.*;

public class EnterPaymentInfo implements Task {

    private CreditCard info;

    public EnterPaymentInfo(CreditCard info) {
        this.info = info;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(info.getCardNumber()).into(NUMBER_CARD_INPUT),
                Enter.theValue(info.getHolderName()).into(HOLDERS_NAME),
                Enter.theValue(info.getExpirationDate()).into(EXPIRATION_DATE),
                SwipeUp.ToTotal(EXPIRATION_DATE));
        String value = COST.resolveFor(actor).getText();
        System.out.println(value);


    }


    public static EnterPaymentInfo whit(CreditCard info) {
        return new EnterPaymentInfo(info);
    }
}
