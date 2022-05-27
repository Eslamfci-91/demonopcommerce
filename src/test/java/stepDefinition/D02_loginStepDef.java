package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import pages.P02_LoginPage;

public class D02_loginStepDef {
    P02_LoginPage login = new P02_LoginPage();
    @When("user click on login button")
    public void click_login(){
        login.click_login().click();
    }
    @And("^user enter \"(.*)\" and \"(.*)\"$")
    public void enter_username_password(String username , String password){
        Hooks.driver.findElement(By.id("Email")).sendKeys(username);
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);
        login.login().click();
    }
    @Then("user could login successfully")
    public void login_successfully() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        String expectedResult = "https://demo.nopcommerce.com";
        String actualResult = Hooks.driver.getCurrentUrl();
        soft.assertTrue(actualResult.contains(expectedResult),"first assertion");

        soft.assertTrue(login.myaccount_xpath().isDisplayed(),"second assertion true");

        soft.assertAll();
    }


}
