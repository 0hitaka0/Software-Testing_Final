/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static com.google.common.util.concurrent.ClosingFuture.submit;
import static com.google.common.util.concurrent.Futures.submit;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.bouncycastle.cms.RecipientId.password;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author Win10
 */
public class UASlogin {
    WebDriver driver = null;
    
    public UASlogin() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }
    
    @Test
    public void firstTry(){
        driver.get("https://localhost/index.php");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin123");
        driver.findElement(By.xpath("/html/body/div/form/input[3]")).click();
    }
    
    public void secondTry(){
        driver.get("https://localhost/index.php");
        driver.findElement(By.id("username")).sendKeys("hilya");
        driver.findElement(By.id("password")).sendKeys("hilyatazkia");
        driver.findElement(By.xpath("/html/body/div/form/input[3]")).click();
    }
    
    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
