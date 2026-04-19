package vn.fpoly.sof3041_sp26_sd22141.service;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriverTest {
    private WebDriver webDriver;
    @BeforeEach
    void setup(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }
    @Test
    void testSteps() throws InterruptedException{
        //open
        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        //click menu 3 gach
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        //login
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
    //input values via form
        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");
       //submit form
        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();

       WebElement webElement= webDriver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));
        Assertions.assertEquals("Formal Shoes",webElement.getText());

    }
}
