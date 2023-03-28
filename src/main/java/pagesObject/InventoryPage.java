package pagesObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage extends BasePage{

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement backpack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement bikeLight;

    @FindBy(css = "#shopping_cart_container span")
    WebElement cart;

    @FindBy(id = "checkout")
    WebElement checkout;
    @FindBy(className = "product_sort_container")
    WebElement sortDropDown;

    @FindBy(className = "inventory_item_price")
    WebElement highPrice;

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeBackpack;

    @FindBy(className = "shopping_cart_badge")
    WebElement shoppingCartBadge;

    @FindBy(id = "continue-shopping")
    WebElement continueShopping;


    public InventoryPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String Cart(){
        return cart.getText();
    }

    public void AddBackpack(){
        backpack.click();
    }

    public void AddBikeLight()
    {
        bikeLight.click();
    }

    public void ClickOnCart(){
        cart.click();
    }
    public void ClickCheckout(){
        checkout.click();
    }
    public void SortItemByText(String text){
        Select drop = new Select(sortDropDown);
        drop.selectByVisibleText(text);
    }

    public String Price(){
        return highPrice.getText();
    }

    public void RemoveBackpack(){
        removeBackpack.click();
    }

    public void ClickContinueShopping(){
        continueShopping.click();
    }
}
