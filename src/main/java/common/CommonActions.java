package common;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static common.Config.BROWSER_AND_PLATFORM;
import static constants.Constant.TimeoutVariables.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (BROWSER_AND_PLATFORM) {
            case "chrome_windows" :
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                ChromeOptions option = new ChromeOptions();
                option.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(option);
                break;  
            case "mozilla_windows":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                Assertions.fail("Incorrect browser name" + BROWSER_AND_PLATFORM);
        }
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }
}
