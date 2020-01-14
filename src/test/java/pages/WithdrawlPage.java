package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WithdrawlPage {
    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement btnWithdrawl;
    @FindBy(xpath = "//div[4]//form//input")
    WebElement inputWithdrawl;
    @FindBy(xpath = "//div[4]//form/button")
    WebElement btnSubmitWithdrawl;
    @FindBy(xpath = "//div[2]/strong[2]")
    WebElement withdrawlSuccess;
    @FindBy(css = ".error")
    WebElement message;
    @FindBy(name = "//form[@name=\"myForm\"]")
    WebElement checkForm;

    public void setBtnWithdrawl() {
        btnWithdrawl.click();
    }

    public void setInputWithdrawl(String deposit) {
        inputWithdrawl.clear();
        inputWithdrawl.sendKeys(deposit);
    }

    public void setBtnSubmitWithdrawl() {
        btnSubmitWithdrawl.click();
    }

    public void verifyWithdrawlSuccessfully() {
        if (message.isDisplayed() && Integer.parseInt(withdrawlSuccess.getText()) >= (Integer.parseInt("1000"))) {
            System.out.println("Withdrawl Successful: 1000");
        } else System.out.println("The customer still has not withdrawn yet");
    }

    public void verifyWithdrawlUnsuccessfully() {
        if (message.isDisplayed() && Integer.parseInt(withdrawlSuccess.getText()) < (Integer.parseInt("3000"))) {
            System.out.println("The customer withdrawl Unsuccessful");
        } else System.out.println("The customer still has not withdrawn yet");
    }

    public void verifyWithdrawlForm() {
        if (checkForm.isDisplayed()) {
            System.out.println("Deposit form is appeared ");
        } else System.out.println("Deposit form is not appeared");
    }


}
