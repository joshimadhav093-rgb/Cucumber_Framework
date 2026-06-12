package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.Sauce_cart;

public class StepCart {
    WebDriver driver;
    private static final Logger logger =
            LogManager.getLogger(StepCart.class);

    Sauce_cart sc;

    @When("user clicks on add to cart")
    public void user_clicks_on_add_to_cart() {
        sc= new Sauce_cart(driver);
        sc.addcart();
    }
    @Then("user click on cart symbol")
    public void user_click_on_cart_symbol() {
        sc.cartsymb();
    }
    @Then("item should added in cart")
    public void item_should_added_in_cart() {
        sc.itemcart();

    }

    @Then("add item must be visible in cart section")
    public void add_item_must_be_visible_in_cart_section() {
        sc.itemcart();
    }

}
