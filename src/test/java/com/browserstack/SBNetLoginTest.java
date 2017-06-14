package com.browserstack;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Raghavendra.A on 12-03-2017.
 */
public class SBNetLoginTest extends BrowserStackTestNGTest {

    By.ByXPath userNameText=new By.ByXPath("//form[@name='login']//input[@id='username']");
    By.ByXPath pwdText=new By.ByXPath("//form[@name='login']//input[@id='password']");
    By.ByXPath signInButton=new By.ByXPath("//form[@name='login']//button[@type='submit' and //span[text()='Sign In']]");
    By.ByXPath voiceTile=new By.ByXPath("//div[text()='Voice']/../../a");


    @Test
    public void loginTest(){
        driver.get("https://cboamui:Cboam3i@www.engprod2-spectrumbusiness.net/login.html");
        Assert.assertTrue(waitForElementPresent(userNameText,driver));
        driver.findElement(userNameText).click();
        driver.findElement(userNameText).sendKeys("sbnet_6802");
        driver.findElement(pwdText).click();
        driver.findElement(pwdText).sendKeys("Testing01");
        driver.findElement(signInButton).click();
        Assert.assertTrue(driver.getTitle().contains("Overview"));
    }
}
