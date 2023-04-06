package pages.telecomunications;

import pages.base.BasePage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class MobilePhoneReplenishmentPage extends BasePage {

    private final SelenideElement inputCardPhoneNumber = $x("//input[@data-qa-node='phone-number']");
    private final SelenideElement inputCardAmount = $x("//input[@data-qa-node='amount']");
    private final SelenideElement inputCardFrom = $x("//input[@data-qa-node='numberdebitSource']");
    private final SelenideElement inputCardExpDate = $x("//input[@data-qa-node='expiredebitSource']");
    private final SelenideElement inputCardCvv = $x("//input[@data-qa-node='cvvdebitSource']");
    private final SelenideElement buttonSubmit = $x("//button[@data-qa-node='submit']");
//    private final SelenideElement cardNumberInTheCart = $x("//td[@data-qa-node='card']");
//    private final SelenideElement recipientNameInTheCart = $x("//span[@data-qa-node='nameB']");
//    private final SelenideElement amountInTheCart = $x("//span[@data-qa-node='amount']");
//    private final SelenideElement commissionInTheCart = $x("//span[@data-qa-node='commission']");
//    private final SelenideElement amountCurrencyInTheCart = $x("//small[@data-qa-node='currency']");
//    private final SelenideElement commissionCurrencyInTheCart = $x("//small[@data-qa-node='commission-currency']");
    private final SelenideElement buttonWallet = $x("//div[@data-qa-node='debitSourceSource']");

    private final SelenideElement firstNameDebit = $x("//input[@data-qa-node='firstNamedebitSource']");
    private final SelenideElement lastNameDebit = $x("//input[@data-qa-node='lastNamedebitSource']");





    /**
     * Enter a phone number excluding country code
     * @param phone phone number
     * **/
    public MobilePhoneReplenishmentPage enterPhoneNumber(String phone) {
       clearAndTypeInput(inputCardPhoneNumber, phone);
        return this;
    }

    /**
     * Enter the amount of replenishment of the mobile phone number
     * @param amount amount of replenishment
     * **/
    public MobilePhoneReplenishmentPage enterAmount(String amount) {
        clearAndTypeInput(inputCardAmount, amount);
        return this;
    }

    /**
     * Enter the card number for payment
     * @param number card number
     * **/
    public MobilePhoneReplenishmentPage enterCardFrom(String number) {
        clearAndTypeInput(inputCardFrom, number);
        return this;
    }

    /**
     * Enter the card expiry data for payment
     * @param expData expiry data
     * **/
    public MobilePhoneReplenishmentPage enterCardExpDate(String expData) {
        clearAndTypeInput(inputCardExpDate, expData);
        return this;
    }

    /**
     * Enter the cvv code from the card for payment
     * @param cvv cvv code
     * **/
    public MobilePhoneReplenishmentPage enterCardCvv(String cvv) {
        clearAndTypeInput(inputCardCvv, cvv);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardFirstName(String firstName) {
        clearAndTypeInput(firstNameDebit, firstName);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardLastName(String lastName) {
        clearAndTypeInput(lastNameDebit, lastName);
        return this;
    }


    /**
     * Acceptance of payment
     * **/
    public MobilePhoneReplenishmentPage submitMobileReplenishment() {
        buttonSubmit.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Choose a card from  the wallet
     * **/
    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        buttonWallet.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Check the card number with the payment and the recipient
     * @param cardForm the card number for payment
     * @param recipient mobile operator
     * **/
    public MobilePhoneReplenishmentPage checkPaymentCardAndRecipient(String cardForm, String recipient) {
        checkMessage(cardForm);
        checkMessage(recipient);
        return this;
    }

    /**
     * Check the amount and commission amount
     * @param amount the amount will be credited to the mobile account
     * @param commission the commission in addition to mobile account
     * **/
    public MobilePhoneReplenishmentPage checkPaymentAmountAndCommission(String amount, String commission) {
        checkMessage(amount);
        checkMessage(commission);
        return this;
    }

    /**
     * Check the currency of the payment amount and currency of fee
     * @param currencyAmount currency of the payment
     * @param commissionAmount currency of fee
     * **/
    public MobilePhoneReplenishmentPage checkPaymentCurrency(String currencyAmount, String commissionAmount) {
        checkMessage(currencyAmount);
        checkMessage(commissionAmount);
        return this;
    }
}
