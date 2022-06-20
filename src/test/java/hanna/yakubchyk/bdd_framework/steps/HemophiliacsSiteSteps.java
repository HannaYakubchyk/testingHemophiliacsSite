package hanna.yakubchyk.bdd_framework.steps;

import hanna.yakubchyk.bdd_framework.factory.pages.CalculatorPage;
import hanna.yakubchyk.bdd_framework.factory.pages.MainPage;
import hanna.yakubchyk.bdd_framework.factory.pages.VolunteerPage;
import hanna.yakubchyk.bdd_framework.factory.tests.BasicTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static hanna.yakubchyk.bdd_framework.urls.HemophiliacsURLs.*;

public class HemophiliacsSiteSteps extends BasicTest {

    MainPage mainPage = new MainPage();
    VolunteerPage volunteerPage = new VolunteerPage();
    CalculatorPage calculatorPage = new CalculatorPage();

    //Scenario 1

    @Given("Main page is loaded")
    public void main_page_is_loaded(){
        getDriver().get(MAIN_PAGE_URL);
    }

    @When("user clicks on Become a Volunteer button")
    public void click_on_become_a_volunteer_button(){
        mainPage.clickOnVolunteerButton();
    }

    @Then("Volunteer page is loaded")
    public void is_volunteer_page_loaded()  {
        Assert.assertEquals(getDriver().getCurrentUrl(),VOLUNTEER_PAGE_URL);
    }

//Scenario 2

    @Given("volunteer page is loaded")
    public void volunteer_page_is_loaded(){
        getDriver().get(VOLUNTEER_PAGE_URL);
    }

    @When("user enters name into name field")
    public void enter_name_into_nameField(){
        volunteerPage.inputName();
    }

    @And("user enters valid email into email address field")
    public void enter_email_into_emailField(){
        volunteerPage.inputEmail();
}

    @And("enters phone into phone field")
    public void enter_phone_into_phoneField(){
        volunteerPage.inputPhone();
}

    @And("enters message into message field")
    public void enter_message_into_messageField(){
        volunteerPage.inputMessage();
    }

    @And("clicks on Send button")
    public void click_on_send_button(){
        volunteerPage.sendButtonClick();
    }

    @Then("message of success sending appears")
    public void is_success_message_appears(){
        Assert.assertTrue(volunteerPage.isSuccessMessageAppears());
    }

    //Scenario 3
    @Given ("Calculator page is loaded")
    public void calculator_page_is_loaded() {
        getDriver().get(CALCULATOR_URL);
    }

    @When ("user picks a medicine from a dropdown list")
    public void pick_a_medicine()  {
        WebElement selectElement = getDriver().findElement(By.xpath("//*[@id=\"fieldname4_1\"]"));
        Select selectMedicines = new Select(selectElement);
        selectMedicines.selectByVisibleText("Октанат");
    }

    @And ("enters numbers into Body Weight Field and Desired Factor Rise Field")
    public void enter_chars(){
        calculatorPage.set_number_into_body_weight_field("50");
        calculatorPage.set_number_into_desired_rise_field("50");
    }

    @Then ("calculated dose appears")
    public void are_validation_messages_seen() throws InterruptedException {
        Thread.sleep(1000);
        String expected = "1250 МЕ";
        Assert.assertEquals(calculatorPage.calculatedValueAppears(), expected);
    }
}