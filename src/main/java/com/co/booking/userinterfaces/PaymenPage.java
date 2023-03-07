package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymenPage {

    public static final Target NUMBER_CARD_INPUT = Target.the("card number input").located(By.id("com.booking:id/new_credit_card_number_edit"));
    public static final Target HOLDERS_NAME =Target.the("holder's Name input ").located(By.id("com.booking:id/new_credit_card_holder_edit"));
    public static final Target EXPIRATION_DATE = Target.the("Expiration Date input ").locatedBy("//*[@resource-id='com.booking:id/new_credit_card_expiry_date_edit']");
    public static final Target COST=Target.the("cost label").locatedBy("//*[@resource-id='com.booking:id/informative_cta_view_price_container']//*[@resource-id='com.booking:id/title']");



}
