package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P05_Categories;
import org.testng.Assert;

public class D10_CompareListStepDef {

    P05_Categories comparelist = new P05_Categories();


    @And("user add product to compare list")
    public void add_wishlist(){
        comparelist.selectprodcompare.click();}


    @Then("product added to compare list")
    public void Added_Wishlist() {
        String expectedResult = "The product has been added";
        String actualResult = comparelist.succssescompare.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
