package hanna.yakubchyk.bdd_framework.factory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends Page{

    @FindBy(xpath = "//*[@id=\"fieldname5_1\"]")
    private WebElement bodyWeightField;

    @FindBy(xpath = "//*[@id=\"fieldname2_1\"]")
    private WebElement desiredRiseField;

    @FindBy(xpath = "//*[@id=\"fieldname5_1-error\"]")
    private WebElement errorCharBodyWeight;

    @FindBy(xpath = "//*[@id=\"fieldname2_1-error\"]")
    private WebElement errorCharDesiredRise;

    @FindBy(xpath = "//*[@id=\"fieldname1_1\"]")
    private WebElement calculatedField;


    public void set_number_into_body_weight_field(String number) {
        bodyWeightField.click();
        bodyWeightField.sendKeys(number);
    }

    public void set_number_into_desired_rise_field(String number) {
        desiredRiseField.click();
        desiredRiseField.sendKeys(number);
    }

    public String calculatedValueAppears(){
       return calculatedField.getAttribute("value");
    }
}