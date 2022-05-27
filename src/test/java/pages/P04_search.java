package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

import java.util.WeakHashMap;

public class P04_search {

    public WebElement search_field(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
}
