package VezbaModel.LandingPage;

import VezbaModel.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponent {

    WebDriver driver;
    public LandingPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    public WebElement userEmail1(){
//        return driver.findElement(By.id("userEmail"));
//    }
    @FindBy(id = "userEmail")
    public WebElement userEmail;
    @FindBy(id = "userPassword")
    public WebElement userPassword;
    @FindBy(id = "login")
    public WebElement submit;
    @FindBy(css = "[class*='flyInOut'")
    public WebElement errorMessage;


    public HomePage loginApplication(String email, String password) {

        userEmail.sendKeys(email);
        userPassword.sendKeys(password);
        submit.click();
        HomePage homePage = new HomePage(driver);
        return homePage;

    }

    public void goTo() {
        driver.navigate().to("https://rahulshettyacademy.com/client");
    }



}
