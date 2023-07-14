package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {

    By verifyAddUserText = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']");
    By selectUserRole = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]");

    By enterEmployeeName = By.xpath("//input[@placeholder='Type for hints...']");

   // By enterTheUserName = By.xpath("//input[@class='oxd-input oxd-input--focus']");

    By selectStatus = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']");

    By selectAdmin = By.xpath("//div[@class ='oxd-select-dropdown --position-bottom')]");

    By selectDisable = By.xpath("//div[contains(text(),'Disabled')]");

    By confirmPassword = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");

    By clickOnSaveButton = By.xpath("//font[contains(text(),'Save')]");

    By choseAdmin = By.xpath("//div[@class='oxd-form-actions']");
    public String setVerifyAddUserText() {
        return getTextFromElement(verifyAddUserText);
    }

    public void setSelectUserRole(){
            clickOnElement(selectUserRole);
            clickOnElement(choseAdmin);
    }
    public void setEnterEmployeeName(String name){
        sendTextToElement(enterEmployeeName,name);
    }
    /*public void setEnterTheUserName(String userName){
        sendTextToElement(enterTheUserName,userName);
    }*/
    public void setSelectStatus(){
            clickOnElement(selectStatus);
    }

    public void setSelectAdmin(){
        selectByContainsTextFromDropDown(selectAdmin,"Admin");
    }
    public void setSelectDisable(){
        selectByIndexFromDropDown(selectDisable,0);
    }
    public void setConfirmPassword(String password){
        sendTextToElement(confirmPassword,password);
    }
    public void setClickOnSaveButton(){
        clickOnElement(clickOnSaveButton);
    }
}
