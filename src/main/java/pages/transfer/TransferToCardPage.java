package pages.transfer;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import pages.telecomunications.MobilePhoneReplenishmentPage;

public class TransferToCardPage  extends BasePage {
    public TransferToCardPage(WebDriver driver) {
        super(driver);
    }

    private final By inputCardAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By firstNameDebit = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    private final By lastNameDebit = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
    private final By inputCardReceiver = By.xpath("//input[@data-qa-node='numberreceiver']");
    private final By firstNameReceiver = By.xpath("//input[@data-qa-node='firstNamereceiver']");
    private final By lastNameReceiver = By.xpath("//input[@data-qa-node='lastNamereceiver']");
    private final By buttonCurrency = By.xpath("//button[@data-qa-node='currency']");
    private final By currencyUSD = By.xpath("//button[@data-qa-value='USD']");
    private final By buttonSubmit = By.xpath("//button[@type='submit']");


    private final By transferDetails = By.xpath("//div[@data-qa-node='total']/span");


    public TransferToCardPage enterCardFrom(String cardFrom) {
        typeInput(inputCardFrom, cardFrom);
        return this;
    }

    public TransferToCardPage enterCardExpDate(String expDate) {
        typeInput(inputCardExpDate, expDate);
        return this;
    }

    public TransferToCardPage enterCardCvv(String cvv) {
        typeInput(inputCardCvv, cvv);
        return this;
    }

    public TransferToCardPage enterCardFromFirstName(String firstName) {
        typeInput(firstNameDebit, firstName);
        return this;
    }

    public TransferToCardPage enterCardFromLastName(String lastName) {
        typeInput(lastNameDebit, lastName);
        return this;
    }

    public TransferToCardPage enterCardReceiver(String cardReceiver) {
        typeInput(inputCardReceiver, cardReceiver);
        return this;
    }

    public TransferToCardPage enterCardReceiverFirstName(String firstName) {
        typeInput(firstNameReceiver, firstName);
        return this;
    }

    public TransferToCardPage enterCardReceiverLastName(String lastName) {
        typeInput(lastNameReceiver, lastName);
        return this;
    }

    public TransferToCardPage enterAmount(String amount) {
        clearAndTypeInput(inputCardAmount, amount);
        return this;
    }

    public TransferToCardPage chooseUsdCurrency() {
        driver.findElement(buttonCurrency).click();
        driver.findElement(currencyUSD).click();
        return this;
    }

    public TransferToCardPage submitToTransfer() {
        driver.findElement(buttonSubmit).click();
        return this;
    }

    public TransferToCardPage checkTransferDetailsIsPresentInTheCart(String text) {
        WebElement details = waitElementIsVisible(driver.findElement(transferDetails));
        Assertions.assertEquals(text, details.getText());
        return this;
    }
}
