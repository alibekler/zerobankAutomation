package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivity extends Basepage{


    @FindBy(id = "aa_accountId")
    public WebElement dropdown;

    @FindBy(xpath = "//th")
    public List<WebElement> columns;

}
