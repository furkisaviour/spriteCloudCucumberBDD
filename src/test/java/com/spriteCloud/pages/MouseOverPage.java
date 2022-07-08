package com.spriteCloud.pages;

import com.spriteCloud.utilitise.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MouseOverPage {


    public MouseOverPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Click me']")
    public WebElement clickButton;

    @FindBy(id = "clickCount")
    public WebElement countOfClick;

}
