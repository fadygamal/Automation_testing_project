package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage {

    public P03_homePage() {
        PageFactory.initElements(Hooks.driver, this);
    }



    @FindBy(id = "small-searchterms")
    public WebElement searchbar;

    @FindBy(className = "search-box-button")
    public WebElement searchbutton;



    public static void selectcurrency() {
        Select selectEU = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        selectEU.selectByVisibleText("Euro");
    }


    public WebElement confirmationcurrency() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span"));
    }


    public static WebElement category() {
        return Hooks.driver.findElement(By.linkText("Books"));
    }



}