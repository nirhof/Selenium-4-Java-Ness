package utilities;
import org.openqa.selenium.support.PageFactory;



public class ManagePages extends Base {

    // Web Pages

    // Method Name : initNess
    // Method Description: Initializes the various pages for the Ness Website.
    public static void initNess(){
        nessHome = PageFactory.initElements(driver, pageObjects.ness.HomePage.class);
        joinUsPage = PageFactory.initElements(driver, pageObjects.ness.JoinUsPage.class);
        contactUsPage = PageFactory.initElements(driver, pageObjects.ness.ContactUsPage.class);
        careersPage = PageFactory.initElements(driver, pageObjects.ness.CareersPage.class);




    }
}
