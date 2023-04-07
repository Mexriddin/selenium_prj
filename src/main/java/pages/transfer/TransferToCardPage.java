package pages.transfer;

import pages.base.BasePage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.telecomunications.MobilePhoneReplenishmentPage;

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



    /**
     * Enter the card number for transfer
     * @param number debit card number
     * **/
    public TransferToCardPage enterCardFrom(String number) {
        clearAndTypeInput(inputCardFrom, number);
        return this;
    }

    /**
     * Enter the card expiry data for transfer
     * @param expDate expiry data
     * **/
    public TransferToCardPage enterCardExpDate(String expDate) {
        clearAndTypeInput(inputCardExpDate, expDate);
        return this;
    }

    /**
     * Enter the cvv code from the card for transfer
     * @param cvv cvv code
     * **/
    public TransferToCardPage enterCardCvv(String cvv) {
        clearAndTypeInput(inputCardCvv, cvv);
        return this;
    }

    /**
     * Enter the sender's first name
     * **/
    public TransferToCardPage enterCardFromFirstName(String firstName) {
        clearAndTypeInput(firstNameDebit, firstName);
        return this;
    }
    /**
     * Enter the sender's last name
     * **/
    public TransferToCardPage enterCardFromLastName(String lastName) {
        clearAndTypeInput(lastNameDebit, lastName);
        return this;
    }

    /**
     * Enter the card number for transfer
     * @param number receiver card number
     * **/
    public TransferToCardPage enterCardReceiver(String number) {
        clearAndTypeInput(inputCardReceiver, number);
        return this;
    }
    /**
     * Enter the recipient's first name
     * **/
    public TransferToCardPage enterCardReceiverFirstName(String firstName) {
        clearAndTypeInput(firstNameReceiver, firstName);
        return this;
    }

    /**
     * Enter the recipient's last name
     * **/
    public TransferToCardPage enterCardReceiverLastName(String lastName) {
        clearAndTypeInput(lastNameReceiver, lastName);
        return this;
    }

    /**
     * Enter transaction amount
     * @param amount transfer amount
     * **/
    public TransferToCardPage enterAmount(String amount) {
        clearAndTypeInput(inputCardAmount, amount);
        return this;
    }

    /**
     * Selection USD of drop-down list codes of currency
     * **/
    public TransferToCardPage chooseUsdCurrency() {
        buttonCurrency.shouldBe(Condition.visible).click();
        currencyUSD.shouldBe(Condition.visible).click();
        return this;
    }
    /**
     * Acceptance of transfer
     * **/
    public TransferToCardPage submitToTransfer() {
        buttonSubmit.shouldBe(Condition.visible).doubleClick();
        buttonSubmit.shouldBe(Condition.visible).doubleClick();
        return this;
    }

    public TransferToCardPage checkTransferDetailsIsPresentInTheCart(String text) {
        checkMessage(text);
        return this;
    }

    /**
     * Check the card number sender and the recipient
     * @param sender the card number for payment
     * @param recipient mobile operator
     * **/
    public TransferToCardPage checkPaymentCardAndRecipient(String sender, String recipient) {
        checkMessage(sender);
        checkMessage(recipient);
        return this;
    }

    /**
     * Check the amount and commission amount
     * @param amount the amount will be credited to the recipient's card
     * @param commission the amount of commission from the transfer
     * **/
    public TransferToCardPage checkTransferAmountAndCommission(String amount, String commission) {
        checkMessage(amount);
        checkMessage(commission);
        return this;
    }

    /**
     * Check the currency of the transfer amount and currency of fee
     * @param currencyAmount currency of the payment
     * @param currencyCommission currency of fee
     * **/
    public TransferToCardPage checkPaymentCurrency(String currencyAmount, String currencyCommission) {
        checkMessage(currencyAmount);
        checkMessage(currencyCommission);
        return this;
    }
}
