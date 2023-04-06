package constants;

public class Constant {
    public static class TimeoutVariables{
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 300;
    }

    public static class Urls {
        public static final String MOBILE_PAYMENT_URL = "https://next.privat24.ua/mobile?lang=en";
        public static final String CAR_LOANS_URL = "https://next.privat24.ua/auto-credit/order?lang=en";
        public static final String TRANSFER_TO_CARD_URL = "https://next.privat24.ua/money-transfer/card?lang=en";
    }

    public static class FromCardTestData{
        public static final String MOBILE_PAYMENT_PHONE_NUMBER = "686979712";
        public static final String FROM_CARD = "4567739561253907";
        public static final String FROM_CARD_EXP_DATE = "0924";
        public static final String FROM_CARD_CVV = "528";
        public static final String FROM_CARD_FIST_NAME = "Ruth";
        public static final String FROM_CARD_LAST_NAME = "Montalvo";

    }

    public static class RecipientCardTestData {
        public static final String RECIPIENT_CARD = "4558032855841715";
        public static final String RECIPIENT_CARD_EXP_DATE = "0223";
        public static final String RECIPIENT_CARD_CVV = "902";
        public static final String RECIPIENT_CARD_FIST_NAME = "LUIS";
        public static final String RECIPIENT_CARD_LAST_NAME = "MYERS";
    }
}
