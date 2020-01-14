package tests;

import org.openqa.selenium.support.PageFactory;
import pages.AddCustomerPage;
import pages.CommonPage;
import pages.OpenAccountPage;
import pages.CustomerPage;
import runner.TestRunner;

public class ProviderTest {
    private static AddCustomerPage addCustomerPage;
    private static OpenAccountPage openAccountPage;
    private static CommonPage commonPage;
    private static CustomerPage customerPage;


    public static AddCustomerPage getAddCustomerPage() {
//        if (loginPage == null) {
        addCustomerPage = PageFactory.initElements(TestRunner.driver, AddCustomerPage.class);
//        }
        return addCustomerPage;
    }
    public static OpenAccountPage getOpenAccountPage() {
//        if (loginPage == null) {
        openAccountPage = PageFactory.initElements(TestRunner.driver, OpenAccountPage.class);
//        }
        return openAccountPage;
    }
    public static CommonPage getCommonPage() {
//        if (loginPage == null) {
        commonPage = PageFactory.initElements(TestRunner.driver, CommonPage.class);
//        }
        return commonPage;
    }

    public static CustomerPage getCustomerPage() {
//        if (loginPage == null) {
        customerPage = PageFactory.initElements(TestRunner.driver, CustomerPage.class);
//        }
        return customerPage;
    }
}
