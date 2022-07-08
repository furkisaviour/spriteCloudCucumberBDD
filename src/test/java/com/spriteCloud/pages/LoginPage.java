package com.spriteCloud.pages;

import com.spriteCloud.utilitise.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='User Name']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(css = "#loginstatus")
    public WebElement loginStatus;

}
