package com.co.booking.inteactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class QuitFocus implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        MobileDriver driver = (AppiumDriver)BrowseTheWeb.as(actor).getDriver();


    }

    public static QuitFocus theElement()
    {
        return new QuitFocus();
    }
}
