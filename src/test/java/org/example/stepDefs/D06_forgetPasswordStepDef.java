package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_forgetPassword;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_forgetPasswordStepDef {
    P04_forgetPassword forgetPass = new P04_forgetPassword();

    @When("click on forget password")
    public void forget_password(){forgetPass.forgotpass.click();}


    @And("user put email")
    public void user_Email() {forgetPass.forgotemail.sendKeys("test@gmail.com");}

    @And("user press recover button")
    public void Recover_Button() {forgetPass.sendtheemail.click();}

    @Then("confirmation message appears")
    public void Message_Appears() {
        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = Hooks.driver.findElement(By.className("content")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
