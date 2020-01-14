package tests;

import org.openqa.selenium.support.PageFactory;
import pages.*;
import runner.TestRunner;

public class ProviderTest {

    private static LoginPage loginPage;
    private static DepositPage depositPage;
    private static WithdrawlPage withdrawlPage;
    private static TransactionsPage transactionsPage;
    private static CommonPage commonPage;


    public static LoginPage getLoginPage() {
//        if (loginPage == null) {
            loginPage = PageFactory.initElements(TestRunner.driver, LoginPage.class);
//        }
        return loginPage;
    }
    public static DepositPage getDepositPage() {
//        if (depositPage == null) {
            depositPage = PageFactory.initElements(TestRunner.driver, DepositPage.class);
//        }
        return depositPage;
    }
    public static WithdrawlPage getWithdrawlPage() {
        if (withdrawlPage == null) {
            withdrawlPage = PageFactory.initElements(TestRunner.driver, WithdrawlPage.class);
        }
        return withdrawlPage;
    }
    public static TransactionsPage getTransactionsPage() {
//        if (transactionsPage == null) {
            transactionsPage = PageFactory.initElements(TestRunner.driver, TransactionsPage.class);
//        }
        return transactionsPage;
    }
    public static CommonPage getCommonPage() {
//        if (transactionsPage == null) {
            commonPage = PageFactory.initElements(TestRunner.driver, CommonPage.class);
//        }
        return commonPage;
    }
}
