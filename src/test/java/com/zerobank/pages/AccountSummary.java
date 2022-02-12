package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummary extends Basepage {

    public WebElement AccountType(String AccountType) {
        String xpath = "//h2[.='" + AccountType + "']";
        WebElement AcountType = Driver.get().findElement(By.xpath(xpath));
        return AcountType;
    }

}
