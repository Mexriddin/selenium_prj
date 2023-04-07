package tests.transfer.positive;

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

import static constants.Constant.Currency.CURRENCY_USD;
import static constants.Constant.FromCardTestData.*;
import static constants.Constant.RecipientCardTestData.*;
import static constants.Constant.Urls.TRANSFER_TO_CARD_URL;




@Link(name = "check-list", url = "https://www.google.com/")
@Feature("Test to verify money transfer operation")
@Story("A positive scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
public class TransferToCardTest  extends BaseTest {

    @Test
    @DisplayName("Public session, non-client, money transfer")
    public void CheckMinimumTransferAmount(){
        basePage.goToUrl(TRANSFER_TO_CARD_URL);
        transferToCardPage
                .enterCardFrom(FROM_CARD)
                .enterCardExpDate(FROM_CARD_EXP_DATE)
                .enterCardCvv(FROM_CARD_CVV)
                .enterCardFromFirstName(FROM_CARD_FIST_NAME)
                .enterCardFromLastName(FROM_CARD_LAST_NAME)
                .enterCardReceiver(RECIPIENT_CARD)
                .enterCardReceiverFirstName(RECIPIENT_CARD_FIST_NAME)
                .enterCardReceiverLastName(RECIPIENT_CARD_LAST_NAME)
                .enterAmount("10")
                .chooseUsdCurrency()
                .submitToTransfer()
                .checkPaymentCurrency(CURRENCY_USD, CURRENCY_USD)
                .checkTransferAmountAndCommission("10 USD", "3.15 USD")
                .checkPaymentCardAndRecipient("4567 7395 6125 3907", "LUIS MYERS");
    }

}
