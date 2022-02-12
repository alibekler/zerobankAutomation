package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummary;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryStepDefs {

    @Given("verify that the following is displayed")
    public void verifyThatTheFollowingIsDisplayed(List<String> accType)  {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(BrowserUtils.getElementsText(By.tagName("h2")), accType);

    }

    @Then("Verify if following are displayed under Credit Accounts table")
    public void verifyIfFollowingAreDisplayedUnderCreditAccountsTable(List<String> columns) {

        AccountSummary accountSummary = new AccountSummary();
        List<WebElement> actualELs = accountSummary.getCredAccCols();

        List<String> actual = BrowserUtils.getElementsText(accountSummary.getCredAccCols());

        Assert.assertEquals(columns,actual );



    }
}
