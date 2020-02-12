import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    @BeforeTest
    public void setup(){
        Selenium.setup();
    }
    @Test
        public void searchByKeywordTest(){
        Selenium.searchByKeyword("Baranauskas");
    }
    @AfterTest
    public void close(){
        Selenium.close();
    }
}
