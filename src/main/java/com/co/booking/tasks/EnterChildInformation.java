package com.co.booking.tasks;

import com.co.booking.inteactions.SearchAgeChildren;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.booking.userinterfaces.FormHotelInfo.ADD_BUTTON;

public class EnterChildInformation implements Task {

    private String age;

    public EnterChildInformation(String age) {
        this.age = age;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (age.contains(",")) {

            String[] ages = age.split(",");

            for (int i = 0; i < ages.length; i++) {
                actor.attemptsTo(Click.on(ADD_BUTTON.of("children")),
                        SearchAgeChildren.to(ages[i]));

            }
        } else {
            actor.attemptsTo(Click.on(ADD_BUTTON.of("children")),
                    SearchAgeChildren.to(age));
        }

    }

    public static EnterChildInformation child(String age) {
        return new EnterChildInformation(age);
    }


}
