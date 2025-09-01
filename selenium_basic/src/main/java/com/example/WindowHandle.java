package com.example;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();
        // String parentTab = it.next();
        // String childTab = it.next();
        // driver.switchTo().window(childTab);

        

        for(String page: window){
            driver.switchTo().window(page);
            if(driver.getTitle().contains("RS")){
                break;
            }

            
        }

        String text = driver.findElement(By.xpath("//strong/a")).getText();
        System.out.println(text);

        Thread.sleep(3000);
        driver.quit();

    }
    
}
