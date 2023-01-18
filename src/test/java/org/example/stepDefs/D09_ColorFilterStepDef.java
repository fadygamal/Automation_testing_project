package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D09_ColorFilterStepDef {
    P03_homePage color = new P03_homePage();
    Actions actions = new Actions(Hooks.driver);

    @When("user hover Apparel and select on Shoes")
    public void select_shose() {
        WebElement maincategory; WebElement subcategory;
        maincategory = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a"));
        actions.moveToElement(maincategory);
        subcategory = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a"));
        actions.moveToElement(subcategory);
        actions.click().build().perform();
    }

    @And("the selected subcategory should be displayed")
    public void subategory_Displayed() {Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/shoes");}

    @Then("user filter by color")
    public void Filter_Color(){Hooks.driver.findElement(By.id("attribute-option-15")).click();}
}