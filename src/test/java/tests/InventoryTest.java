package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagesObject.InventoryPage;
import pagesObject.LoginPage;
import pagesObject.StringParm;

public class InventoryTest extends BaseTest{

    ChromeDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;

    @BeforeMethod
    public void Before(){
        driver = openWebDriver();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);

    }

    @Test
    public void Buy2Products()
    {
        loginPage.Login(StringParm.VALID_USERNAME,StringParm.PASSWORD);
        inventoryPage.AddBackpack();
        inventoryPage.AddBikeLight();
        Assert.assertEquals(inventoryPage.Cart(),"2");
    }

    @AfterMethod
    public void After()
    {
        driver.quit();
    }
}
