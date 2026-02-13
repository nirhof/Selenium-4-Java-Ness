package sanity;

import extensions.UIActions;
import extensions.Verifications;
import helpers.ScreenShotHandler;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.Webflows;

import java.util.List;

public class Ness extends CommonOps {


    @Test(description = "Test01 - Verify search results for a keyword")
    @Description("Validates that searching for a specific keyword returns the expected number of results")
    public void test01_verifySearchForKeyword() {
        // --- Arrange: Prepare data and expected values ---
        String keyword = "אוטומציה";
        String resultNumber = "20";
        // search for keyword in the חיפוש field
        Webflows.searchForKeyword(keyword);
        String expectedResult = "החיפוש שלך עבור " + keyword + " הניב " + resultNumber + " תוצאות";
        // Verify the number of resulted outcome
        Verifications.verifyTextContainedInElement(nessHome.getSearchResult(), expectedResult);
    }

    @Test(description = "Test02 - Verify successful contact form submission")
    @Description("Validates that submitting the contact form displays the correct thank‑you message")
    public void test02_verifySubmitContactFormSucessfully() {
        // Expected thank‑you message after submitting the contact form
        String expectedResult = "תודה על פנייתך והתעניינותך\n" +
                "נחזור אליך בהקדם";
        // Navigate to צרו קשר form
        UIActions.click(nessHome.getContactUsBtn());
        // Submit the contact form
        Webflows.submitContactForm("kuku","lulu","0541234567","test@gmail.com","NESS","Automation","hello");
        // Validate that the thank‑you message matches the expected result
        Verifications.verifyTextInElement(contactUsPage.getLblThankYouMessage(), expectedResult);
    }

    @Test(description = "Test03 - Verify searching for job results")
    @Description("Validates that searching for a job keyword returns the expected number of results")
    public void test03_verifyJob() {
        // click button לעבוד בנס and open a new tab "joinus"
        UIActions.clickAndSwitchToNewTab(nessHome.getBtnWorkAtNess());
        // click המשרות שלנו and open a new tab "careers"
        UIActions.clickAndSwitchToNewTab(joinUsPage.getImgOurJobs());
        // search for job by keyword and filter location
        Webflows.searchForJobs("מנתח/ת מערכות","אזור השפלה");
        List<WebElement> jobResults = careersPage.getLstJobResults();
        // verify number of the searched job results
        Verifications.verifyNumberOfElements(jobResults, 1);
    }

    @Test(description = "Test04 - Verify that the home button displays the Ness logo")
    @Description("Validates that the Ness home button icon matches the expected visual reference")
    public void test04_verifyHomeButtonNessIcon() {

        // capture a screenshot of the home button for the Images Repo
        // screenShot.createElementScreenShot(nessHome.getHomeBtn(), "nessLogo");

        // Verify that the expected Ness logo image appears on screen using visual comparison
        Verifications.visualElement("nessLogo");
    }

    @AfterMethod
    public void afterMethod() {
        driver.get(getData("url")); // Navigate back to the Base URL after each test method execution
    }
}
