package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P05_Categories;
import org.testng.Assert;

public class D07_AddCartStepDef {
    P05_Categories addcart = new P05_Categories();

    @And("user clicking on selected product")
    public void select_product(){addcart.selectproduct.click();}


    @Then("the product added to cart")
    public void Product_Added()
    {
        String expectedResult = "The product has been added to";
        String actualResult = addcart.succsses.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
