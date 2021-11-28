package com.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class LoginStepDef {

    WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//span[contains(@class,'nav-line')][text()='Account & Lists']"))).perform();
        driver.findElement(By.className("nav-action-inner")).click();
    }

    @When("user click on sign up page")
    public void user_click_on_sing_up_page() {
        driver.findElement(By.id("createAccountSubmit")).click();
    }


    @When("user enters name mobile and password {string} {string} {string}")
    public void user_enters_name_mobile_and_password(String name, String mobilePhone, String password) {
        driver.findElement(By.id("ap_customer_name")).sendKeys(name);
        driver.findElement(By.name("email")).sendKeys(mobilePhone);
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("ap_password_check")).sendKeys(password);
    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        driver.findElement(By.id("continue")).click();
    }

    @Then("user is signing in with the same account {string} {string}")
    public void user_is_signing_in_with_the_same_account(String string, String string2) {
        driver.get("https://www.amazon.in/");
        driver.findElement(By.className("nav-action-inner")).click();
        driver.findElement(By.name("email")).sendKeys(string);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys(string2);
        driver.findElement(By.id("signInSubmit")).click();
        Assert.assertTrue(driver.getTitle().contains("amazon"));
        driver.close();
    }

}
