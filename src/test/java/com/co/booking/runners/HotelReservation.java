package com.co.booking.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/hotel_reservation.feature",
        glue = "com.co.booking.stepsdetinition",
        snippets = SnippetType.CAMELCASE
)
public class HotelReservation {
}
