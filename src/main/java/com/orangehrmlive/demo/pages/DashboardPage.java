package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By verifyTheTextDashboard = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");


    public String getVerifyTheTextDashboard(){
        return getTextFromElement(verifyTheTextDashboard);
    }
}
