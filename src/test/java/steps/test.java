package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static steps.test.driver;

public class test {
    public static WebDriver driver;
    @Given("^user open homepage$")
    public void user_open_homepage () {
        System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        System.setProperty("webdriver.gecko.driver", "C:\\DRIVERS\\firefox\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");
    }
@When("^user navigate to login form$")
    public void user_navigate_to_login_form(){
        WebElement SignIn = driver.findElement(By.linkText("Sign in"));
        SignIn.click();
}
@And("^user enter username and password$")
    public void user_enter_username_and_password(){
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("passwd"));
        WebElement SubmitLog = driver.findElement(By.name("SubmitLogin"));
    email.sendKeys("blog.cucumber@gmail.com");
        password.sendKeys("Cucumber@blog");
        SubmitLog.click();
}
@Then("^Open Account page$")
    public void Open_Account_page(){
String exp_message = "Welcome to your account";
String actual = driver.findElement(By.cssSelector(".info-account")).getText();
    Assert.assertEquals(exp_message,actual);
    driver.quit();
}
}