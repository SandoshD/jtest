package com.Jtest;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
    public void jmain()
    {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/client/");
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userEmail")));
        
        assertTrue(driver.findElement(By.id("userPassword")).isEnabled());
        driver.close();
        
    }
}
