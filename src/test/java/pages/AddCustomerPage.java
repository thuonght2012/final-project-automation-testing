package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage {
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firtsname;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastname;
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postcode;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerBtn;

    public void setInformation(String fistnameinput, String lastnameinput, String postcodeinput) {
        this.firtsname.clear();
        if (!fistnameinput.equals("")) {
            this.firtsname.sendKeys(fistnameinput);
        }
        this.lastname.clear();
        if (!lastnameinput.equals("")) {
            this.lastname.sendKeys(lastnameinput);
        }
        this.postcode.clear();
        if (!postcodeinput.equals("")) {
            this.postcode.sendKeys(postcodeinput);
        }
    }

    public void clickSubmit() {
        addCustomerBtn.click();
    }

}
