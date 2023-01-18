package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P05_Categories;
import org.testng.Assert;

public class D12_CreatOrderStepDef {
    P05_Categories creatorder = new P05_Categories();

    @And("user click on shopping cart upper page")
    public void cart_page(){creatorder.cartbuttuon.click();}

    @And("user click on checkbox to agree terms")
    public void Agree_Terms() {creatorder.termsofservice.click();}

    @And("user click on checkout button")
    public void Checkout_Button() {creatorder.checkout.click();}


    @Then("checkout page opend")
    public void checkout_Page() {Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/onepagecheckout#opc-billing");}
}
