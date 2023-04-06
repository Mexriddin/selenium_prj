package pages.transfer;

import pages.base.BasePage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class TransferToCardPage  extends BasePage {

    private final SelenideElement inputCardAmount = $x("//input[@data-qa-node='amount']");
    private final SelenideElement inputCardFrom = $x("//input[@data-qa-node='numberdebitSource']");
    private final SelenideElement inputCardExpDate = $x("//input[@data-qa-node='expiredebitSource']");
    private final SelenideElement inputCardCvv = $x("//input[@data-qa-node='cvvdebitSource']");
    private final SelenideElement firstNameDebit = $x("//input[@data-qa-node='firstNamedebitSource']");
    private final SelenideElement lastNameDebit = $x("//input[@data-qa-node='lastNamedebitSource']");
    private final SelenideElement inputCardReceiver = $x("//input[@data-qa-node='numberreceiver']");
    private final SelenideElement firstNameReceiver = $x("//input[@data-qa-node='firstNamereceiver']");
    private final SelenideElement lastNameReceiver = $x("//input[@data-qa-node='lastNamereceiver']");
    private final SelenideElement buttonCurrency = $x("//button[@data-qa-node='currency']");
    private final SelenideElement currencyUSD = $x("//button[@data-qa-value='USD']");
    private final SelenideElement buttonSubmit = $x("//button[@type='submit']");


    public TransferToCardPage enterCardFrom(String cardFrom) {
        clearAndTypeInput(inputCardFrom, cardFrom);
        return this;
    }

    public TransferToCardPage enterCardExpDate(String expDate) {
        clearAndTypeInput(inputCardExpDate, expDate);
        return this;
    }

    public TransferToCardPage enterCardCvv(String cvv) {
        clearAndTypeInput(inputCardCvv, cvv);
        return this;
    }

    public TransferToCardPage enterCardFromFirstName(String firstName) {
        clearAndTypeInput(firstNameDebit, firstName);
        return this;
    }

    public TransferToCardPage enterCardFromLastName(String lastName) {
        clearAndTypeInput(lastNameDebit, lastName);
        return this;
    }

    public TransferToCardPage enterCardReceiver(String cardReceiver) {
        clearAndTypeInput(inputCardReceiver, cardReceiver);
        return this;
    }

    public TransferToCardPage enterCardReceiverFirstName(String firstName) {
        clearAndTypeInput(firstNameReceiver, firstName);
        return this;
    }

    public TransferToCardPage enterCardReceiverLastName(String lastName) {
        clearAndTypeInput(lastNameReceiver, lastName);
        return this;
    }

    public TransferToCardPage enterAmount(String amount) {
        clearAndTypeInput(inputCardAmount, amount);
        return this;
    }

    public TransferToCardPage chooseUsdCurrency() {
        buttonCurrency.shouldBe(Condition.visible).click();
        currencyUSD.shouldBe(Condition.visible).click();
        return this;
    }

    public TransferToCardPage submitToTransfer() {
        buttonSubmit.shouldBe(Condition.visible).click();
        return this;
    }

    public TransferToCardPage checkTransferDetailsIsPresentInTheCart(String text) {
        checkMessage(text);
        return this;
    }
}
