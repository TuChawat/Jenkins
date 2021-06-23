package com.bridgelabz.selenum.pages;

import com.bridgelabz.selenum.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Linkedin extends Base {
    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id='organic-div']/form/div[3]/button")
    WebElement clickSignin;

    public Login_Linkedin(WebDriver driver) { PageFactory.initElements(Base.driver, this);
    }

    public void loggedin(){
        username.sendKeys("tushar1chawat@gmail.com");
        password.sendKeys("Wardha123");
        clickSignin.click();
    }
}
