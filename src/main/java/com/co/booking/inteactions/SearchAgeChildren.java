package com.co.booking.inteactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.booking.userinterfaces.FormHotelInfo.AGE_CHILDREN;
import static com.co.booking.userinterfaces.FormHotelInfo.OK_BUTOON;

public class SearchAgeChildren implements Interaction {

    private String age;

    public SearchAgeChildren(String age) {
        this.age = age;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        boolean find = false;

        while (!find) {
            String ageWhitText = AGE_CHILDREN.resolveFor(actor).getText();
            String[] ageWeb = ageWhitText.split(" ");
            if (age.equals(ageWeb[0])) {
                actor.attemptsTo(Click.on(OK_BUTOON));
                find = true;
            } else {
                actor.attemptsTo(SwipeUp.age(AGE_CHILDREN));
            }
        }


    }

    public static SearchAgeChildren to(String age) {
        return new SearchAgeChildren(age);
    }
}
