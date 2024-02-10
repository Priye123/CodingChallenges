package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FilterAssignment {

    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.t-mobile.com/tablets");

        selectFilter("Brands", "All");
    }

    private static void selectFilter(String filters, String options) {
       // String x = "Brands";
        Actions action = new Actions(driver);
        //action.moveToElement(driver.findElement(By.xpath("//legend[normalize-space(text())='" + filters + "']"))).build().perform();
        driver.findElement(By.xpath("//legend[normalize-space(text())='" + filters + "']")).click();
        if (options.equalsIgnoreCase("All")){
            List<WebElement> allBrands=driver.findElements(By.xpath("//input[@type='checkbox' and @name='Brands']"));
            for(WebElement e:allBrands){
                e.click();
            }

        }
           // driver.findElement(By.xpath("//span[text()=' "+options+" ']")).click();
    }
}
