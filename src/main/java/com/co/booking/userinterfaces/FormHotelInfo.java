package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormHotelInfo {
  public static final Target DESTINATION = Target.the("camp enter you destination").locatedBy("//*[@text='Enter your destination']");
  public static final Target DESTINATION_INPUT = Target.the("input your destination").locatedBy("//*[@class='android.widget.EditText']");
  public static  final Target CITY=Target.the("card city select").locatedBy("//*[@resource-id='com.booking:id/view_disambiguation_destination_title']");
  public static final Target DAY_MOUNT= Target.the("day mounth").locatedBy("//*[@resource-id='com.booking:id/month_container']//*[@resource-id='com.booking:id/month_custom_view']//*[@class='android.view.View']");

  public static  final Target DAY_CALENDAR= Target.the("day in the calendar ").locatedBy("//android.view.View[@content-desc='{0}']");
  public static final  Target BUTTON_SELECT_DATES=Target.the("BUTTON SELECT DATES").located(By.id("com.booking:id/facet_date_picker_confirm"));
  public static final Target  VALUE= Target.the("Selec value").locatedBy("//*[@resource-id='com.booking:id/group_config_{0}_count']//*[@resource-id='com.booking:id/bui_input_stepper_value']");
  public static final Target ADD_BUTTON= Target.the("add button").locatedBy("//*[@resource-id='com.booking:id/group_config_{0}_count']//*[@resource-id='com.booking:id/bui_input_stepper_add_button']");
  public static final Target REMOVE_BUTTON= Target.the("add button").locatedBy("//*[@resource-id='com.booking:id/group_config_{0}_count']//*[@resource-id='com.booking:id/bui_input_stepper_remove_button']");
  public static final Target ROOMS = Target.the("target rooms").located(By.id("com.booking:id/facet_search_box_accommodation_occupancy"));
  public static final  Target AGE_CHILDREN =Target.the("Age children").locatedBy("//*[@resource-id='android:id/numberpicker_input']");
  public static final  Target OK_BUTOON =Target.the("Ok button age").located(By.id("android:id/button1"));
  public static final Target APPLY_BUTTON= Target.the("Apply button").located(By.id("com.booking:id/group_config_apply_button"));
  public static final Target SEARCH_BUTTON= Target.the("search button").located(By.id("com.booking:id/facet_search_box_cta"));
  public static final Target NAME_HOTEL= Target.the("Names hotels target").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
 public static final Target SELECT_ROOMS=Target.the("burron select rooms").located(By.id("com.booking:id/property_availability_cta_facetframe"));
 public  static final Target RESERVE = Target.the("Reserve this option button").located(By.id("com.booking:id/recommended_block_reserve_button"));

}
