package stepDefinitions;

import Utilities.Screenshotutility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.HookTestStep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import pages.Sauce_cart;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static stepDefinitions.Hooks.driver;

public class StepCart {

  //  private static final Logger logger =
    //        LogManager.getLogger(StepCart.class);

    Sauce_cart sc;

    @When("user clicks on add to cart")
    public void user_clicks_on_add_to_cart() {
       try {
           sc= new Sauce_cart(driver);
           sc.addcart();
       }
       catch ( Exception E){
           System.out.println(" Add Cart Button is not Click");

       }



    }
    @Then("user click on cart symbol")
    public void user_click_on_cart_symbol() {
        sc.cartsymb();
    }
    @Then("item should added in cart")
    public void item_should_added_in_cart() {
        try{
            sc.itemcart();

        }catch ( Exception E )
        {
            E.printStackTrace();
            throw E;

        }


    }

    @Then("add item must be visible in cart section")
    public void add_item_must_be_visible_in_cart_section() {
        sc.itemcart();
        Screenshotutility.captureScreenshot(driver,"Cart-Item is added");
    }

}
