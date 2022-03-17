package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void setUserName(String user){
        driver.findElement(By.xpath("//*[@name='email_address']")).clear();
        driver.findElement(By.xpath("//*[@name='email_address']")).sendKeys(user);
    }
    public void setPassword(String password){
        driver.findElement(By.xpath("//*[@name='password']")).clear();
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
    }

    public void signIn(){
        driver.findElement(By.xpath("//button[@id='tdb1']")).click();
    }
    public void logOff(){
        driver.findElement(By.xpath("//a[@id='tdb4']")).click();
    }

    public void account(){

        this.driver.findElement(By.xpath("//a[@id='tdb3']")).click();
    }

}
