package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteCustomer extends ProviderTest {

    @When("I click delete button with first name as (.*), last name as (.*), post code as (.*) and account number as (.*)")
    public void clickDelete(String fName, String lName, String postcode, String accountNumber) throws InterruptedException {
        Thread.sleep(5000);
        getCustomerPage().setDeleteBtn(fName, lName, postcode, accountNumber);
    }
   @Then("I verify customer delete successfully with first name as (.*), last name as (.*), post code as (.*) and account number as (.*)")
    public void verifyDeleteSuccess(String fName, String lName, String postcode, String accountNumber ) throws InterruptedException {
        Thread.sleep(5000);
       getCustomerPage().checkDeleteCustomerSuccessfully(fName, lName, postcode, accountNumber, true);
    }

}
