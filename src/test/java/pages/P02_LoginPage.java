package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class P02_LoginPage {

    public WebElement click_login(){
        return Hooks.driver.findElement(By.xpath("//a[@class=\"ico-login\"]"));
    }
    public WebElement login(){
        return Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]"));
    }
    public WebElement myaccount_xpath(){
        return Hooks.driver.findElement(By.xpath("//a[@class=\"ico-account\"]"));
    }
}
