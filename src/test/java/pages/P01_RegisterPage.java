package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;


public class P01_RegisterPage extends Hooks {

        public WebElement dayOfBirthPOM(){
            WebElement dayOfBirthEle = Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]//option[@value=\"4\"]"));

            return dayOfBirthEle;
        }


        public WebElement monthOfBirthPOM(){

            return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]//option[@value=\"11\"]"));
        }

        public WebElement yearOfBirthPOM(){

            return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]//option[@value=\"1991\"]"));
        }

        public WebElement textActualPOM(){

            return Hooks.driver.findElement(By.xpath("//div[@class=\"result\"]"));
        }

        public WebElement registerMessagePOM(){

            return Hooks.driver.findElement(By.xpath("//div[@class=\"result\"]"));
        }
}

