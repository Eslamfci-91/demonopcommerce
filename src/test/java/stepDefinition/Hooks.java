package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;

    @Before
    public void open_browser(){
        System.setProperty("webdriver.chrome.driver","H:\\demonopcommerce\\src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @After
    public void close_browser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
