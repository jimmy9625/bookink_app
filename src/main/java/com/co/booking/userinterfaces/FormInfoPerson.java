package com.co.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormInfoPerson {
    public static final Target LAST_NAME = Target.the("input lastname").locatedBy("//*[@resource-id='com.booking:id/bstage1_contact_lastname_value']//*[@resource-id='com.booking:id/bui_input_container_content']");
    public static final Target FIRST_NAME = Target.the("input frist name").locatedBy("//*[@resource-id='com.booking:id/bstage1_contact_firstname_value']//*[@resource-id='com.booking:id/bui_input_container_content']");
    public static final Target EMAIL = Target.the("input email").locatedBy("//*[@resource-id='com.booking:id/bstage1_contact_email_value']//*[@resource-id='com.booking:id/bui_input_container_content']");
    public static final Target COUNTRY = Target.the("input country").locatedBy("//*[@resource-id='com.booking:id/bstage1_contact_country_value']//*[@resource-id='com.booking:id/bui_input_container_content']");
    public static final Target ADDRES = Target.the("input Addres").locatedBy("//*[@resource-id='com.booking:id/bstage1_contact_address_value']//*[@resource-id='com.booking:id/bui_input_container_content']");
    public static final Target ZIP_CODE = Target.the("input zip Code").locatedBy("//*[@resource-id='com.booking:id/bstage1_contact_zipcode_value']//*[@resource-id='com.booking:id/bui_input_container_content']");
    public static final Target CITY = Target.the("input city").locatedBy("//*[@resource-id='com.booking:id/bstage1_contact_city_value']//*[@resource-id='com.booking:id/bui_input_container_content']");

    public static final Target MOBILE_PHONE = Target.the("input mobile phone").locatedBy("//*[@resource-id='com.booking:id/bstage1_contact_telephone_value']//*[@resource-id='com.booking:id/bui_input_container_content']");
    public static final Target PURPOSE = Target.the("input purpose").locatedBy("//*[@resource-id='com.booking:id/business_purpose_{0}']");
    public static final Target ADD_DETAILS = Target.the("input lastname").located(By.id("com.booking:id/action_button"));
    public static final Target FINAL_STEP = Target.the("button final step ").located(By.id("com.booking:id/action_button"));
}
