import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameDemo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver", "C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://demo.guru99.com/test/ajax.html");
        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements: " + elements.size());

        for (int index = 0; index < elements.size(); index++) {
            System.out.println("Radio button text: " + elements.get(index).getAttribute("value"));
        }
    }

}
