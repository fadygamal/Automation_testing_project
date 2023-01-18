package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {

    P03_homePage categores = new P03_homePage();



    @When("user select category")
    public void select_category() {
        categores.category().click();}


    @Then("the selected category should be displayed")
    public void Category_Displayed() {Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/books");}


}

