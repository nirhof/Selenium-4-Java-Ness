package pageObjects.ness;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage {

    @FindBy(id = "mainFirstName")
    private WebElement txtFirstName;

    @FindBy(id = "mainLastName")
    private WebElement txtLastName;

    @FindBy(id = "mainFormPhone")
    private WebElement txtPhone;

    @FindBy(id = "mainFormEmail")
    private WebElement txtEmail;

    @FindBy(id = "mainFormCompany")
    private WebElement txtCompany;

    @FindBy(id = "mainFormPosition")
    private WebElement txtPosition;

    @FindBy(id = "mainFormComments")
    private WebElement txtComments;

    @FindBy(className = "mainAccSend-btn")
    private WebElement btnGoSubmit;

    @FindBy(className = "thankYouMassage")
    private WebElement lblThankYouMessage;

    // Getters

    public WebElement getTxtFirstName() {

        return txtFirstName;
    }

    public WebElement getTxtLastName() {

        return txtLastName;
    }
    public WebElement getTxtPhone() {

        return txtPhone;
    }

    public WebElement getTxtEmail() {

        return txtEmail;
    }

    public WebElement getTxtCompany() {

        return txtCompany;
    }

    public WebElement getTxtPosition() {

        return txtPosition;
    }

    public WebElement getTxtComments() {

        return txtComments;
    }

    public WebElement getBtnGoSubmit() {

        return btnGoSubmit;
    }

    public WebElement getLblThankYouMessage() {

        return lblThankYouMessage;
    }
}
