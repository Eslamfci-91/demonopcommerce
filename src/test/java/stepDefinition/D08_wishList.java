package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_HomePage;

public class D08_wishList {
    P03_HomePage homePage = new P03_HomePage();
    int num;
    @When("user add product to wishlist")
    public void add_product() throws InterruptedException {
        homePage.wishListButtons().get(2).click();
        Thread.sleep(3000);
    }
    @Then("wishlist notification success is visible")
    public void notification_success(){
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
    }
    @And("user get the number of wishlist after adding product")
    public void wishlist_items(){
       String wishListCount = Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]")).getText();
       wishListCount =  wishListCount.replaceAll("[^0-9]","");
        num = Integer.parseInt(wishListCount);

    }
    @Then("number of wishlist items increased")
    public void items_increased(){
        Assert.assertTrue(num>0);
    }
}
