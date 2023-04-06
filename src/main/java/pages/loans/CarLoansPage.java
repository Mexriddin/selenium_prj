package pages.loans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CarLoansPage extends BasePage {
    public CarLoansPage(WebDriver driver) {
        super(driver);
    }

    public final By tabAgreements = By.xpath("//div[contains(text(), 'Agreements')]");

    public CarLoansPage selectAgreementsTab(){
        waitElementIsVisible(driver.findElement(tabAgreements)).click();
        return this;
    }
}
