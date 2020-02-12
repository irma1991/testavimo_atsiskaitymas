import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    @BeforeTest
    public void setup(){
        Selenium.setup();
    }

    @Test
        public void addRecordTest() {
        Selenium.addRecord("Daktaras miegas","Mistinis","Mike Flanagan");
    }

    @Test
        public void notValidRecordTest() {
        Selenium.notValidRecord("<p>","<h1>","/.[}");
    }

    @Test
    public void deleteRecordTest() {
        Selenium.deleteRecord("725");
    }

    @Test
    public void updateRecordTest() {
        Selenium.updateRecord("87","Spider87","Komedija","Irma");
    }

    @Test
    public void notValidRecordUpdateTest() {
        Selenium.notValidRecordUpdate("87","<p>Spider87</p>","'{}-=}'","<h2>Irma</h2>");
    }

    // @AfterTest
    // public void close(){
        //Selenium.close();
    //}
}
