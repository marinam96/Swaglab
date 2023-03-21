import PageObject.InventoryPage;
import PageObject.loginPage;
import Test.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InventoryTest extends BaseTest{

    ChromeDriver driver;

    loginPage loginPage;

    InventoryPage inventoryPage;

    @BeforeMethod
    public void Before(){
        driver = openWebDriver();
        loginPage = new loginPage(driver);
        inventoryPage = new InventoryPage(driver);
    }
    @Test
    public void Buy2Products()
    {
        loginPage.Login("standard", "secret_sauce");
        inventoryPage.AddBackpack();
        inventoryPage.AddBikeLight();
        Assert.assertEquals(inventoryPage.Cart(), "2");
    }
    @AfterMethod
    public  void After(){
        driver.quit();
    }
}
