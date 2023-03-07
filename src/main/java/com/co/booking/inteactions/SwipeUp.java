package com.co.booking.inteactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class SwipeUp implements Interaction {


    private Target target;

    private int roller;

    public SwipeUp(Target target) {
        this.target = target;
        this.roller = 650;
    }

    public SwipeUp(Target target, int roller) {
        this.target = target;
        this.roller = roller;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        MobileDriver driver = (AppiumDriver) BrowseTheWeb.as(actor).getDriver();
        MobileElement element = (MobileElement) driver.findElement(By.xpath(target.getCssOrXPathSelector()));

        Dimension screenSize = driver.manage().window().getSize();

        int startX = element.getLocation().getX();
        int startY = element.getLocation().getY();
        int endX = startX;
        int endY = startY - roller;

        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();


    }


    public static SwipeUp screen(Target target) {
        return new SwipeUp(target);
    }

    public static SwipeUp ToTotal(Target target) {
        return new SwipeUp(target, 800);
    }

    public static SwipeUp age(Target target) {
        return new SwipeUp(target, 150);
    }


}
