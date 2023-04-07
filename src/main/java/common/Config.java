package common;

import com.codeborne.selenide.Configuration;

public class Config {
    /**
     * Specify the browser to test:
     **/
    public static final String BROWSER_NAME = "chrome";     //firefox | edge | opera | ie |
    /** Clean browser cookies after each iteration **/
    public static final Boolean CLEAR_COOKIES = false;
    /** To keep the browser open after all scenario/test **/
    public static final Boolean HOLD_BROWSER_OPEN = false;
    /** Clear the directory with the screen before starting the build **/
    public static final Boolean CLEAR_REPORTS_DIR = true;

    static {
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
        Configuration.reportsFolder = "build/reports/tests";
        Configuration.browser = BROWSER_NAME;
        Configuration.pageLoadTimeout = 10000;
        Configuration.timeout = 10000;
    }
}
