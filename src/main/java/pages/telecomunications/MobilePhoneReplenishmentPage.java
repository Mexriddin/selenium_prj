package pages.telecomunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {
    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");
    private final By inputCardPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputCardAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By firstNameDebit = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    private final By lastNameDebit = By.xpath("//input[@data-qa-node='lastNamedebitSource']");

    private final By buttonSubmit = By.xpath("//button[@data-qa-node='submit']");
    private final By paymentDetails = By.xpath("//span[@data-qa-node='details']");




    public MobilePhoneReplenishmentPage selectCardWallet () {
        waitElementIsVisible(driver.findElement(buttonWallet)).click();
        return this;
    }    

    public MobilePhoneReplenishmentPage enterPhoneNumber(String phoneNumber) {
        typeInput(inputCardPhoneNumber, phoneNumber);
//        driver.findElement(inputCardPhoneNumber).sendKeys(phoneNumber);
        return this;
    }

    public MobilePhoneReplenishmentPage enterAmount(String amount) {
        clearAndTypeInput(inputCardAmount, amount);
//        WebElement inputAmount = driver.findElement(inputCardAmount);
//        inputAmount.sendKeys(Keys.CONTROL+"A");
//        inputAmount.sendKeys(Keys.BACK_SPACE);
//        inputAmount.sendKeys(amount);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardFrom(String cardFrom) {
        typeInput(inputCardFrom, cardFrom);
//        driver.findElement(inputCardFrom).sendKeys(cardFrom);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate) {
        typeInput(inputCardExpDate, expDate);
//        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardCvv(String cvv) {
        typeInput(inputCardCvv, cvv);
//        driver.findElement(inputCardCvv).sendKeys(cvv);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardFirstName(String firstName) {
        typeInput(firstNameDebit, firstName);
//        driver.findElement(firstNameDebit).sendKeys(firstName);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardLastName(String lastName) {
        typeInput(lastNameDebit, lastName);
//        driver.findElement(lastNameDebit).sendKeys(lastName);
        return this;
    }


    public MobilePhoneReplenishmentPage submitToTheCard() {
        driver.findElement(buttonSubmit).click();
        return this;
    }

    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresentInTheCart(String text) {
        WebElement details = waitElementIsVisible(driver.findElement(paymentDetails));
        Assertions.assertEquals(text, details.getText());
        return this;
    }
}
