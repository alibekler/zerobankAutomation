package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.AccountSummary;
import com.zerobank.pages.Basepage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityStepDefs extends Basepage {

    AccountActivity accountActivity;

    @Then("verify that title is {string}")
    public void verify_that_title_is(String string) {

        navigateToTab("Account Activity");
        BrowserUtils.waitForPageToLoad(2);

        Assert.assertTrue(Driver.get().getTitle().equals(string));

    }

    @Then("the default dropdown option should be {string}")
    public void theDefaultDropdownOptionShouldBe(String defOption) {

        Select select = new Select(new AccountActivity().dropdown);

        Assert.assertTrue(select.getFirstSelectedOption().getText().equals(defOption));


    }

    @Then("dropdown should have following options")
    public void dropdownShouldHaveFollowingOptions(List<String> options) {
        Select select = new Select(new AccountActivity().dropdown);

        List<WebElement> dropdownOptions = select.getOptions();

        Assert.assertEquals(BrowserUtils.getElementsText(dropdownOptions), options);
    }

    @Then("transactions table has following tables")
    public void transactionsTableHasFollowingTables(List<String> cols) {
        accountActivity = new AccountActivity();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(BrowserUtils.getElementsText(accountActivity.columns), cols);
    }
}
