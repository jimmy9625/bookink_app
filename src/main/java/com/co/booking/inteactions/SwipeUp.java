package com.co.booking.inteactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class SwipeUp implements Interaction {

    private WebElementFacade target;


    public SwipeUp(WebElementFacade target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        MobileDriver driver = (AppiumDriver) BrowseTheWeb.as(actor).getDriver();

        Dimension screenSize = driver.manage().window().getSize();

        int startX = screenSize.getWidth() / 2;
        int startY = (int) (screenSize.getHeight() * 0.8);
        int endX = startX;
        int endY = target.getLocation().getY();

        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }


    public static SwipeUp To(WebElementFacade target) {
        return new SwipeUp(target);
    }


}
