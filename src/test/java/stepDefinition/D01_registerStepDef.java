package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import pages.P01_RegisterPage;

public class D01_registerStepDef {

    P01_RegisterPage register = new P01_RegisterPage() ;
    @When("user click on register button")
    public void clickOn_register () throws InterruptedException {
        Hooks.driver.findElement(By.className("ico-register")).click();
        Thread.sleep(5000);
    }
    @And("user fill personal details")
    public void personal_details(){
        Hooks.driver.findElement(By.id("gender-male")).click();
        Hooks.driver.findElement(By.id("FirstName")).sendKeys("Eslam");
        Hooks.driver.findElement(By.id("LastName")).sendKeys("Mohamed");
        register.dayOfBirthPOM().click();
        register.monthOfBirthPOM().click();
        register.yearOfBirthPOM().click();
        Hooks.driver.findElement(By.id("Email")).sendKeys(" automation2@gmail.com");
    }
    @And("user fill company details")
    public void company_details(){
        Hooks.driver.findElement(By.id("Company")).sendKeys("Innovito");
    }
    @And("user fill password")
    public void password(){
        Hooks.driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("P@ssw0rd");
    }
    @And("click on register button")
    public void click_register() throws InterruptedException {
        Hooks.driver.findElement(By.id("register-button")).click();
        Thread.sleep(4000);
    }
    @Then("user registration done")
    public void register_success(){
        SoftAssert soft = new SoftAssert();
        String expectedResult = "Your registration completed";
        String actualResult = register.textActualPOM().getText();
        soft.assertTrue(actualResult.contains(expectedResult),"first assertion true");
        WebElement registerMessage = register.registerMessagePOM();
        String colorValue = registerMessage.getCssValue("color");
        soft.assertEquals(colorValue, "rgba(76, 177, 124, 1)","Second assertion");
        soft.assertAll();

    }
}
