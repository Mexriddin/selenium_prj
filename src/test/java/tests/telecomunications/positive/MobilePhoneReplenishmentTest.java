//package tests.telecomunications.positive;
//
//import org.junit.jupiter.api.Test;
//import tests.base.BaseTest;
//
//
//import static constants.Constant.FromCardTestData.*;
//import static constants.Constant.Urls.MOBILE_PAYMENT_URL;
//
//public class MobilePhoneReplenishmentTest extends BaseTest {
//
//    @Test
//    public void CheckIsRedirectToAuth() {
//        basePage.goToUrl(MOBILE_PAYMENT_URL);
//        mobilePhoneReplenishmentPage.selectCardWallet();
//        basePage.isAuthWidgetPresent();
//    }
//
//    @Test
//    public void CheckMinimumReplenishmentAmount() {
//        basePage.goToUrl(MOBILE_PAYMENT_URL);
//        mobilePhoneReplenishmentPage
//                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
//                .enterAmount("1")
//                .enterCardFrom(FROM_CARD)
//                .enterCardExpDate(FROM_CARD_EXP_DATE)
//                .enterCardCvv(FROM_CARD_CVV)
//                .submitToTheCard()
//                .checkPaymentDetailsIsPresentInTheCart("Mobile payment. Phone number +380686979712");
//    }
//}
