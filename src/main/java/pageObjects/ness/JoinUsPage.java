package pageObjects.ness;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JoinUsPage {

    @FindBy(css = "div[class='picContainer pic3']")
    private WebElement imgOurJobs;

    // Getters


    public WebElement getImgOurJobs() {
        return imgOurJobs;
    }
}
