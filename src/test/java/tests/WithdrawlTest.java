package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WithdrawlTest extends ProviderTest {
    String amountBeforeAdd = "";

    @When("I login successfully with the account as (.*)")
    public void loginSuccess(String username) throws InterruptedException {
        Thread.sleep(5000);
        getLoginPage().setBtnClickCustomerLogin();
        Thread.sleep(7000);
        getLoginPage().setUserSelect(username);
        Thread.sleep(6000);
        getLoginPage().setBtnSubmit();
    }

    @And("I deposited into my account (.*)")
    public void depositAmount(String deposit) throws InterruptedException {
        Thread.sleep(5000);
        getDepositPage().setBtnDeposit();
        Thread.sleep(7000);
        Thread.sleep(5000);
        amountBeforeAdd = getDepositPage().getBalance();
        getDepositPage().setInputAmount(deposit);
        Thread.sleep(5000);
        getDepositPage().setBtnSubmitDeposit();
        Thread.sleep(5000);
        getDepositPage().verifyAddDepositAmountSuccessfully(amountBeforeAdd, deposit);
    }

    @And("I click on Withdrawl button")
    public void btnWithdrawl() throws InterruptedException {
        Thread.sleep(5000);
        getWithdrawlPage().setBtnWithdrawl();
    }

    @And("I type amount to be Withdrawl as (.*)")
    public void inputWithdrawl(String withdrawl) throws InterruptedException {
        Thread.sleep(7000);
        getWithdrawlPage().setInputWithdrawl(withdrawl);
    }

    @And("I click on the Withdrawl button to submit withdrawl")
    public void btnSubmitWithdrawl() throws InterruptedException {
        Thread.sleep(5000);
        getWithdrawlPage().setBtnSubmitWithdrawl();
    }

    @Then("I verify user withdrawl successfully")
    public void withdrawlSuccess() throws InterruptedException {
        Thread.sleep(5000);
        getWithdrawlPage().verifyWithdrawlSuccessfully();
    }

    @Then("I verify user withdrawl unsuccessfully")
    public void withdrawlUnsuccess() throws InterruptedException {
        Thread.sleep(5000);
        getWithdrawlPage().verifyWithdrawlUnsuccessfully();
    }

}
