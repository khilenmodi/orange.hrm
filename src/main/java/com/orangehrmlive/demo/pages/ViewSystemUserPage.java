package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUserPage extends Utility {

        By VerifyTextSystemUser = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");

        By clickingAddButton = By.xpath("//button[normalize-space()='Add']");

        By enterUsername = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]");

        By enterSearch = By.xpath("//button[@type='submit']");

        By verifyTheResult = By.xpath("//div[contains(text(),'khilenpatel123')]");

        By tickOnCheckbox = By.xpath("//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");

        By clickOnDeleteButton = By.xpath("//i[@class='oxd-icon bi-trash']");


        public String setVerifyTextSystemUser(){
            return  getTextFromElement(VerifyTextSystemUser);

        }
        public void setClickingAddButton(){
            clickOnElement(clickingAddButton);
        }

        public void setEnterUsername(String user){
            sendTextToElement(enterUsername,user);
        }
        public void setEnterSearch(){
            clickOnElement(enterSearch);
        }

        public String setVerifyTheResult(){
            return getTextFromElement(verifyTheResult);
        }

        public void setTickOnCheckbox(){
            clickOnElement(tickOnCheckbox);
        }

        public void setClickOnDeleteButton(){
            clickOnElement(clickOnDeleteButton);
        }


}
