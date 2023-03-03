package com.co.booking.stepsdetinition;

import com.co.booking.models.BookingInfo;
import com.co.booking.tasks.SerachHotel;
import com.co.booking.utils.Driver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class HotelReservationStepsDefinition {

    @Before
    public void set() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the (.*) opens the hotel booking application$")
    public void theUserOpensTheHotelBookingApplication(String user) {
        OnStage.theActorCalled(user).can(BrowseTheWeb.with(Driver.mobile()));


    }


    @When("^the user searches for hotels with the following information:$")
    public void theUserSearchesForHotelsWithTheFollowingInformation(List<BookingInfo> info) {
        OnStage.theActorInTheSpotlight().attemptsTo(SerachHotel.whit(info.get(0)));

        try {
            Thread.sleep(500000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @When("^the user completes the reservation form with the following details:$")
    public void theUserCompletesTheReservationFormWithTheFollowingDetails() {


    }

    @When("^the user completes the payment form with the following information:$")
    public void theUserCompletesThePaymentFormWithTheFollowingInformation() {

    }

    @Then("^the system should confirm the reservation and display the total cost in USD \\(\\$(\\d+),(\\d+)\\)\\.$")
    public void theSystemShouldConfirmTheReservationAndDisplayTheTotalCostInUSD$() {
        // Write code here that turns the phrase above into concrete actions

    }


}
