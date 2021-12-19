package tests;

import org.testng.annotations.Test;

public class TestMoviesContent extends BaseClass{
    @Test
    public void TestMoviesDescription() {
        String titleHomePage = moviesAppHomeScreen.getTitleText();
        String descriptionHomePage = moviesAppHomeScreen.getDescriptionText();
        System.out.println("Title on HomeScreen is: " + titleHomePage);
        System.out.println("Description on HomeScreen is: " + descriptionHomePage);
        moviesAppHomeScreen.clickOnMoviesCard();
        assert titleHomePage.equals(contentOpenScreen.getTitleText());
        System.out.println("Title is the same as home screen and open content screen");
        assert descriptionHomePage.equals(contentOpenScreen.getDescriptionText());
        System.out.println("Description is the same as home screen and open content screen");
    }

}
