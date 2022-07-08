package com.spriteCloud.step_definitions;

import com.spriteCloud.pages.TextInputPage;
import com.spriteCloud.utilitise.ConfigurationReader;
import com.spriteCloud.utilitise.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TextInputDefinition {

    TextInputPage textInputPage = new TextInputPage();

    @Given("user is on Text input page")
    public void user_is_on_text_input_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("textPage"));
    }


    @When("user searches {string}")
    public void user_searches(String keyword) {
        textInputPage.buttonName.sendKeys(keyword);
    }
    @When("user clicks update button")
    public void user_clicks_update_button() {
        textInputPage.updateButton.click();
    }
    @Then("user should see {string}")
    public void user_should_see(String expected) {
        Assert.assertEquals(textInputPage.updateButton.getText(),expected);
    }
}
