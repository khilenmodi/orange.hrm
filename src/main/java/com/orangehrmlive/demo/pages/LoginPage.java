package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By clickOnLogin = By.xpath("//button[@type='submit']");


    public void setClickOnLogin(){
        clickOnElement(clickOnLogin);
    }
}
