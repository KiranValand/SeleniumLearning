package seleniumSession.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\ADMIN\\IdeaProjects\\Drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        /* 3. Navigate to webpage */
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().getPosition();
        // 4. get page title (Tab name)
        String title = driver.getTitle();
        System.out.print (title);
//5 . Expected vs Actual - Validation
        if (title.equals("nopCommerce demo store")) {
            System.out.println("          You are in correct location!!");
        }
        else{            System.out.println("          You are in incorrect location!!");

        }


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


        // 6. close the window
        driver.close(); // closes the current session

    }
}

