package pro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseset {
    protected WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://luni-interface-029.vercel.app/");
    }

    @AfterTest
    public void teardown() throws InterruptedException {
    	Thread.sleep(5000);
        driver.quit();
    }
}
