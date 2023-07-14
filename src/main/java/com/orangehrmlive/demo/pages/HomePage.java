package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By enterUserName = By.name("username");
    By enterPassword = By.name("password");

    By hrmLogo = By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");
     By verifyLoginPanel  = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
    public void setEnterUserName(String userName){
        sendTextToElement(enterUserName,userName);
    }
    public void setEnterPassword(String password){
        sendTextToElement(enterPassword,password);
    }

    public String setVerifyLoginPanel(){
        return getTextFromElement(verifyLoginPanel);
    }

    public void setHrmLogo(){
        driver.findElement(hrmLogo).isDisplayed();

    }
}
