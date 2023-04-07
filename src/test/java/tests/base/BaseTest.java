package tests.base;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.base.BasePage;
import pages.loans.CarLoansPage;
import pages.telecomunications.MobilePhoneReplenishmentPage;
import pages.transfer.TransferToCardPage;

import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

import static common.Config.*;



public class BaseTest {
    protected BasePage basePage = new BasePage();
    protected CarLoansPage carLoansPage = new CarLoansPage();
    protected MobilePhoneReplenishmentPage mobilePhoneReplenishmentPage = new MobilePhoneReplenishmentPage();
    protected TransferToCardPage transferToCardPage = new TransferToCardPage();
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    /**
     * A static initialization block in order to clean the folders with reports and screenshots
     * before starting the build tests
     * **/
    static {
        LOGGER.info("START TIME:" + LocalTime.now());
        LOGGER.info("Start clear reports dir: build/reports..." + LocalTime.now());
        File allureResults = new File("allure-results");
        if (allureResults.isDirectory()){
            for (File item : Objects.requireNonNull(allureResults.listFiles())) {
                item.delete();
            }
        }
        if(CLEAR_REPORTS_DIR) {
            File reports = new File("build/reports/tests");
            if (reports.isDirectory()) {
                for (File item : Objects.requireNonNull(reports.listFiles())) {
                    item.delete();
                }
            }
            File downloads = new File("build/downloads");
            if (downloads.isDirectory()) {
                for (File item : Objects.requireNonNull(downloads.listFiles())) {
                    item.delete();
                }
            }
        }
    }
}
