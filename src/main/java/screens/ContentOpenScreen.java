package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import tests.BaseClass;

public class ContentOpenScreen extends BaseClass {
    AppiumDriver driver;
    public String moviesCardId = "com.example.moviesapp:id/movie_card";
    public String moviesImageId = "com.example.moviesapp:id/movie_image";
    public String moviesTitleId = "com.example.moviesapp:id/movie_title";
    public String moviesReleaseDateId = "com.example.moviesapp:id/movie_release_date";
    public String moviesDescriptionId = "com.example.moviesapp:id/movie_description";

    public ContentOpenScreen(AppiumDriver driver) {
        this.driver = driver;
    }

    WebElement getCardElement(){
        return driver.findElement(By.id(moviesCardId));
    }
    WebElement getImageElement(){
        return driver.findElement(By.id(moviesImageId));
    }
    WebElement getMoviesReleaseDateElement(){
        return driver.findElement(By.id(moviesReleaseDateId));
    }
    WebElement getTitleElement(){
        return driver.findElement(By.id(moviesTitleId));
    }
    WebElement getDescriptionElement() {
        return driver.findElement(By.id(moviesDescriptionId));
    }

    public String getTitleText(){
        return getTitleElement().getText();
    }
    public String getDescriptionText(){
        return getDescriptionElement().getText();
    }
    public String getReleaseDate(){
        return getMoviesReleaseDateElement().getText();
    }

}
