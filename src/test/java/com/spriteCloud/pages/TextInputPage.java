package com.spriteCloud.pages;

import com.spriteCloud.utilitise.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextInputPage {

    public TextInputPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "newButtonName")
    public WebElement buttonName;

    @FindBy(id = "updatingButton")
    public WebElement updateButton;





}
