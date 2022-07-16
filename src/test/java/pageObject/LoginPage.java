package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class LoginPage extends BaseClass {

    static By txt_username = By.id("inputUserName");
    static By txt_password = By.id("inputUserPw");
    static By btn_login = By.xpath("//div[@id='app']/div/div/div/div[2]/div/div[2]/form/div[3]/button");
    static By login_text = By.cssSelector(".dl-auth__login__form > p");
    static By savings_text = By.cssSelector(".dl-section:nth-child(1) .dl-section--heading-blue");
    static By OTP_field = By.id("opt-number-confirm-input-field");

    public static void enterUsername(String username){
        enterText(txt_username,username);
    }

    public static void enterPassword(String password){
        enterText(txt_password,password);
    }

    public static void clickLogin(){
        click(btn_login);
        //Boolean val = existsElement(OTP_field);

        /*if(driver.findElement(OTP_field).isDisplayed()){

            enterText(OTP_field,"222222");

        }else{

            System.out.println("No such element");

        }*/

        /*if (val = true){
            enterText(OTP_field,"222222");
        }
        else
            System.out.println("No such element");*/

    }

    public static void getActualText(String text)  throws Exception{
        getText(login_text,text);
    }

    public static void getDashboardText(String text)  throws Exception{
        getText(savings_text,text);
    }

}
