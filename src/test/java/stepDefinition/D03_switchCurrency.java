package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_HomePage;

public class D03_switchCurrency {
    P03_HomePage homePage = new P03_HomePage();
    @When("user choose euro currency")
    public void switch_currency() throws InterruptedException {
        Hooks.driver.findElement(homePage.select_euroPOM()).click();
        Thread.sleep(3000);
    }
    @Then("euro selected successfully")
    public void euro_selected() throws InterruptedException {
        String expectedResult = "€";
        String actualResult = homePage.check_euro().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        Thread.sleep(3000);
    }
}
