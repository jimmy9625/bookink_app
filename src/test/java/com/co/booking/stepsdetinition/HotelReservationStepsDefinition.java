package com.co.booking.stepsdetinition;

import com.co.booking.models.CreditCard;
import com.co.booking.models.PersonInformation;
import com.co.booking.questions.TheCostReservation;
import com.co.booking.tasks.*;
import com.co.booking.userinterfaces.utils.Driver;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HotelReservationStepsDefinition {

    @Before
    public void set() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the (.*) opens the hotel booking application$")
    public void theUserOpensTheHotelBookingApplication(String user) {
        OnStage.theActorCalled(user).can(BrowseTheWeb.with(Driver.mobile()));

    }


    @Then("^the system should confirm the reservation and display the total cost in (.*)$")
    public void theSystemShouldConfirmTheReservationAndDisplayTheTotalCostInUSD$(String cost) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheCostReservation.inTheWeb(), Matchers.equalTo(cost)));

    }


    @When("^the user searches for their desired (.*) and selects the (.*) and (.*) dates$")
    public void theUserSearchesForTheirDesiredLocationCuscoAndSelectsTheCheckInAndCheckoutDatesMarchAndMarch(String location, String checkIn, String checkOut) {
        theActorInTheSpotlight().attemptsTo(EnterInitalInformation.their(location, checkIn, checkOut));

    }

    @And("^selects (.*) and (.*) adults$")
    public void selectsRoomsAndAdults(int rooms, int adults) {
        theActorInTheSpotlight().attemptsTo(SelectRoomsAndGuest.whit(rooms, adults));
    }


    @And("^enters the age of any accompanying children (.*)$")
    public void entersTheAgeOfAnyAccompanyingChildren(String age) {

        theActorInTheSpotlight().attemptsTo(EnterChildInformation.child(age));
    }


    @And("^searches for the (.*)$")
    public void searchesForTheHotel(String name) {
        theActorInTheSpotlight().attemptsTo(SerachHotel.whit(name));
    }

    @When("^completes the reservation form with the following details:$")
    public void completesTheReservationFormWithTheFollowingDetails(List<PersonInformation> personInformations) {
        theActorInTheSpotlight().attemptsTo(EnterReservation.the(personInformations.get(0)));

    }

    @When("^completes the payment form with the following information:$")
    public void completesThePaymentFormWithTheFollowingInformation(List<CreditCard> creditCard) {
        theActorInTheSpotlight().attemptsTo(EnterPaymentInfo.whit(creditCard.get(0)));


    }
}
