package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P05_Categories;
import org.testng.Assert;

public class D08_WishlistStepDef {

    P05_Categories wishlist = new P05_Categories();


    @And("user add product to wishlist")
    public void add_wishlist(){wishlist.selectprodwishlist.click();}


    @Then("product added to wishlist")
    public void Added_Wishlist() {
        String expectedResult = "The product has been added";
        String actualResult = wishlist.succsseswishlist.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
