import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    static WebDriver browser;

    public static void setup(){
        System.setProperty("webdriver.chrome.driver",
                "webdrivers/chromedriver.exe");

        browser = new ChromeDriver();
        browser.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php");
    }

    public static void close(){
        browser.close();
    }

    public static void searchByKeyword(String keyword){
        WebElement searchField = browser.findElement(By.id("sb_form_q"));
        searchField.sendKeys(keyword);
        searchField.sendKeys(Keys.ENTER);

    }

    public static void main(String args[]) {
        System.out.println("Maven + Selenium + JUnit");
        setup();
        searchByKeyword("Baranauskas");
        close();
    }
}
