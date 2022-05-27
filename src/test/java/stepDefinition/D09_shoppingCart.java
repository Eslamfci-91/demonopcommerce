package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_HomePage;

public class D09_shoppingCart {
    P03_HomePage homePage = new P03_HomePage();
    int num;
    @When("user add product to shopping cart")
    public void add_product() throws InterruptedException {
        homePage.shopping_cartButtons().get(2).click();
        Thread.sleep(3000);
    }
    @Then("shopping cart notification success is visible")
    public void notification_success(){
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
    }
    @And("user get the number of shopping cart after adding product")
    public void shopping_cart_items(){
        String shopping_cartCount = Hooks.driver.findElement(By.cssSelector("span[class=\"cart-qty\"]")).getText();
        shopping_cartCount =  shopping_cartCount.replaceAll("[^0-9]","");
        num = Integer.parseInt(shopping_cartCount);

    }
    @Then("number of shopping cart items increased")
    public void items_increased(){
        Assert.assertTrue(num>0);
    }
}


