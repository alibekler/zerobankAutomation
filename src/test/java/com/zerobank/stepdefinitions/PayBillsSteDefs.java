package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class PayBillsSteDefs extends PayBillsPage {


    @Then("verify that confirmation message is displayed")
    public void verify_that_confirmation_message_is_displayed() {
        BrowserUtils.waitFor(1);
        String expectedStr = "The payment was successfully submitted.";
        String actualStr = alertOfSuccess.getText();

        Assert.assertTrue(alertOfSuccess.isDisplayed());
        Assert.assertEquals(expectedStr, actualStr);

    }

    @When("the user makes a payment")
    public void theUserMakesAPayment() {
        BrowserUtils.waitForPageToLoad(3);
        amount.click();
        amount.sendKeys("200");
        date.sendKeys("2022-02-12");
        payButton.click();
    }

    @When("the user makes a payment without  date input")
    public void theUserMakesAPaymentWithoutDateInput() {

        amount.click();
        amount.sendKeys("240");
        payButton.click();

        String expectedPopUp = "Please fill in this field.";
        String message = Driver.get().findElement(By.id("sp_date")).getAttribute("validationMessage");

        Assert.assertEquals(expectedPopUp, message);

    }
}
