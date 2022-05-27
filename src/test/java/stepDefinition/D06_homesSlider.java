package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_HomePage;

public class D06_homesSlider {
    P03_HomePage homePage = new P03_HomePage();
    @When("user click on first slider")
    public void first_slider(){
        homePage.slider("1").click();
    }
    @Then("product of first slider displayed")
    public void firstSlide_displayed() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone_s6");
    }
    @When("user click on second slider")
    public void second_slider(){
        homePage.slider("2").click();
    }
    @Then("product of second slider displayed")
    public void secondSlide_displayed() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }

}
