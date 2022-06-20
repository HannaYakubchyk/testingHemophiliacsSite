package hanna.yakubchyk.bdd_framework.factory.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VolunteerPage extends Page {

    @FindBy(xpath = "//*[@id=\"wpcf7-f230-p71-o1\"]/form/p[1]/label/span/input")
    private WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"wpcf7-f230-p71-o1\"]/form/p[2]/label/span/input")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"wpcf7-f230-p71-o1\"]/form/p[3]/label/span/input")
    private WebElement phoneInput;

    @FindBy(xpath = "//*[@id=\"wpcf7-f230-p71-o1\"]/form/p[4]/label/span/textarea")
    private WebElement messageInput;

    @FindBy(xpath = "//*[@id=\"wpcf7-f230-p71-o1\"]/form/p[5]/input")
    private WebElement sendButton;

    @FindBy(xpath = "//*[@id=\"wpcf7-f230-p71-o1\"]/form/div[2]")
    private WebElement successMessage;

    public void inputName(){
        nameInput.click();
        nameInput.sendKeys("Some Name");
    }

    public void inputEmail(){
        emailInput.click();
        emailInput.sendKeys("test@test.by");
    }

    public void inputPhone(){
        phoneInput.click();
        phoneInput.sendKeys("12345678");
    }

    public void inputMessage(){
        messageInput.click();
        messageInput.sendKeys("Some text for test");
    }

    public void sendButtonClick(){
        sendButton.click();
    }

    public boolean doesSuccessMessageAppear(){
        return successMessage.isEnabled();
    }
}


