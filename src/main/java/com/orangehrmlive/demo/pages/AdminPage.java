package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

        By clickOnAdmin = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]");

        By clickOnUserProfileLogo = By.xpath("//img[@alt='profile picture']");

        By mouseHoverOnLogout = By.xpath("//a[contains(text(),'Logout')]");


        public void setClickOnAdmin(){
            clickOnElement(clickOnAdmin);
        }
        public void setClickOnUserProfileLogo(){
            clickOnElement(clickOnUserProfileLogo);
        }

        public void setMouseHoverOnLogout(){
            mouseHoverToElementAndClick(mouseHoverOnLogout);
        }
}
