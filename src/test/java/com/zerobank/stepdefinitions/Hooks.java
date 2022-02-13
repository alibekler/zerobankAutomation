package com.zerobank.stepdefinitions;

import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup() {
        System.out.println("This is coming from BEFORE");
    }

    @After
    public void teardown(Scenario scenario) throws InterruptedException {
      if (scenario.isFailed()){
          final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
          scenario.attach(screenshot, "image/png", "screenshot");
      }
        Thread.sleep(1500);
        Driver.closeDriver();
    }

    @Before("@db")
    public void setupDb() {
        System.out.println("connecting to database");
    }

    @After("@db")
    public void teardownDb() {
        Driver.closeDriver();
    }
}
