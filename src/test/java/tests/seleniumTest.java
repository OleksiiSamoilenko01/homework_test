package tests;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class seleniumTest {
    private WebDriver driver;
    String URL = "https://www.google.com/?hl=en-US";

    @BeforeMethod
    public void chromedriverURL() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void CloseBrowser() {
        driver.close();
    }

    @Test
    public void Test() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("ithillel", Keys.ENTER);

        // driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']")).click();

        Thread.sleep(3000);

        List<WebElement> elements = driver.findElements(By.xpath("//a/h3"));
        int i = 0;
        for (WebElement element : elements) {
            if (!element.getText().toLowerCase().contains("ithillel")) {
                System.out.println("Element with number " + i + " " + element.getText() + " doesn't containe \"hillel it school\"");
            }
            i++;
        }

    }
    @Test
    public void Test2() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("Linkedin test", Keys.ENTER);
        //   driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']")).click();

        Thread.sleep(3000);

        List<WebElement> elements = driver.findElements(By.xpath("//a/h3"));
        int i = 0;
        for (WebElement element : elements) {
            if (!element.getText().toLowerCase().contains("linkedin test")) {
                System.out.println("Element with number " + i + " " + element.getText() + " doesn't containe \"hillel it school\"");
            }
            i++;
        }

    }

}
