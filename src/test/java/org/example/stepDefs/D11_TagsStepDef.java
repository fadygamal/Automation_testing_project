package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P05_Categories;
import org.testng.Assert;

public class D11_TagsStepDef {

    P05_Categories tags = new P05_Categories();

    @And("user click on tag")
    public void select_tag() {tags.selecttag.click();}

    @Then("check tag assertion")
    public void check_Tag() {{
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/cool");}
    }
}
