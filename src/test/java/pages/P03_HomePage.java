package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

import java.util.List;

public class P03_HomePage {
    public By select_euroPOM() {
        By selectEuroEle = By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]");
        return selectEuroEle;
    }

    public WebElement check_euro() {
        return Hooks.driver.findElement(By.xpath("//span[@class=\"price actual-price\"]"));
    }


    public WebElement slider(String sliderNum) {
        WebElement sliderEle = Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[" + sliderNum + "]"));
        return sliderEle;
    }
    public WebElement pageXpath(String pageLink){
        WebElement pageEle = Hooks.driver.findElement(By.xpath("//a[@href="+pageLink+"]"));
        return pageEle;
    }
    public List<WebElement> wishListButtons (){
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public List<WebElement> shopping_cartButtons (){
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]"));
    }
}
