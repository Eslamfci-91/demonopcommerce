package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_HomePage;

import java.util.ArrayList;
public class D07_followUsStepDef {
    P03_HomePage homePage=new P03_HomePage();
    @When("user opens facebook link")
    public void open_facebook()  {
        homePage.pageXpath("\"http://www.facebook.com/nopCommerce\"").click();
    }
    @Then("^\"(.*)\" is opened in new tab$")
    public void facebook_page(String pageLink) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),pageLink);
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
    }
    @When("user opens twitter link")
    public void open_twitter() {
        homePage.pageXpath("\"https://twitter.com/nopCommerce\"").click();
    }

    @When("user opens news link")
    public void open_news() {
        homePage.pageXpath("\"/news/rss/1\"").click();
    }
    @When("user opens youtube link")
    public void open_youtube() {
        homePage.pageXpath("\"http://www.youtube.com/user/nopCommerce\"").click();
    }



}
