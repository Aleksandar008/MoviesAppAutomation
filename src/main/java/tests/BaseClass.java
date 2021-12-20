package tests;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import screens.ContentOpenScreen;
import screens.MoviesAppHomeScreen;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    AppiumDriver appiumDriver;
    MoviesAppHomeScreen moviesAppHomeScreen;
    ContentOpenScreen contentOpenScreen;

    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        File app = new File("C:/Users/Aleksandar Zahariev/Documents/2Coders Studio", "app-release.apk");
        capabilities.setCapability("app", "C:/Users/Aleksandar Zahariev/Documents/2Coders Studio/app-release.apk");
        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION", "5.0.1");
        capabilities.setCapability("deviceName", "NQL7N16510001940");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability("appPackage", "com.example.moviesapp");
        capabilities.setCapability("appActivity", "com.example.moviesapp.screens.movieslist.MoviesListActivity");

        System.out.println("creating the driver");
        appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        System.out.println("Appium Driver is created");
        moviesAppHomeScreen = new MoviesAppHomeScreen(appiumDriver);
        contentOpenScreen = new ContentOpenScreen(appiumDriver);

    }
}
