package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitiateWebDriver {

    public static WebDriver driver;

    @Before
    public static WebDriver getDriver(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        return driver;
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
