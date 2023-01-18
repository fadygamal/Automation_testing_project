package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {

    public P02_login() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(className = "ico-login")
    public WebElement icologin;

    @FindBy(className = "email")
    public WebElement useremail;

    @FindBy(className = "password")
    public WebElement userpassword;

    @FindBy(className = "login-button")
    public WebElement loginbutton;

    public void loginSteps()
    {
        useremail.sendKeys("test@gmail.com");
        userpassword.sendKeys("test123");
    }

}


