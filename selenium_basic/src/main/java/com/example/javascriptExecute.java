package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // first approch-- scrolling the page by pixel
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        // js.executeScript("window.scroll(0,1000)");

        // second approch

        WebElement trg = driver.findElement(By.xpath("//a[text()='Discount Coupons']"));
        // js.executeScript("arguments[0].scrollIntoView(true);", trg);

        WebElement table = driver.findElement(By.xpath("//div[@class='tableFixHead']"));
        js.executeScript("arguments[0].scrollTop=arguments[1];", table,400);

        
    }
}
