package pageObjects.ness;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CareersPage {

    @FindBy(css = "input[id='Keywords']")
    private WebElement txtJobKeyword;

    @FindBy(id = "mat-select-2")
    private WebElement ddlJobLocation;

    @FindBy(css = "div.card-job-container")
    private List<WebElement> lstJobResults;

    // Getters

    public WebElement getTxtJobKeyword() {
        return txtJobKeyword;
    }
    public WebElement getDdlJobLocation() {
        return ddlJobLocation;
    }

    public List<WebElement> getLstJobResults() {
        return lstJobResults;
    }

}
