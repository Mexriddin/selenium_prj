package pages.loans;

import pages.base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class CarLoansPage extends BasePage {

    public final SelenideElement tabAgreements = $x("//div[contains(text(), 'Agreements')]");
    public final SelenideElement amountFieldCarCost = $x("//input[@data-qa-node='amont']");
    public final SelenideElement amountFieldPrepaidExpense = $x("//input[@data-qa-node='prepaid']");
    public final SelenideElement phoneCodeButton = $x("//button[@data-qa-node='phone-code']");
    public final SelenideElement searchPhoneCodeField = $x("//input[@placeholder='Search']");
    public final SelenideElement phoneNumberField = $x("//input[@data-qa-node='phone-number']");
    public final SelenideElement applyOrderButton = $x("//button[@type='button']");
    public final SelenideElement selectedUsedAutoTab = $x("//div[@data-qa-node='type']");
    public final SelenideElement confirmForm = $x("//div[contains(text(), 'One-time password has been')]");
    public final SelenideElement buttonCountryRussia = $x("//div[@name='Russia']");

    /**
     * Selecting a tab agreements
     * **/
    public CarLoansPage selectAgreementsTab(){
        tabAgreements.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Test display of the form confirmation of transaction
     * **/
    public CarLoansPage checkIsDisplayedConfirm() {
        confirmForm.shouldBe(Condition.visible);
        return this;
    }

    /**
     * Enter the amount of the car value
     * @param amount the full cost of a car
     * **/
    public CarLoansPage enterAmountFieldCarCost(String amount) {
        clearAndTypeInput(amountFieldCarCost, amount);
        return this;
    }

    /**
     * Enter the advance amount for the loan
     * @param amount the amount of the advance payment
     * **/
    public CarLoansPage enterAmountFieldPrepaidExpense(String amount) {
        clearAndTypeInput(amountFieldPrepaidExpense, amount);
        return this;
    }

    /**
     * Filling in the mobile number to apply
     * @param phoneNumber mobile number ti apply
     * **/
    public CarLoansPage enterPhoneNumber(String phoneNumber) {
        clearAndTypeInput(phoneNumberField, phoneNumber);
        return this;
    }

    /**
     * Search country code for mobile communications
     * @param phonenumber mobile number to apply
     * **/
    public CarLoansPage searchPhoneCountryCodeField(String phonenumber) {
        clearAndTypeInput(searchPhoneCodeField, phonenumber);
        return this;
    }

    /**
     * Selection of drop-down list od codes of countries, mobile communication
     * **/
    public CarLoansPage selectPhoneCodeButton(){
        phoneCodeButton.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Confirmation of application for credit
     * **/
    public CarLoansPage submitOrderButton(){
        applyOrderButton.shouldBe(Condition.visible).click();
        return this;
    }

    /**
     * Check that the selected tab is "With mileage"
     * **/
    public CarLoansPage checkSelectedTabWithMileageAuto() {
        selectedUsedAutoTab.shouldBe(Condition.visible);
        return this;
    }

    /**
     * Select the country code from the drop-down list
     * **/
    public CarLoansPage selectCountryRussiaFromList() {
        buttonCountryRussia.shouldBe(Condition.visible).click();
        return this;
    }



















}
