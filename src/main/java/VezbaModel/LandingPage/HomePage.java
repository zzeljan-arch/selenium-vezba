package VezbaModel.LandingPage;

import VezbaModel.AbstractComponents.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractComponent {
    WebDriver driver;
    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//label[@class='logo']")
    public WebElement logo;

    @FindBy(xpath = "//button[@routerlink='/dashboard/myorders']")
    public WebElement orders;

    public String orderText(){
        return orders.getText();
    }

    public void goTo() {
        driver.navigate().to("https://rahulshettyacademy.com/client/#/dashboard/dash");
    }
}


