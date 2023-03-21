package Test;

import PageObject.StringParm;
import PageObject.loginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    ChromeDriver driver;

   loginPage loginPage;

    @BeforeMethod
    public void SetUp()
    {
        driver = openWebDriver();
        loginPage = new loginPage(driver);
    }

    @Test
    public void loginWithValidData(){
        loginPage.Login(StringParm.VALID_USERNAME,StringParm.PASSWORD);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    public void loginWithNoValidData(){
        loginPage.Login(StringParm.NO_VALID_USERNAME,StringParm.PASSWORD);
        Assert.assertEquals(loginPage.getTextMessage(), "Epic sadface: Username and password do not match any user in this service");
    }

    @AfterMethod
    public void After()
    {
        driver.quit();
    }
}

