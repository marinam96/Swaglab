package pagesObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepPage extends BasePage{

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement zipCode;

    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(id = "finish")
    WebElement finishButton;

    @FindBy(className = "complete-header")
    WebElement completedOrder;

    public CheckoutStepPage(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void EnterFirstName(String name){
        firstName.sendKeys(name);
    }
    public void EnterLastName(String last)
    {
        lastName.sendKeys(last);
    }

    public void EnterZipCode(String zip)
    {
        zipCode.sendKeys(zip);
    }
     public void ClickContinue(){
        continueButton.click();
     }

     public void ClickFinish()
     {
         finishButton.click();
     }

     public String OrderCompleted(){
        return completedOrder.getText();
     }
}
