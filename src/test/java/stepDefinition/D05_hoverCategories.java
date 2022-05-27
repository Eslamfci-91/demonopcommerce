package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_hoverCategories {
    String subCategoryName;
    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {

        Actions action = new Actions(Hooks.driver);
// hover on "Computers"
        WebElement computers = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        action.moveToElement(computers).perform();
        Thread.sleep(1000);

// getText() of subCategory before click on it
        WebElement desktops = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
        subCategoryName = desktops.getText().toLowerCase().trim();        // this will change "Desktops " to "desktops"
        System.out.println(subCategoryName);

// click on "Desktops"
        desktops.click();
    }
    @Then("subcategory page open successfully")
    public void subcategory_page(){
        String actualResult =Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]")).getText().toLowerCase();
        Assert.assertEquals(actualResult,subCategoryName,"assertion");
    }
}
