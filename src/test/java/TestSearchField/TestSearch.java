package TestSearchField;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSearch {
    public static WebDriver driver;

    @Given("^user open homepage$")
    public void user_open_homepage() {
        System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @When("^user navigate to search form$")
    public void user_navigate_to_search_form() {
        WebElement SearchQuery = driver.findElement(By.id("search_query_top"));
        SearchQuery.sendKeys("t-short");
    }

    @And("^user enter search query$")
    public void user_enter_search_query() {
        WebElement SearchQuery = driver.findElement(By.id("search_query_top"));
        SearchQuery.sendKeys("blouses");

    }

    @Then("^search result is displayed$")
    public void search_result_is_displayed() {
        String exp_message = "result has been found";
        String actual = driver.findElement(By.className("heading-counter")).getText();
        Assert.assertEquals(exp_message, actual);
        driver.close();
    }
}