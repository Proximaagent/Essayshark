package org.essays;// Generated by Selenium IDE
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class App {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  public App() {
    // System.setProperty("webdriver.chrome.driver","/home/beckhamochieng/essaysharproject/src/main/resources/chromedriver_linux64/chromedriver");
    System.setProperty("webdriver.chrome.driver","/home/azureuser/essaysharproject/src/main/resources/chromedriver_linux64/chromedriver");

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("start-maximized");
    options.addArguments("disable-infobars");
    options.addArguments("--disable-extensions");
    options.addArguments("--disable-gpu");
    options.addArguments("--no-sandbox");
    options.addArguments("--headless");
    driver = new ChromeDriver(options);

    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  
  public void tearDown() {
    driver.quit();
  }

  public static void main(String ...args) {
    var app = new App();

    WebDriverWait wait = new WebDriverWait(app.driver, Duration.ofSeconds(300000000));
    
    app.driver.get("https://essayshark.com/");
    // 2 | setWindowSize | 1920x1003 | 
    app.driver.manage().window().setSize(new Dimension(1920, 1003));
    
    /*
     * LOGGING ITNO THE WEBSITE
     */
    app.driver.findElement(By.cssSelector(".bb-accountEmptyButton")).click();
    // 4 | click | css=.bb-authFields .bb-loginField > .bb-input | 
    app.driver.findElement(By.cssSelector(".bb-authFields .bb-loginField > .bb-input")).click();
    // 5 | mouseDownAt | name=password | 167.5,-0.5
    {
      WebElement element = app.driver.findElement(By.name("password"));
      Actions builder = new Actions(app.driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 6 | mouseMoveAt | name=password | 167.5,-0.5
    {
      WebElement element = app.driver.findElement(By.name("password"));
      Actions builder = new Actions(app.driver);
      builder.moveToElement(element).perform();
    }
    // 7 | mouseUpAt | name=password | 167.5,-0.5
    {
      WebElement element = app.driver.findElement(By.name("password"));
      Actions builder = new Actions(app.driver);
      builder.moveToElement(element).release().perform();
    }
    // 8 | click | css=.bb-authFields | 
    app.driver.findElement(By.cssSelector(".bb-authFields")).click();
    // 9 | type | css=.bb-authFields .bb-loginField > .bb-input | Glule83x@gmail.com
    app.driver.findElement(By.cssSelector(".bb-authFields .bb-loginField > .bb-input")).sendKeys("Glule83x@gmail.com");
    // 10 | click | name=password | 
    app.driver.findElement(By.name("password")).click();
    // 11 | type | name=password | Lexz2023
    app.driver.findElement(By.name("password")).sendKeys("Lexz2023");
    System.out.println("Logged in now");
    // Clixk login button
    // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    // Enter
    app.driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
    /*
     * OPENING TASK TABE AND DOING THEM
    */

 while (true)  {
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[5]/div/div[2]/table/tbody/tr[9]/td[2]/a")));

    app.driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div/div[2]/table/tbody/tr[9]/td[2]/a")).click();

    try {

        while (true) {
            app.driver.navigate().refresh();
            app.driver.findElement(By.id("rec_bid")).click();
            app.driver.findElement(By.id("apply_order")).click();
        }

      } catch (Exception e) {
        app.driver.findElement(By.xpath("//*[@id='user_nav']/li[1]/a")).click();
    }
    
}

}
}
