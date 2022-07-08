package com.spriteCloud.step_definitions;

import com.spriteCloud.pages.LoadDelayPage;
import com.spriteCloud.pages.MainPage;
import com.spriteCloud.utilitise.BrowserUtils;
import com.spriteCloud.utilitise.ConfigurationReader;
import com.spriteCloud.utilitise.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadDelaysStepDefinition {

    MainPage mainPage = new MainPage();

    @Given("user is on main page")
    public void user_is_on_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("mainPage"));
    }
    @When("user clicks Load Delays button")
    public void user_clicks_load_delays_button() {

        mainPage.loadDelay.click();
    }
    @Then("user should see Button Appearing After Delay")
    public void user_should_see_button_appearing_after_delay() {
        LoadDelayPage loadDelayPage = new LoadDelayPage();
        BrowserUtils.waitForPageToLoad(10);
        Assert.assertTrue(loadDelayPage.appearingButton.isDisplayed());
    }

}
