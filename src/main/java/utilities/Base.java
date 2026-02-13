package utilities;

import helpers.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Base {


    // General
    protected static WebDriverWait wait;
    protected static Actions actions;
    protected static SoftAssert softAssert;
    protected static Screen screen;
    protected static String platform;
    protected static String filePath = "./Images/";
    protected static ScreenShotHandler screenShot;
    protected static DevTools tool;
    protected static TabsWindowsHandler tabsWindowsHandler;

    // Web
    protected static WebDriver driver;

    // Database
    protected static Connection con;
    protected static Statement stmt;
    protected static ResultSet rs;


    // Page Objects - Web

    protected static pageObjects.ness.HomePage nessHome;
    protected static pageObjects.ness.JoinUsPage joinUsPage;
    protected static pageObjects.ness.ContactUsPage contactUsPage;
    protected static pageObjects.ness.CareersPage careersPage;






}
