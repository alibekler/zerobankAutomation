package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Basepage {

    public Basepage(){
        PageFactory.initElements(Driver.get(), this);
    }

public void navigateToTab(String tabName){

    String locator="//a[.='" + tabName  + "']";
    Driver.get().findElement(By.xpath(locator)).click();
}

}
