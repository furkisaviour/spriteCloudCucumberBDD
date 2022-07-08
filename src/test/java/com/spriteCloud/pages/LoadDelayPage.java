package com.spriteCloud.pages;

import com.spriteCloud.utilitise.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoadDelayPage {

    public LoadDelayPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

     @FindBy(xpath = "(//button[@type='button'])[2]")
     public WebElement appearingButton;

}
