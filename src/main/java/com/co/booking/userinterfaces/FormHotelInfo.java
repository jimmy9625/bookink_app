package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormHotelInfo {
  public static final Target DESTINATION = Target.the("camp enter you destination").locatedBy("//*[@text='Enter your destination']");
  public static final Target DESTINATION_INPUT = Target.the("input your destination").locatedBy("//*[@class='android.widget.EditText']");
  public static  final Target CITY=Target.the("card city select").locatedBy("//*[@resource-id='com.booking:id/view_disambiguation_destination_title']");
  public static  final Target DAY_CALENDAR= Target.the("day in the calendar ").locatedBy("//android.view.View[@content-desc='{0}']");
  public static final  Target BUTTON_SELECT_DATES=Target.the("BUTTON SELECT DATES").located(By.id("com.booking:id/facet_date_picker_confirm"));
  public static final Target  VALUE= Target.the("Selec value").locatedBy("//*[@resource-id='com.booking:id/group_config_{0}_count']//*[@resource-id='com.booking:id/bui_input_stepper_value']");
}
