package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P01_register {

    public P01_register(){
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(className = "ico-register") public WebElement registering;

    @FindBy(id = "gender-male") public WebElement gendermale;

    @FindBy(id = "FirstName") public WebElement firstname;

    @FindBy(id = "LastName") public WebElement lastname;

    public void userName () {
        firstname.sendKeys("Fady");
        lastname.sendKeys("Gamal");
    }

    public void dateofbirth() {
        Select selectday = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        selectday.selectByVisibleText("6");

        Select selectmonth = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        selectmonth.selectByVisibleText("January");

        Select selectyear = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        selectyear.selectByVisibleText("1998");
    }

    @FindBy(id = "Email")
    public WebElement useremail;

    public void theemail () {
        useremail.sendKeys("test@gmail.com");

    }

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement ConfirmPassword;

    public void thepassword() {
        password.sendKeys("test123");
        ConfirmPassword.sendKeys("test123");
    }

    @FindBy(id = "register-button")
    public WebElement registerbutton;


}
