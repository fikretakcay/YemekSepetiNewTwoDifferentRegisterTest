package PageObjectModelsForRegister;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilitie.Driver;

public abstract class AbstractClass {
    private WebDriver driver = Driver.getDriver();

//    WebDriverWait wait = new WebDriverWait(driver,10);

    public void clickFunction(WebElement clickElement){

        clickElement.click();
    }
    public void sendKeysFunction(WebElement sendKeysElement , String value){

        sendKeysElement.sendKeys(value);
    }

    public boolean isEnabledFunction(WebElement isEnabledElement){

        return isEnabledElement.isEnabled();

    }

    public void selectElementDropDown(WebElement dropDown,String element){

        Select slc = new Select(dropDown);

        slc.selectByValue(element);
    }
}
