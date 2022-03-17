package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageObject.CustomerPage;
import pageObject.LoginPage;
import utilities.BaseClass;


public class CustomerSteps {

    WebDriver driver;
    LoginPage  objLogin;




    @When("click on continue button for new customer")
    public void click_on_continue_button_for_new_customer() {
         CustomerPage.setBtnContinue();

    }

    @Then("user should be at create an account section")
    public void user_should_be_at_create_an_account_section() {
        CustomerPage.createAcctSection();
    }

    @When("user selects from dropdown {string}")
    public void user_selects_from_dropdown(String India) {
      CustomerPage.userSelect(India);
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String fname, String lname) {
        CustomerPage.enterFNameLName(fname,lname);
    }

    @When("User selects gender as {string}")
    public void user_selects_gender_as(String string) {
      CustomerPage.selectGender();
    }

    @When("User enters as {string} , {string}, {string}, {string} and {string}")
    public void user_enters_as_and(String street, String suburb, String pincode, String city, String state) {
    CustomerPage.enterUserAddress(street,suburb,pincode,city,state);
    }

    @When("click on continue button")
    public void click_on_continue_button() throws InterruptedException {
    CustomerPage.clickOnContiBtn();
    }

    @Then("user should get confirmation message as {string}")
    public void user_should_get_confirmation_message_as(String msg1) {
        CustomerPage.confirmationmsg(msg1);
    }


    @When("User enters Birthdate as {string}")
    public void user_enters_birthdate_as(String date) {
        CustomerPage.enterDOB(date);
    }

    @When("User enters Email as {string}")
    public void user_enters_email_as(String email) {
        CustomerPage.enterEmail(email);
    }


    @When("User enter contact as {string} and {string}")
    public void user_enter_contact_as_and(String tel, String fax) {
        CustomerPage.enterContactdetails(tel,fax);
    }

    @When("User Enter credential as {string} and {string}")
    public void user_enter_credential_as_and(String pass, String confPass) {
       CustomerPage.enterPassword(pass,confPass);
    }

}
