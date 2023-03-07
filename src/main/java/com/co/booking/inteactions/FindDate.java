package com.co.booking.inteactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.booking.userinterfaces.FormHotelInfo.DAY_CALENDAR;
import static com.co.booking.userinterfaces.FormHotelInfo.DAY_MOUNT;

public class FindDate implements Interaction {

    private String date;

    public FindDate(String date) {
        this.date = date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        boolean find = false;
        String[] formatDateFind = date.split(" ");
        String dateWeb = DAY_MOUNT.resolveFor(actor).getAttribute("content-desc");


        while (!find) {

            String[] formatDateWeb = dateWeb.split(" ");
            String newDate = "01 " + sumMouth(formatDateWeb[1], formatDateWeb[2]);
            if (formatDateWeb[2].equals(formatDateFind[2])) {
                if (formatDateWeb[1].equals(formatDateFind[1])) {

                    actor.attemptsTo(Click.on(DAY_CALENDAR.of(date)));
                    find = true;
                } else {

                    actor.attemptsTo(SwipeUp.screen(DAY_CALENDAR.of(newDate)));
                }
            } else {

                actor.attemptsTo(SwipeUp.screen(DAY_CALENDAR.of(newDate)));
            }

            dateWeb = DAY_CALENDAR.of(newDate).resolveFor(actor).getAttribute("content-desc");


        }


    }

    public static FindDate whit(String date) {
        return new FindDate(date);
    }

    private String sumMouth(String mounth, String year) {
        int yearSum = Integer.parseInt(year);
        yearSum++;
        switch (mounth) {
            case "March":
                return "April " + year;

            case "April":
                return "May " + year;

            case "May":
                return "June " + year;

            case "June":
                return "July " + year;
            case "July":
                return "August " + year;

            case "August":
                return "September " + year;

            case "September":
                return "October " + year;

            case "October":
                return "November " + year;

            case "November":
                return "December " + year;

            case "December":
                return "January " + yearSum;

            case "January":
                return "February " + year;

            case "February":
                return "March " + year;


        }
        return null;
    }
}
