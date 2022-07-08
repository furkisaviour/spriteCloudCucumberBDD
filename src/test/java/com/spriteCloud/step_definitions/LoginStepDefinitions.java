package com.spriteCloud.step_definitions;

import com.spriteCloud.pages.LoginPage;
import com.spriteCloud.utilitise.BrowserUtils;
import com.spriteCloud.utilitise.ConfigurationReader;
import com.spriteCloud.utilitise.Driver;
import io.cucumber.java.en.*;
import net.bytebuddy.pool.TypePool;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }
    @When("user enters username")
    public void user_enters_username() {
        loginPage.inputUserName.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("user enters password")
    public void user_enters_password() {
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
    }
    @Then("user should see Welcome text")
    public void user_should_see_welcome_text() {
        BrowserUtils.wait(1);
        String text = loginPage.loginStatus.getText();
        Assert.assertTrue(text.contains("Welcome"));
    }

    @When("user enters invalid username")
    public void user_enters_invalid_username() {
        loginPage.inputUserName.sendKeys("spriteCloud");
    }
    @When("user enters invalid password")
    public void user_enters_invalid_password() {
        loginPage.inputPassword.sendKeys("spriteCloud");
    }

    @Then("user should see Invalid username-password text")
    public void user_should_see_ınvalid_username_password_text() {
        BrowserUtils.wait(1);
        String text2 = loginPage.loginStatus.getText();
        Assert.assertTrue(text2.contains("Invalid "));
    }
}
