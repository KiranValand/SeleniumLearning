package seleniumSession.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

    // Top-casting = child class object referred by parent interface reference variable.
    //Interface and can not create object and has 100% abstraction and has no method body

    //1. Create an instance of web driver
    //2. set up chrome driver (mediator)- it's path.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver",
                "C:\\Users\\ADMIN\\IdeaProjects\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
//3. Navigate to webpage
         driver.get("https://demo.nopcommerce.com/");
         driver.manage().window().fullscreen();
   // 4. get page title (Tab name)
            String title = driver.getTitle();
             System.out.print (title);
//5 . Expected vs Actual - Validation
       if (title.equals("nopCommerce demo store")) {
          System.out.println("correct");
       }
          else{            System.out.println("incorrect");

   }
       // 6. close the window
          driver.close(); // closes the current session
      //  driver.quit(); // closes  everything

        // Navigating
        Thread.sleep(3000);
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.getCurrentUrl();
}
}

