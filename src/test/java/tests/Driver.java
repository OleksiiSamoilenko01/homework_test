package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver instance;

    public static WebDriver getInstance() {
        if (instance == null) {
            WebDriverManager.chromedriver().setup(); // Initialize WebDriverManager
            instance = new ChromeDriver();
        }
        return instance;
    }
}
