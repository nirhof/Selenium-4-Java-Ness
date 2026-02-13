package pageObjects.ness;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {

    @FindBy(css = "a[title='אל Ness Place שלנו - נפתח בחלון חדש']")
    private WebElement btnWorkAtNess;

    @FindBy(css = "button[class='searchBtn']")
    private WebElement btnSearch;

    @FindBy(id = "searchField")
    private WebElement txtSearch;

    @FindBy(className = "searchResult-list")
    private WebElement lblSearchResult;

    @FindBy(linkText = "צרו קשר")
    private WebElement btnContactUs;

    @FindBy(css = "a[title='Ness חזור לדף הבית']")
    private WebElement btnHome;

    // Getters

    public WebElement getBtnWorkAtNess() {

        return btnWorkAtNess;
    }
    public WebElement getBtnSearch() {
        return btnSearch;
    }
    public WebElement getTxtSearch() {
        return txtSearch;
    }

    public WebElement getSearchResult() {
        return lblSearchResult;
    }
    public WebElement getContactUsBtn() {
        return btnContactUs;
    }

    public WebElement getHomeBtn() {
        return btnHome;
    }


}
