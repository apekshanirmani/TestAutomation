package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;;
import java.util.Properties;
import org.junit.Assert;
import static utils.InitiateWebDriver.*;

public class BaseClass {

    public static Properties prop;
    static WebDriver driver;

    public BaseClass(){

        /*InitiateWebDriver iD = new InitiateWebDriver();
        driver=iD.driver;*/
        getProperties();
    }

    public static void navigateToURL(){
        driver = getDriver();
        driver.navigate().to("https://onlinebankingsit.hnb.lk/");
        //driver.get(prop.getProperty(url));
    }

    public static void getProperties(){
        try{
            prop = new Properties();
            String projectPath = System.getProperty("user.dir");
            FileInputStream input = new FileInputStream(projectPath +"/src/data/web-mapping.properties");
            prop.load(input);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
            ex.printStackTrace();
        }
    }

    public static void click(By webElement){
        driver.findElement(webElement).click();

    }

    public static void enterText(By webElement, String textToType){
        String value = prop.getProperty(textToType);
        driver.findElement(webElement).sendKeys(value);
    }

    public static void getText(By weElement, String text) throws InterruptedException {
        Thread.sleep(4000);
        String actualText = driver.findElement(weElement).getText();
        //System.out.println(prop.getProperty(text));
        Assert.assertEquals(prop.getProperty(text), actualText);

    }

    protected static boolean existsElement(By webElement) {
       // boolean isPresent = driver.findElement(webElement).isDisplayed();

        /*if (isPresent == true )
            return true;
        else
            return false;*/

        if( driver.findElement(webElement).isDisplayed()){

            return true;

        }else{

            return false;

        }
    }

}
