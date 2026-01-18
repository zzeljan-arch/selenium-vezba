package VezbaTests.Tests;

import VezbaModel.LandingPage.HomePage;
import VezbaModel.LandingPage.LandingPage;
import VezbaTests.baseTest.BaseTest;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends BaseTest{

    @Test
    public void homeTest() throws IOException{
        LandingPage landingPage = launchApplication();
        Assert.assertTrue(landingPage.userEmail.isDisplayed());

    }

    @Test
    public void loginTest() throws IOException, InterruptedException {

        HomePage homePage = landingPage.loginApplication("testmail@example.io", "StrongPass1!");
       // HomePage homePage = goToHomePage();
        Assert.assertTrue(homePage.logo.isDisplayed(), "Nije uspesan login");
      //  Assert.assertTrue(landingPage.userEmail1().isDisplayed(), "Email nije ispisan na stranici");
        Assert.assertEquals(homePage.orderText(), "qwoerkqw", "qwoerkqw Nije prikazan");
    }

}
