package PageObjectModelsForRegister;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitie.Driver;

import java.util.concurrent.TimeUnit;

public class loginPage extends AbstractClass{

    private WebDriver driver;

    public loginPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(xpath = "(//span[@class=\"plateNo\"])[34]")

    private WebElement chooseCity;

    public void clickChooseCity()
    {
        clickFunction(chooseCity);
    }

    @FindBy(xpath = "//a[@href=\"/istanbul-uye-ol\"]")

    private WebElement newAccountButton;

    public void clickNewAccountButton(){
        clickFunction(newAccountButton);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @FindBy(id = "inputEmail")

    private WebElement clickEmailText;

    public void clickEmailTextExapmle(){
        clickFunction(clickEmailText);
    }

    @FindBy(xpath = "(//input[@type=\"text\"])[1]")

    private WebElement emailAccount;

    public void type_email(String email){
        sendKeysFunction(emailAccount,email);
    }

    @FindBy(id = "inputPassword")

    private WebElement passwordForAccount;

    public void sendKeysPasswordForAccount(String password){
        sendKeysFunction(passwordForAccount,password);
    }

    @FindBy(id = "inputRepeatPassword")

    private WebElement passwordForAccountAgain;

    public void sendKeysPasswordForAccountAgain(){
        sendKeysFunction(passwordForAccountAgain,"fik123");
    }

    @FindBy(id = "inputFirstName")
    private WebElement firstname;

    @FindBy(id = "inputLastName")
    private WebElement lastname;
    public void sendKeysFirstNameLastName(String firstName , String lastName){
        sendKeysFunction(firstname,firstName);
        sendKeysFunction(lastname,lastName);
    }

    @FindBy(id = "inputBirthDate")
    private WebElement birthdayDate;
    public void sendKeysBirthday(String birthday)
    {
        sendKeysFunction(birthdayDate,birthday);
    }

    @FindBy(xpath = "//span[@class=\"select2-selection__rendered\"]")
    private WebElement clickDropDownForAdress;
    public void clickDropDown() throws InterruptedException {
        clickFunction(clickDropDownForAdress);
        Thread.sleep(1500);
    }

    @FindBy(xpath = "//select[@class=\"form-control select2-hidden-accessible\"]")
    private WebElement addressChoose;
    public void selectAddressChoose() throws InterruptedException {
        selectElementDropDown(addressChoose,"705af9eb-ca43-42ab-b794-3dbaf426871c");
    }

    @FindBy(id = "inputAcceptEula")
    private WebElement userAgreement;
    public void clickSelectAgreement(){

        clickFunction(userAgreement);
    }
    @FindBy(xpath = "//button[@class=\"ys-btn ys-btn-primary ys-btn-xlg ys-btn-block register-button\"]")
    private WebElement submitButton;
    public void clickSignUpButton() throws InterruptedException {

        clickFunction(submitButton);

    }

}
