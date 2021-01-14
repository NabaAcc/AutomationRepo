package com.genericLibraries;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.Properties;

public class BaseClass extends  FileUtilsClass {
    public static FileUtilsClass fil = new FileUtilsClass();
    public static WebDriver driver;

    @BeforeClass
    public void openBrowser() throws Exception {
        System.out.println("-----------Launching the browser-----------");

        // Properties pData= fil.getPropertyData();
        // browserName=pData.getProperty("BROWSER");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1360,768");
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver(options);
       //  driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        WebDriverUtils.waitForPageLoad(driver);
    }

    @BeforeMethod
    public void loginToApplication() throws IOException {
        System.out.println("-----------Login to the application------------");
        //Declare the property file
        Properties pData = fil.getPropertyData();
        driver.get(pData.getProperty("URL1"));

    }

    @AfterMethod
    public void logoutFromApplication() {
        System.out.println("--------Logout from the application---------");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("-----------Closing the browser------------");
        driver.quit();
    }

}
