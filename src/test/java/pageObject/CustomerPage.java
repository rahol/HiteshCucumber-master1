package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage  {

    static WebDriver driver;

    public CustomerPage(WebDriver driver){
        this.driver=driver;
    }

    public static void setBtnContinue(){
        try {
           driver.findElement(By.xpath("//span[@class='ui-button-text' and text()='Continue']")).click();
        }
        catch (NullPointerException e){
            System.out.println(e +"((((((((((()))))))))))))");
        }

    }

    public static void createAcctSection(){
        boolean acc = driver.findElement(By.xpath("//a[ text()='Create an Account']")).isDisplayed();
        Assert.assertEquals(true, acc);
    }

    public static void userSelect(String Countryname){
        Select drpcounty = new Select(driver.findElement(By.xpath("//*[@name='country']")));
        drpcounty.selectByVisibleText(Countryname);
    }

    public static void enterFNameLName(String fname,String lname){
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(fname);
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(lname);

    }

    public static void selectGender(){
        driver.findElement(By.xpath("//*[@value='f']")).click();
    }

    public static void enterUserAddress(String street, String suburb, String pincode, String city, String state){
        driver.findElement(By.xpath("//*[@name='street_address']")).sendKeys(street);
        driver.findElement(By.xpath("//*[@name='suburb']")).sendKeys(suburb);
        driver.findElement(By.xpath("//*[@name='postcode']")).sendKeys(pincode);
        driver.findElement(By.xpath("//*[@name='city']")).sendKeys(city);
        driver.findElement(By.xpath("//*[@name='state']")).sendKeys(state);

    }

    public static void clickOnContiBtn() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='tdb4']")).click();

    }

    public static void confirmationmsg(String msg1){
        String msg = driver.findElement(By.xpath("//h1['Your Account Has Been Created!']")).getText();

        Assert.assertEquals(msg, msg1);
    }

    public static void enterDOB(String date){
        driver.findElement(By.xpath("//*[@id='dob']")).click();

        Select drpmonth = new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
        drpmonth.selectByVisibleText("Nov");

        Select drpyear = new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
        drpyear.selectByVisibleText("1991");


        driver.findElement(By.xpath("//*[text()='26']")).click();


        //   driver.findElement(By.xpath("//*[@id='dob']")).sendKeys(date);

    }

    public static void enterEmail(String email){

        driver.findElement(By.xpath("//*[@name='email_address']")).sendKeys(email);
    }

    public static void enterContactdetails(String tel, String fax) {
        driver.findElement(By.xpath("//*[@name='telephone']")).sendKeys(tel);
        driver.findElement(By.xpath("//*[@name='fax']")).sendKeys(fax);

    }

    public static void enterPassword(String pass, String confPass) {
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//*[@name='confirmation']")).sendKeys(confPass);
    }
}


