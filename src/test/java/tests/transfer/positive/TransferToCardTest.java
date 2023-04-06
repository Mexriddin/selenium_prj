//package tests.transfer.positive;
//
//import org.junit.jupiter.api.Test;
//import tests.base.BaseTest;
//
//import static constants.Constant.FromCardTestData.*;
//import static constants.Constant.RecipientCardTestData.*;
//import static constants.Constant.Urls.TRANSFER_TO_CARD_URL;
//
//public class TransferToCardTest  extends BaseTest {
//
//    @Test
//    public void CheckMinimumTransferAmount(){
//        basePage.goToUrl(TRANSFER_TO_CARD_URL);
//        transferToCardPage
//                .enterCardFrom(FROM_CARD)
//                .enterCardExpDate(FROM_CARD_EXP_DATE)
//                .enterCardCvv(FROM_CARD_CVV)
//                .enterCardFromFirstName(FROM_CARD_FIST_NAME)
//                .enterCardFromLastName(FROM_CARD_LAST_NAME)
//                .enterCardReceiver(RECIPIENT_CARD)
//                .enterCardReceiverFirstName(RECIPIENT_CARD_FIST_NAME)
//                .enterCardReceiverLastName(RECIPIENT_CARD_LAST_NAME)
//                .enterAmount("10")
//                .chooseUsdCurrency()
//                .submitToTransfer()
//                .checkTransferDetailsIsPresentInTheCart("Total to debit");
//
//    }
//
//}
