package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pages.P04_search;

public class D04_search {
    P04_search search = new P04_search();
    @When("click on search field in home page")
    public void click_search(){
        search.search_field().click();
    }
    @And("^search for product \"(.*)\"$")
    public void search_parameter(String searchPar){
        search.search_field().sendKeys(searchPar);
        search.search_field().sendKeys(Keys.ENTER);

    }
    @Then("search result appear successfully")
    public void search_result() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        String expectedResult = "https://demo.nopcommerce.com/search";
        String actualResult = Hooks.driver.getCurrentUrl();
        soft.assertTrue(actualResult.contains(expectedResult));
        Thread.sleep(5000);
        int size = Hooks.driver.findElements(By.cssSelector("div[class=\"item-grid\"]")).size();
        soft.assertTrue(size > 0);

        soft.assertAll();
    }

}
