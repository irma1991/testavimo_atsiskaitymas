import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

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

    public static void addRecord(String keyword, String keyword2, String keyword3){
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword2);
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        directorField.sendKeys(keyword3);
        WebElement submitField = browser.findElement(By.name("insert"));
        submitField.click();

    }
    public static void notValidRecord(String keyword, String keyword2, String keyword3){
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword2);
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        directorField.sendKeys(keyword3);
        WebElement submitField = browser.findElement(By.name("insert"));
        submitField.click();

    }
    public static void deleteRecord(String keyword){
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement deleteField = browser.findElement(By.name("delete"));
        deleteField.click();

    }
    public static void updateRecord(String keyword, String keyword2, String keyword3, String keyword4){
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword2);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword3);
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        directorField.sendKeys(keyword4);
        WebElement updateField = browser.findElement(By.name("update"));
        updateField.click();

    }
    public static void notValidRecordUpdate(String keyword, String keyword2, String keyword3, String keyword4){
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword2);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword3);
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        directorField.sendKeys(keyword4);
        WebElement updateField = browser.findElement(By.name("update"));
        updateField.click();

    }

    public static void main(String args[]) {
        System.out.println("Filmu formos testavimo uzduotis");
        setup();
        addRecord("Daktaras miegas","Mistinis","Mike Flanagan");
        notValidRecord("<p>","<h1>","/.[}");
        deleteRecord("699");
        updateRecord("87","Spider87","Komedija","Irma");
        notValidRecordUpdate("87","<p>Spider87</p>","'{}-=}'","<h2>Irma</h2>");
    }
}
