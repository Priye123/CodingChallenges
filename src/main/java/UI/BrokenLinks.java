package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.hackerrank.com/contests");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("No of links are::" + allLinks.size());

        for (WebElement link : allLinks) {
            //System.out.println(link.getAttribute("href"));
            checkBrokenLink(link.getAttribute("href"));
        }

        driver.close();
    }

    private static void checkBrokenLink(String link) {
        try {
            URL url = new URL(link);
            HttpURLConnection a = (HttpURLConnection) url.openConnection();
            a.setConnectTimeout(5000);
            a.connect();

            if (a.getResponseCode() >= 400) {
                System.out.println(link + "-->" + a.getResponseMessage() + " is a broken link");
            } else {
                System.out.println(link + "-->" + a.getResponseMessage());
            }

        } catch (Exception e) {

        }
    }


}
