package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Sauce_login;

public class Step_Diff_user {
    WebDriver driver;
    Sauce_login sl;
    @Given("browser is open")
    public void launch_app_(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();


    }
    @And("Different user is on login page")
    public void login_page(){
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
    @When("^user enter (.*) and (.*)$")
    public void ent_user_pass(String username,String password){
        sl=new Sauce_login(driver);
        sl.enter_user(username);
        sl.enter_pass(password);}

    @And("Click on login button")
    public void click_bttn(){
        sl.click_lbttn();
    }
    @Then("landed on home page")
    public void check_userlogged(){

        String expected_head="Swag Labs";
        String actual_head=driver.getTitle();

        if (expected_head.equals(actual_head)){
            System.out.println("User logged successfully");
        }
        else {
            System.out.println("User Failed to login");
        }
        driver.quit();
    }


}
