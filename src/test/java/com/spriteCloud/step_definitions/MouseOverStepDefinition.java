package com.spriteCloud.step_definitions;

import com.spriteCloud.pages.MouseOverPage;
import com.spriteCloud.utilitise.BrowserUtils;
import com.spriteCloud.utilitise.ConfigurationReader;
import com.spriteCloud.utilitise.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class MouseOverStepDefinition {

    MouseOverPage mouseOverPage = new MouseOverPage();
    BrowserUtils browserUtils = new BrowserUtils();

    @Given("user is on mouseOver page")
    public void user_is_on_mouse_over_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("mouseOver"));
    }
    @When("user clicks button")
    public void user_clicks_button() {
        browserUtils.doubleClick(mouseOverPage.clickButton);
    }
    @Then("user should see that the clicked {int} times")
    public void user_should_see_that_the_clicked_times(Integer int1) {
       String text = mouseOverPage.countOfClick.getText();
       Assert.assertEquals(text,"2");
    }
}
