package com.zerobank.stepdefinitions;

import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs {

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        BrowserUtils.waitForPageToLoad(4);
        LoginPage loginPage = new LoginPage();
        loginPage.signinButton.click();
        BrowserUtils.waitForPageToLoad(3);

        loginPage.loginPage(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
        Driver.get().navigate().back();
        BrowserUtils.waitForPageToLoad(2);
        Driver.get().findElement(By.xpath("(//strong)[2]")).click();
        BrowserUtils.waitForPageToLoad(2);
        Driver.get().findElement(By.id("account_summary_link")).click();
    }


    @Then("verify that user is on Account summary page")
    public void verifyThatUserIsOnAccountSummaryPage() {

        Assert.assertTrue(Driver.get().getTitle().contains("Zero - Account Summary"));

    }
}
