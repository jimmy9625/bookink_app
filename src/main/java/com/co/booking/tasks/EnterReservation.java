package com.co.booking.tasks;

import com.co.booking.inteactions.SwipeUp;
import com.co.booking.models.PersonInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.booking.userinterfaces.FormInfoPerson.*;

public class EnterReservation implements Task {

    private PersonInformation information;

    public EnterReservation(PersonInformation information) {
        this.information = information;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(information.getFirstName()).into(FIRST_NAME),
                Enter.theValue(information.getLastName()).into(LAST_NAME),
                SwipeUp.screen(LAST_NAME),
                Enter.theValue(information.getEmail()).into(EMAIL),
                SwipeUp.screen(EMAIL),
                Enter.theValue(information.getAddres()).into(ADDRES),
                SwipeUp.screen(ADDRES),
                Enter.theValue(information.getZipCode()).into(ZIP_CODE),
                Enter.theValue(information.getCity()).into(CITY),
                SwipeUp.screen(CITY),
                Enter.theValue(information.getCountry()).into(COUNTRY),
                Enter.theValue(information.getMobilePhone()).into(MOBILE_PHONE),
                Click.on(PURPOSE.of(information.getPurpose())),
                Click.on(ADD_DETAILS),
                Click.on(FINAL_STEP));

    }

    public static EnterReservation the(PersonInformation information) {
        return new EnterReservation(information);
    }
}
