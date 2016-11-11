package demo;

import com.utils.DataProperties;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.io.IOException;

/**
 * Created by Alex on 11.11.2016.
 */
public class BeforeClass {

    private WebDriver driver;
    String ChromePath = DataProperties.path("chromedriver.exe");

    @Before
    public void main () throws FindFailed {


        System.setProperty("webdriver.chrome.driver", ChromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.best-flash-games.net/");

    }

    @After
    public void close() throws Exception {
        driver.close();
    }


}
