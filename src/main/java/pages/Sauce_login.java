package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauce_login {
WebDriver driver;
     public  Sauce_login(WebDriver driver){
         this.driver=driver;
         PageFactory.initElements(driver,this);
     }

    @FindBy(xpath ="//input[@name='user-name']")
    private WebElement user_name;
    @FindBy(xpath ="//input[@name='password']")
    private WebElement pass;
    @FindBy(xpath="//input[@id='login-button']")
    private WebElement login_bttn;

    public void enter_user(String username){

        user_name.sendKeys(username);
    }

    public void enter_pass(String password){
        pass.sendKeys(password);
    }

    public void click_lbttn (){
        login_bttn.click();
    }

}
