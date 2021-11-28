package com.stepdef;

import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Login {

    WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);

    }


    @When("user enters {string} {string}")
    public void userEnters(String username, String pass){

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(pass);

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();


    }
    @And("user is on home page")
    public void userIsOnHomePage() {
        Assert.assertTrue(driver.getTitle().contains("Swag Labs"));
    }

    @And("user clicks on logout button")
    public void userClicksOnLogoutButton() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();


    }

    @And("browser close")
    public void browserClose() throws InterruptedException {
        Thread.sleep(8000);
        driver.close();
    }


    @And("user is on same page")
    public void userIsOnSamePage() {
        Assert.assertTrue(driver.getTitle().contains("Swag Labs"));
    }
}
