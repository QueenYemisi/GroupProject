package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static Properties CONFIG = null;
    public static WebDriver driver = null;

    public void initialize() throws IOException {
        if (driver == null) {
//         This code will read the config property file
            CONFIG = new Properties();
            FileInputStream fn = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
            CONFIG.load(fn);
//            initialize the WebDriver
            if (CONFIG.getProperty("Browser").equals("edge")) {
                System.setProperty("webdriver.edge.driver", "c://msedgedriver.exe");
                driver = new EdgeDriver();
            } else if (CONFIG.getProperty("Browser").equals("IE")) {
                System.setProperty("webdriver.chrome.driver", "C:\\IeDriverServer.exe");
                driver = new InternetExplorerDriver();
            } else if (CONFIG.getProperty("Browser").equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
                driver = new ChromeDriver();
            }
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }


    }
}
