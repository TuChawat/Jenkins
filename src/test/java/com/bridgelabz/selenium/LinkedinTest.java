package com.bridgelabz.selenium;

import com.bridgelabz.selenum.base.Base;
import com.bridgelabz.selenum.pages.Login_Linkedin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkedinTest extends Base {
    public Login_Linkedin login;

    @Test(priority = 0)
    public void login_Linkedin() {
        login = new Login_Linkedin(driver);
        login.loggedin();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Feed | LinkedIn");
        String Name = driver.getTitle();
        if (Name.equals("Feed | LinkedIn")){
            test.log(LogStatus.PASS, "Navigated to My account");
        }else {
            test.log(LogStatus.FAIL, "Test Failed");
        }
    }
}
