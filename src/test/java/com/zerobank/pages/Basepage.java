package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class Basepage {

public void navigateToTab(String tabName){

    String locator="//a[.='" + tabName  + "']";
    Driver.get().findElement(By.xpath(locator)).click();
}

}
