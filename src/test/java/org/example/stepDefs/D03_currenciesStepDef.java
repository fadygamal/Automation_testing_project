package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D03_currenciesStepDef {

    P03_homePage currency = new P03_homePage();



    @When("click on currency drop-list and choose Euro")
    public void selectcurrency() {currency.selectcurrency();}

    @Then("euro symbol is applied")
    public void eurocurrency() {boolean actualresult = currency.confirmationcurrency().isDisplayed();
        Assert.assertTrue(actualresult);
    }
}
