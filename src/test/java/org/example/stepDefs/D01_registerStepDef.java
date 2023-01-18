package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D01_registerStepDef {

    P01_register register = new P01_register();
    @Given("user go to register page")
    public void register_page() {register.registering.click();}

    @When("user select gender type")
    public void select_gender() {register.gendermale.click();}

    @And("user enter the user name")
    public void user_name() {register.userName();}

    @And("user enter date of birth")
    public void select_date()
    {
        register.dateofbirth();
    }

    @And("user enter email")
    public void user_Email() {register.theemail();}



    @And("user fills Password fields")
    public void user_password() {register.thepassword();}


    @And("user clicks on register button")
    public void register_button() {register.registerbutton.click();}

    @Then("success message is displayed")
    public void registration_completed() {
        String expectedResult = "Your registration completed";
        String actualResult = Hooks.driver.findElement(By.className("result")).getText();

        Assert.assertEquals(expectedResult, actualResult);
    }



}
