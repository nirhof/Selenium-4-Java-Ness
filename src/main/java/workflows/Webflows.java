package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.Key;
import utilities.CommonOps;

import java.util.List;


public class Webflows extends CommonOps {


    @Step("business flow - Searching for keyword")
    public static void searchForKeyword(String keyword) {
        // type keyword in the search field
        UIActions.click(nessHome.getTxtSearch());
        UIActions.updateText(nessHome.getTxtSearch(), keyword);
        // Click the search button to trigger the search
        UIActions.click(nessHome.getBtnSearch());
    }

    @Step("business flow - submit contact form")
    public static void submitContactForm(String firstName, String lastName, String phone, String email, String company, String position, String comments) {
        UIActions.updateText(contactUsPage.getTxtFirstName(), firstName);
        UIActions.updateText(contactUsPage.getTxtLastName(), lastName);
        UIActions.updateText(contactUsPage.getTxtPhone(), phone);
        UIActions.updateText(contactUsPage.getTxtEmail(), email);
        UIActions.updateText(contactUsPage.getTxtCompany(), company);
        UIActions.updateText(contactUsPage.getTxtPosition(), position);
        UIActions.updateText(contactUsPage.getTxtComments(), comments);
        UIActions.click(contactUsPage.getBtnGoSubmit());
    }

    @Step("business flow - search for jobs")
    public static void searchForJobs(String jobKeyword, String jobLocation) {
        UIActions.updateText(careersPage.getTxtJobKeyword(), jobKeyword);
        UIActions.selectMatOption(careersPage.getDdlJobLocation(), jobLocation);

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("div.card-job-container")
        ));
    }


}

