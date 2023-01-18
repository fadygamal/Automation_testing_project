package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_forgetPassword {
    public P04_forgetPassword(){PageFactory.initElements(Hooks.driver, this);}

    @FindBy(linkText = "Forgot password?")
    public WebElement forgotpass;

    @FindBy(id = "Email")
    public WebElement forgotemail;

    @FindBy(name = "send-email")
    public WebElement sendtheemail;
}
