package com.zerobank.stepdefinitions;

import com.zerobank.pages.Basepage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AccountActivityStepDefs extends Basepage {

    @Then("verify that title is {string}")
    public void verify_that_title_is(String string) {

        navigateToTab("Account Activity");
        BrowserUtils.waitForPageToLoad(2);

        Assert.assertTrue(Driver.get().getTitle().equals(string));

    }

}
