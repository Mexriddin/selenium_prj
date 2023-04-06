package common;

public class Config {
    /**
     * Specify the browser and platform for test:
     * chrome_windows
     * mozilla_windows
     **/
    public static final String BROWSER_AND_PLATFORM = "chrome_windows";
    /** Clean browser cookies after each iteration **/
    public static final Boolean CLEAR_COOKIES = false;
    /** To keep the browser open after all scenario/test **/
    public static final Boolean HOLD_BROWSER_OPEN = false;
    /** Clear the directory with the screen before starting the build **/
    public static final Boolean CLEAR_REPORTS_DIR = true;

}
