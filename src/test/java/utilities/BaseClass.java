package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pageObject.CustomerPage;
import pageObject.LoginPage;

public class BaseClass {

    WebDriver driver;


//    public void launchBrowser()
//    {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bachh\\eclipse-workspace\\SeleniumCucumber\\Drivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }

}
