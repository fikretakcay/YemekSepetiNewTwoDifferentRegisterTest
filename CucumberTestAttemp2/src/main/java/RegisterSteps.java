import PageObjectModelsForRegister.loginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilitie.Driver;

import java.util.concurrent.TimeUnit;

public class RegisterSteps {

    private WebDriver driver;

    loginPage loginPage = new loginPage();

    @Given("Navigate to website")
    public void navigate_to_website() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yemeksepeti.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @And("choose city")
    public void chooseCity() {

        loginPage.clickChooseCity();
    }
    @And("click Sign in button")
    public void click_sign_in_button() throws Throwable {

        loginPage.clickNewAccountButton();
        Thread.sleep(2500);

    }
    @And("click email Text Box")
    public void clickEmailTextBox() throws Throwable{
        loginPage.clickEmailTextExapmle();
        Thread.sleep(1000);
    }
    @And("type email {string}")
    public void type_email(String email){

        loginPage.type_email(email);

    }

    @And("type password {string}")
    public void type_password(String string) {

        loginPage.sendKeysPasswordForAccount(string);
    }

    @And("type passwordAgain")
    public void typePasswordAgain() {
        loginPage.sendKeysPasswordForAccountAgain();
    }

    @And("type firstname {string} and lastname {string}")
    public void type_firstname_and_lastname(String firstName, String lastName) {
        loginPage.sendKeysFirstNameLastName(firstName,lastName);
    }

    @And("type birthday {string}")
    public void type_birthday(String string) {

        loginPage.sendKeysBirthday(string);
    }
    @And("clickDropDownForChooseAdress")
    public void clickdropdownforchooseadress() throws InterruptedException {
        loginPage.clickDropDown();
    }

    @And("choose address")
    public void chooseAddress() throws InterruptedException {
        loginPage.selectAddressChoose();
    }


    @And("click memberAgreementButton")
    public void click_member_agreement_button() {
        loginPage.clickSelectAgreement();

    }

    @When("click Sign up button")
    public void click_sign_up_button() throws InterruptedException {
        loginPage.clickSignUpButton();
        Thread.sleep(2000);
    }




//    @After
//    public void quitDriver() throws InterruptedException {
//        Thread.sleep(2000);
//
//        Driver.closeDriver();
//
//    }

}
