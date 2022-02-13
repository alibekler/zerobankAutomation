package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class AccountSummary extends Basepage {

    public WebElement AccountType(String AccountType) {

        String xpath = "//h2[.='" + AccountType + "']";
        WebElement AcountType = Driver.get().findElement(By.xpath(xpath));
        return AcountType;
    }

    @FindBy(tagName = "h2")
    public List<WebElement> accountTypes;

    @FindBy(xpath = "(//th)[7]")
    public WebElement accountCol;

    @FindBy(xpath = "(//th)[8]")
    public WebElement credCardCol;

    @FindBy(xpath = "(//th)[9]")
    public WebElement balanceCol;

    @FindBy(xpath = "//a[.='Savings']")
    public WebElement savings;

    public List<WebElement> getCredAccCols() {
        List<WebElement> credAccCols = new ArrayList<>();
        credAccCols.add(accountCol);
        credAccCols.add(credCardCol);
        credAccCols.add(balanceCol);

        return credAccCols;
    }


}
