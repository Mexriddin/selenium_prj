package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

public class BasePage {
    public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver=driver;
    }

    public final By authWidget = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");

    /**
     * The method for navigating to a specific url
     * **/
    public void goToUrl(String url) {
        driver.get(url);
    }

    /**
     * Wait for visibility element in DOM model
     * **/
    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
    /**
     * Typing in input field with value
     * **/
    protected void typeInput(By locator, String value) {
        waitElementIsVisible(driver.findElement(locator)).sendKeys(value);
    }
    /**
     * Clear input field and typing with value
     * **/
    protected void clearAndTypeInput(By locator, String value){
        WebElement input = driver.findElement(locator);
        input.sendKeys(Keys.CONTROL +"A");
        input.sendKeys(Keys.BACK_SPACE);
        input.sendKeys(value);
    }

    /**
     * Check is auth frame is visible
     * **/
    public void isAuthWidgetPresent(){
        waitElementIsVisible(driver.findElement(authWidget));
    }
}
