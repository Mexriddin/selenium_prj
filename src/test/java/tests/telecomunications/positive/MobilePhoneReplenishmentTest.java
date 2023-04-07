package tests.telecomunications.positive;

import common.Listener;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import tests.base.BaseTest;


import static constants.Constant.Currency.CURRENCY_UAH;
import static constants.Constant.FromCardTestData.*;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;
@Link(name = "check-list", url = "https://www.google.com/")
@Feature("Test to check the operation of replenishment of the mobile phone number")
@Story("A positive scenario")
@ExtendWith(Listener.class)
//@Execution(ExecutionMode.CONCURRENT)
public class MobilePhoneReplenishmentTest extends BaseTest {

    @Test
    @DisplayName("Public session, non-client, redirect checking for authorization, after selecting card from wallet")
    public void CheckIsRedirectToAuth() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage
                .selectCardFromWallet()
                .checkIsDisplayedAuthWidget();
    }

    @Test
    @DisplayName("Public session, non-client, replenishment of mobile numbers for the minimum account")
    public void CheckMinimumReplenishmentAmount() {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("1")
                .enterCardFrom(FROM_CARD)
                .enterCardExpDate(FROM_CARD_EXP_DATE)
                .enterCardCvv(FROM_CARD_CVV)
                .submitMobileReplenishment()
                .checkPaymentAmountAndCommission("1", "1")
                .checkPaymentCurrency(CURRENCY_UAH, CURRENCY_UAH)
                .checkPaymentNumberAndRecipient("Kyivstar Ukraine");
    }
}
