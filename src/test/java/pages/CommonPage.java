package pages;

import runner.TestRunner;

public class CommonPage {

    public void closeAlertPopup() throws InterruptedException {
        TestRunner.driver.switchTo().alert().accept();
        Thread.sleep(3000);
    }
    public String getAlertPopup() throws InterruptedException {
        Thread.sleep(3000);
        return TestRunner.driver.switchTo().alert().getText();
    }

    public  boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
