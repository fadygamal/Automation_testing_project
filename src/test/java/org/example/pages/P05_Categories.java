package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_Categories {

    public P05_Categories(){
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(linkText = "cool")
    public WebElement selecttag;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")
    public WebElement selectproduct;

    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    public WebElement succsses;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[3]")
    public WebElement selectprodwishlist;

    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    public WebElement succsseswishlist;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[2]")
    public WebElement selectprodcompare;

    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    public WebElement succssescompare;

    @FindBy(xpath = "//*[@id=\"topcartlink\"]/a")
    public WebElement cartbuttuon;

    @FindBy(xpath = "//*[@id=\"termsofservice\"]")
    public WebElement termsofservice;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    public WebElement checkout;

}
