package pages;

import com.aventstack.extentreports.util.Assert;
import org.apache.hc.core5.util.Asserts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Sauce_cart {

    WebDriver driver;
    public Sauce_cart(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //private static final Logger logger =
          // LogManager.getLogger(Sauce_cart.class);

    @FindBy(xpath ="//button[text()='Add to cart' and  @name='add-to-cart-sauce-labs-backpack']")
    private WebElement addcartbtn;
    @FindBy(xpath="//a[@class='shopping_cart_link']")
    private WebElement cartsym;
    @FindBy(xpath="//div[text()='Sauce Labs Backpack']")
    private WebElement item;

    public void addcart(){
        System.out.println("Before Add cart Click");
        addcartbtn.click();
        System.out.println("After Add cart  Click");

    }
    public void cartsymb(){
        cartsym.click();


    }
    public void itemcart(){
        boolean items=item.isDisplayed();
       // logger.info("Item is Visible in Cart"+items);
    }

}
