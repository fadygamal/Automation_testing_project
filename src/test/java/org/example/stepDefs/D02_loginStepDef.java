package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.Assert;


public class D02_loginStepDef {

        P02_login login = new P02_login();

        @Given("user go to login page")
        public void login_page()
        {
                login.icologin.click();
        }

        @When("user login with valid email and password")
        public void user_input() {login.loginSteps();}

        @And("user press on login button")
        public void Login_Button()
        {
                login.loginbutton.click();
        }


        @Then("user login to the system successfully")
        public void Login_Successfully() {Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");}

        }



