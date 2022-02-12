package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(id = "signin_button")
    public WebElement signinButton;

    @FindBy(xpath = "//strong)[2]")
    public WebElement OnlineBankingTab;
}
