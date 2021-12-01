package seleniumSession.RegistrationForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


/*THIS PROGRAM WILL FILL THE REGISTRATION FOR THE FOLLOWING WEBSITE 'demo.nopcommerce.com' , WITH THE HELP OF WEBDRIVER.*/

public class RegistrationForm {
    public static void main(String[] args) throws InterruptedException {

        // path location for the webdriver
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ADMIN\\IdeaProjects\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //3. Navigate to webpage
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().getPosition();


        // Navigating
        Thread.sleep(2000);
        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(1000);
        //gender select
        driver.findElement(By.cssSelector("#gender-male")).click();
        Actions gender = new Actions(driver);
        gender.doubleClick();
        // change first name
        WebElement firstName = driver.findElement(By.name("FirstName"));
        firstName.sendKeys("Kiran");
        Thread.sleep(1000);
        // change first name
        WebElement lastName = driver.findElement(By.name("LastName"));
        lastName.sendKeys("Valand");
        Thread.sleep(1000);

        // change date of birth

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        day.sendKeys("22");
        month.sendKeys("October");
        year.sendKeys("1990");
        Thread.sleep(1000);
        // change email
        WebElement email = driver.findElement(By.name("Email"));
        email.sendKeys("Kvaland45@gamail.com");
        Thread.sleep(1000);
        // change company
        WebElement company = driver.findElement(By.name("Company"));
        company.sendKeys("UnifyTesting");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#Newsletter")).click();
        Actions newsletter = new Actions(driver);
        newsletter.doubleClick();
        Thread.sleep(1000);

        Thread.sleep(1000);
        // change company
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("Ext123456");
        Thread.sleep(1000);
        // change company
        WebElement confirmPassword = driver.findElement(By.name("ConfirmPassword"));
        confirmPassword.sendKeys("Ext123456");
        Thread.sleep(2000);
        // code to select register button
        driver.findElement(By.cssSelector("#register-button")).click();
        Actions register = new Actions(driver);
        register.doubleClick();
        Thread.sleep(5000);


        driver.navigate().refresh();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.getCurrentUrl();


        // 6. close the window
        driver.close(); // closes the current session
    }
}


