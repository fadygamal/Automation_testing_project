package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;


import java.util.Locale;

public class D04_searchStepDef {

    P03_homePage search = new P03_homePage();

    @When("user write product in search box")
    public void write_product()
    {
        search.searchbar.sendKeys("samsung");
    }

    @Then("user click search button")
    public void search_button()
    {
        search.searchbutton.click();
    }



}
