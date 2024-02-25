package codes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //selenium webdriver is a REST API
        //page refresh or DOM update cause StaleElementReferenceException

       try {
           driver.get("https://www.google.com/");
           //activites
           WebElement subhakant = driver.findElement(By.id("APjFqb"));
           subhakant.sendKeys("Su");
           System.out.println(subhakant);
           driver.navigate().refresh();
       }catch (StaleElementReferenceException e){

       }

        driver.navigate().refresh();
       //-> driver.get("https://www.google.com/");
        //all the locators which are stored in a variable before refreah becomes dead
        WebElement subhakant1 = driver.findElement(By.id("APjFqb"));
        subhakant1.sendKeys("Sameer");
       // System.out.println(subhakant);

        //driver.close();
        // driver.navigate().refresh();
        //activites
    }
}
