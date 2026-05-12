package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Sauce_login;

public class Step_login {
    WebDriver driver;
    Sauce_login sl;
    @Given("Browser is open")
    public void launch(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
    }
    @And("Standard user is on login page")
    public void homepage (){
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }
    @Then("^User Enter (.*) and (.*)$")
    public void enter_user_pass(String username,String password){
       sl = new Sauce_login(driver);
        sl.enter_user(username);
        sl.enter_pass(password);
    }
    @When("click on login button")
    public void click_btn (){
        sl.click_lbttn();
    }

    @Then("user land on home page")
    public void valid_Homepage(){
        driver.quit();
    }

}
